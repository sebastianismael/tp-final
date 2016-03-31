package ar.edu.unlam.tallerweb.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb.modelo.Persona;

@Controller("/hola")
public class ControladorPersonas {

	@RequestMapping("/hi")
	public ModelAndView helloWorld(@RequestParam("nombre") String nombre) {

		String message = "Hola, " + nombre + " !";
		ModelMap model = new ModelMap();
		
		Persona persona = new Persona();
		persona.setNombre("Juan Carlos");
		persona.setApellido("Calabro");
		model.put("persona", persona);

		model.put("message", message);
		return new ModelAndView("saludo", model);
	}

	@RequestMapping("/hola/{nombre}")
	public ModelAndView helloWorld2(@PathVariable String nombre) {

		String message = "Hola, " + nombre + "!";
		ModelMap model = new ModelMap();
		model.put("persona", new Persona());
		model.put("message", message);
		return new ModelAndView("mensaje", model);
	}
	
	@RequestMapping(value = "/saludo", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("persona") Persona persona) {
		ModelMap model = new ModelMap(); 
		model.put("nombre", persona.getNombre());
		model.put("apellido", persona.getApellido());
		model.put("mail", persona.getEmail());
		return new ModelAndView("confirmacion", model);
    }

}
