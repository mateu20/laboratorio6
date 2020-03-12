package edu.eci.arem.springAWS.Repositories;

import java.sql.SQLException;
import java.util.*;

import edu.eci.arem.springAWS.Models.Entity;


public interface IDataBaseRepository {
    public List<Entity> peticion() throws SQLException ;
    public List<Entity> nuevaPeticion(String nombre) throws SQLException ;
    
}