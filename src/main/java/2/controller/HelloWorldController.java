package 2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld.do")
	public String todoList(Model model) {
		model.addAttribute("groupId","2");
		model.addAttribute("artifactId","23");
		return "/helloWorld";
	}
}
