package bookstore.controller;

import java.util.ArrayList;
import java.util.List;
import bookstore.model.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
	
	@RequestMapping("/index")
	public String index(){
		return "/index";
	}
}




