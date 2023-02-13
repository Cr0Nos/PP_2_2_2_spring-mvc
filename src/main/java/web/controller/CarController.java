package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
@RequestMapping
public class CarController {
	private final CarService carService = new CarServiceImpl();

	@GetMapping(value = "/cars")
	public String carMapping(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("carList", carService.getListOfCars(count));
		return "cars";
	}
}