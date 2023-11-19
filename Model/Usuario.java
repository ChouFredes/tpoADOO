
import java.io.*;
import java.util.*;


public abstract class Usuario {

    public Usuario() {
    }

    private String nombre;


    private String apellido;


    private Integer dni;


    private String mail;


    private Integer telefono;


    private String contrasenia;


    private Adapter adapter;


    private StateCuenta estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public Ejemplar buscarEjemplar(Integer idEjemplar) {
        // TODO implement here
        return null;
    }

    public void cambiarEstado(StateCuenta estato) {
        // TODO implement here
    }


    public void verHistorialPrestamos() {
        // TODO implement here
    }

}