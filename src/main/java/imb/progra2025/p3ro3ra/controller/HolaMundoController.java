package imb.progra2025.p3ro3ra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	@GetMapping("/holamundo")
	public String holaMundo(){
		return "Hola mundo!";
	}

}
