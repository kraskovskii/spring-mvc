package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            ModelMap model) {
        if (count == null || count < 0){
            count = 5;
        }
        System.out.println("count = "+ count);
        model.addAttribute("cars", carService.getFilterCar(carService.getListCars(), count));
        return "cars";
    }
}