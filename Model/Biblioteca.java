import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Ejemplar> ejemplares;
    private List<Socio> socios;
    private List<Bibliotecario> empleados;

    public Biblioteca(){

    }

    public void agregarEjemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
    }

    public void eliminarEjemplar(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
    }

    public void agregarSocio(Socio socio){
        socios.add(socio);
    }

    public void eliminarSocio(Socio socio){
        socios.remove(socio);
    }

    public void agregarEmpleado(Bibliotecario empleado){
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Bibliotecario empleado){
        empleados.remove(empleado);
    }
}