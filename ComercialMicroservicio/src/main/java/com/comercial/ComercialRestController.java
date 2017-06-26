package com.comercial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comercial")
public class ComercialRestController {
	
	private final String EXITO = "Exito al guardar";
    @Autowired
    private ComercialDAO comercialDao;
	
    @RequestMapping(path="/nuevo", method = RequestMethod.POST )
	public String guardarComercial(@RequestBody Comercial comercial){
		comercialDao.save(comercial);
		return EXITO;
	}
    @RequestMapping(path="/cargar/{id}", method = RequestMethod.GET)
    public Comercial cargarcomercial(@PathVariable Long id){
    	Comercial c = new Comercial();
    	c = comercialDao.findOne(id);
    	return c;
    }
  
}
