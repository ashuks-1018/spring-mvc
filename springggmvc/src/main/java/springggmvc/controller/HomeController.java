package springggmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("This is home url");

		model.addAttribute("name", "Tommy Shelby");
		model.addAttribute("year", 1919);

		List<String> bros = new ArrayList<String>();
		bros.add("Arthur");
		bros.add("John");
		bros.add("Finn");
		model.addAttribute("b", bros);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("This is help controller");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Peaky Blinders");

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(57);
		modelAndView.addObject("marks", list);

		modelAndView.setViewName("help");

		return modelAndView;
	}

}
