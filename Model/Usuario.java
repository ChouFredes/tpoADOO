import java.util.*;

public abstract class Usuario {

	private String nombre;
    private String apellido;
    private Integer dni;
    private String mail;
    private Integer telefono;
    private String contrasenia;
    private Adapter adapter;
    private StateCuenta estado;
    
	public Usuario() {
    }

    public Ejemplar buscarEjemplar(Integer idEjemplar) {
        // TODO implement here
        return null;
    }

    public void cambiarEstado(StateCuenta estato) {
        // TODO implement here
        return;
    }

    public void verHistorialPrestamos() {
        // TODO implement here
        return;
    }

}