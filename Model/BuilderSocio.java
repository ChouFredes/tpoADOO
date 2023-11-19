
import java.io.*;
import java.util.*;


public class BuilderSocio implements BuilderUsuario {

    private Socio socio = new Socio();

    public BuilderSocio() {
    }

    public Socio getUsuario() {
        return socio;
    }


    public BuilderUsuario asignarNombre(String nombre) {
        socio.setNombre(nombre);
        return this;
    }


    public BuilderUsuario asignarApellido(String apellido) {
        socio.setApellido(apellido);
        return this;
    }


    public BuilderUsuario asignarDni(Integer dni) {
        socio.setDni(dni);
        return this;
    }


    public BuilderUsuario asignarMail(String mail) {
        socio.setMail(mail);
        return this;
    }


    public BuilderUsuario asignarTelefono(Integer telefono) {
        socio.setTelefono(telefono);
        return this;
    }


    public BuilderUsuario asignarContrasenia(String pass) {
        socio.setContrasenia(pass);
        return this;
    }


    public void asignarMedioComunicacion() {
        // TODO implement BuilderUsuario.asignarMedioComunicacion() here
    }

    public Usuario build(){
        return socio;
    }



}