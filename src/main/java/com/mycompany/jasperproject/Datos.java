package com.mycompany.jasperproject;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
        

public class Datos {
    
    public static Collection<Persona> generaDatosPersona(){
        List<Persona> result = new LinkedList<>();
        result.add(new Persona("Hola","Adios"));
        result.add(new Persona("Hol2","Adios2"));
        return result;
    }
   
    
}
