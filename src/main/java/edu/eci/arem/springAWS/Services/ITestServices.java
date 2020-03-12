package edu.eci.arem.springAWS.Services;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;

import edu.eci.arem.springAWS.Models.Entity;

@Service
public interface ITestServices {

    public List<Entity> list() throws SQLException;
	
}
