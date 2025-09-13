package pe.edu.utp.grupo01.serviciosmoroni.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InicioControlador {

    @GetMapping("/inicio")
    public String index(){
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto(){
        return "contacto";
    }

    @GetMapping("/empresa")
    public String empresa(){
        return "empresa";
    }

    @GetMapping("/galeria")
    public String galeria(){
        return "galeria";
    }

    @GetMapping("/servicios")
    public String servicios(){
        return "servicios";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
