
import java.io.*;
import java.util.*;


public class Director {


    public Director() {
    }


    private BuilderUsuario builder;


    public Usuario crearSocio(BuilderSocio builderSocio,String nombre, String apellido, Integer dni, String mail, Integer telefono, String pass, String medio ) {
        return  builderSocio.
                asignarNombre(nombre).
                asignarApellido(apellido).
                asignarDni(dni).
                asignarMail(mail).
                asignarTelefono(telefono).
                asignarContrasenia(pass).
                build();
    }


    public Usuario crearBibliotecario(BuilderBibliotecario builderBibliotecario,String nombre, String apellido, Integer dni, String mail, Integer telefono, String pass, String medio) {
        return builderBibliotecario.
                asignarNombre(nombre).
                asignarApellido(apellido).
                asignarDni(dni).
                asignarMail(mail).
                asignarTelefono(telefono).
                asignarContrasenia(pass).
                build();
    }

}



