package edu.eci.arem.springAWS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arem.springAWS.Services.ITestServices;

@RestController
public class Controller {
	@Autowired
	ITestServices testService;	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ResponseEntity<?> listAllUsers(){
	    try {
	        return new ResponseEntity<>(testService.list(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("No fue posible realizar la peticion",HttpStatus.NOT_FOUND);
	    }
    }
	
	@RequestMapping(value="/formulario",method = RequestMethod.GET)
	public ResponseEntity<?> formulario(){
	    try {
	        return new ResponseEntity<>("<form action ='formulario' method = 'POST'> <input name = 'nombre' type = 'text' placeholder = 'nombre'/> <input type= 'submit'/></form>",HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("No fue posible realizar la peticion",HttpStatus.NOT_FOUND);
	    }
    }
	
	@RequestMapping(value="/formulario",method = RequestMethod.POST)
	public ResponseEntity<?> formularioPOST(@RequestBody String nombre ){
	    try {
	        return new ResponseEntity<>(testService.lista(nombre.split("=")[1]),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("No fue posible realizar la peticion",HttpStatus.NOT_FOUND);
	    }
    }
}