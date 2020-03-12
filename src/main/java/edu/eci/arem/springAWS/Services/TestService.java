package edu.eci.arem.springAWS.Services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.eci.arem.springAWS.Models.Entity;
import edu.eci.arem.springAWS.Repositories.IDataBaseRepository;


@Component
public class TestService implements ITestServices{
	
	@Autowired
	private IDataBaseRepository dataBaseRepository;
	
	@Override
	public List<Entity> list() throws SQLException {
		return dataBaseRepository.peticion();
	}

	@Override
	public List<Entity> lista(String nombre) throws SQLException {
		// TODO Auto-generated method stub
		return dataBaseRepository.nuevaPeticion(nombre);
	}
}


