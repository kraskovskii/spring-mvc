package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    CarService carService;

//    @Autowired
//    CarsController(CarService carService){
//        this.carService = carService;
//    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {



////        System.out.println(carService.getListCars().);
////        model.addAttribute("messages", "aaaaa");//carService.getCar(0));
//        List<String> messages = new ArrayList<>();
//        messages.add("Hello it is Cars");
//        model.addAttribute("messages", messages);
//        return "index2";
//    }

            List<String> messages = new ArrayList<>();
            messages.add("Hello!");
            messages.add("I'm Spring MVC application");
            messages.add("5.2.0 version by sep'19 ");
            model.addAttribute("messages", "aaaaa");
            return "index2";
        }

}
