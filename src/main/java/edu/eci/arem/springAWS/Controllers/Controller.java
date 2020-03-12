package edu.eci.arem.springAWS.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}