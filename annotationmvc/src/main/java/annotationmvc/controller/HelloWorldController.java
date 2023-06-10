package annotationmvc.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import annotationmvc.model.HelloWorld;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/helloworld")
	public String handler(Model model, HttpServletRequest request) {
		
		HelloWorld hw = new HelloWorld();
		
		hw.setMessage("Hello I am here");
		hw.setDateTime(LocalDateTime.now().toString());
		
		model.addAttribute("hw", hw);
		return "helloworld";
	}
}
