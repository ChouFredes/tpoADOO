
import java.io.*;
import java.util.*;

public interface BuilderUsuario {

    public BuilderUsuario asignarNombre(String nombre);

    public BuilderUsuario asignarApellido(String apellido);

    public BuilderUsuario asignarDni(Integer dni);

    public BuilderUsuario asignarMail(String mail);

    public BuilderUsuario asignarTelefono(Integer telefono);

    public BuilderUsuario asignarContrasenia(String pass);

    public void asignarMedioComunicacion();

    public Usuario getUsuario();

    public Usuario build();

}