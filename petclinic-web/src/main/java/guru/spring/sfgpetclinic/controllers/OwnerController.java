package guru.spring.sfgpetclinic.controllers;

import guru.spring.sfgpetclinic.models.Owner;
import guru.spring.sfgpetclinic.services.OwnerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/", "index"})
    public String index(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @GetMapping("/json")
    public ResponseEntity<Set<Owner>> getAll(){
        return ResponseEntity.ok(ownerService.findAll());
    }

}
