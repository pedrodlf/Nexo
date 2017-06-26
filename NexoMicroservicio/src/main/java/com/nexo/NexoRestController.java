package com.nexo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nexo")
public class NexoRestController {

	@Autowired
	private NexoDAO nexodao;
	
	@RequestMapping("/guardar/{idcliente}/{idcomercial}")
	public String guardarnexo(@PathVariable(name="idcliente") Long idcliente,
			@PathVariable(name= "idcomercial") Long idcomercial){
		Nexo nexo = new Nexo();
		nexo.setIdCliente(idcliente);
		nexo.setIdComercial(idcomercial);
        nexodao.save(nexo);
        return "Cliente con id "+idcliente+" perteneciente al comecial "+idcomercial+" guadado";
	}
}
