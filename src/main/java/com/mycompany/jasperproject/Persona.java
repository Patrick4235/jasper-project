
package com.mycompany.jasperproject;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidos;
    private String telefono;
    private Date fechaNacimiento;
    private String direccion;
    private String correoElectronico;
    
    public Persona(){
        this(null, null);
    }
    
    public Persona (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = "99999";
        this.fechaNacimiento = new Date();
        this.direccion = "direccionxd";
        this.correoElectronico = "correo@";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    

}
