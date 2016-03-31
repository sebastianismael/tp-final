package ar.edu.unlam.tallerweb.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controladorsanguchetto {

    @RequestMapping("/hola")
    public String irAformulario(){
        return "formulario";
    }
    
    @RequestMapping("/recibir")
    public String recibirMensaje(String mensaje ,Model model){
        
        model.addAttribute("mensaje", mensaje);
        return "verMensaje";
    }
}
