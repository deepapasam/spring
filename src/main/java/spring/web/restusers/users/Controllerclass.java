package spring.web.restusers.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllerclass {
@ResponseBody	
@RequestMapping("/welcome")
public String helloworld() {
return"hello world";	
}
}
