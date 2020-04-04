package guru.spring.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pets")
public class PetController {

    @RequestMapping({"", "/", "/index"})
    public String index(){
        return "pets/index";
    }
}
