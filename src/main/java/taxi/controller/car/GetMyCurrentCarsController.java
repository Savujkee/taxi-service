package taxi.controller.car;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi.lib.Injector;
import taxi.model.Car;
import taxi.service.CarService;

public class GetMyCurrentCarsController extends HttpServlet {
    private static final String SESSION_ID_PARAM = "id";
    private final Injector injector = Injector.getInstance("taxi");
    private final CarService carService = (CarService) injector
            .getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long driverId = (Long) req.getSession().getAttribute(SESSION_ID_PARAM);
        List<Car> driverCars = carService.getAllByDriver(driverId);
        req.setAttribute("cars", driverCars);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp").forward(req, resp);
    }
}
