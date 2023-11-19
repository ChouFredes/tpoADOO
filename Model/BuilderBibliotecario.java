
import java.io.*;
import java.util.*;

public class BuilderBibliotecario implements BuilderUsuario {

    private Bibliotecario bibliotecario = new Bibliotecario();

    public Bibliotecario getUsuario() {
        return bibliotecario;
    }

    public BuilderUsuario asignarNombre(String nombre) {
        bibliotecario.setNombre(nombre);
        return this;
    }

    public BuilderUsuario asignarApellido(String apellido) {
        bibliotecario.setApellido(apellido);
        return this;
    }

    public BuilderUsuario asignarDni(Integer dni) {
        bibliotecario.setDni(dni);
        return this;
    }


    public BuilderUsuario asignarMail(String mail) {
        bibliotecario.setMail(mail);
        return this;
    }


    public BuilderUsuario asignarTelefono(Integer telefono) {
        bibliotecario.setTelefono(telefono);
        return this;
    }


    public BuilderUsuario asignarContrasenia(String pass) {
        bibliotecario.setContrasenia(pass);
        return this;
    }

    public void asignarMedioComunicacion() {
        // TODO implement BuilderUsuario.asignarMedioComunicacion() here
    }

    public Usuario build(){
        return bibliotecario;
    }

}