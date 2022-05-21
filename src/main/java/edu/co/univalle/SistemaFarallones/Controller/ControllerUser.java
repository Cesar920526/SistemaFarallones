package edu.co.univalle.SistemaFarallones.Controller;

import edu.co.univalle.SistemaFarallones.Model.Usuario;
import edu.co.univalle.SistemaFarallones.Service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControllerUser {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String inicio(Model model){
        var usuarios = usuarioService.listaUsuarios();
        log.info("Ejecutando Spring MVC");
        model.addAttribute("usuarios", usuarios);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregarUsuarios(Usuario usuario){
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuario){
        usuarioService.guardar(usuario);
        return "redirect:/";
    }
}
