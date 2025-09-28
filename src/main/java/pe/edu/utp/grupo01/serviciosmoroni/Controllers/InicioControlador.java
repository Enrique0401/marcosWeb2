package pe.edu.utp.grupo01.serviciosmoroni.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InicioControlador {

    @GetMapping({ "/inicio", "/" })
    public String index(Model model) {
        model.addAttribute("currentPage", "inicio");
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("currentPage", "contacto");
        return "contacto";
    }

    @GetMapping("/empresa")
    public String empresa(Model model) {
        model.addAttribute("currentPage", "empresa");
        return "empresa";
    }

    @GetMapping("/galeria")
    public String galeria(Model model) {
        model.addAttribute("currentPage", "galeria");
        return "galeria";
    }

    @GetMapping("/servicios")
    public String servicios(Model model) {
        model.addAttribute("currentPage", "servicios");
        return "servicios";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("currentPage", "login");
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("currentPage", "register");
        return "register";
    }

    @GetMapping("/proyectos")
    public String proyectos(Model model) {
        model.addAttribute("currentPage", "proyectos");
        return "proyectos";
    }

    @GetMapping("/solicitar")
    public String solicitar(Model model) {
        model.addAttribute("currentPage", "solicitar");
        return "solicitar";
    }

    @GetMapping("/seguimiento")
    public String seguimiento(Model model) {
        model.addAttribute("currentPage", "seguimiento");
        return "seguimiento";
    }

    @GetMapping("/seguimiento/{id}")
    public String seguimiento(@PathVariable("id") Long id, Model model) {
        model.addAttribute("currentPage", "seguimiento");
        model.addAttribute("proyectoId", id);
        return "seguimiento";
    }

    @GetMapping("/incidencias")
    public String incidencias(Model model) {
        model.addAttribute("currentPage", "incidencias");
        return "incidencias";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        model.addAttribute("currentPage", "perfil");

        Map<String, String> usuario = new HashMap<>();
        usuario.put("nombre", "Diego Pérez");
        usuario.put("email", "diego@utp.edu.pe");
        usuario.put("telefono", "+51 987 654 321");
        usuario.put("direccion", "Av. Primavera 123, Lima");
        usuario.put("fechaRegistro", "15/08/2024");
        usuario.put("rol", "Cliente");

        model.addAttribute("usuario", usuario);

        return "perfil";
    }
}
