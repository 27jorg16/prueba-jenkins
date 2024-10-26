package pe.edu.cibertec.grupoJJ_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/panaderia")
public class PanaderiaController {

    @GetMapping
    public String panaderiaJenkins(){
        return "Hola, bienvenidos a nuestra panadería";
    }
}
