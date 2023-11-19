
import java.util.*;

/**
 * 
 */
public abstract class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private Integer dni;

    /**
     * 
     */
    private String mail;

    /**
     * 
     */
    private Integer telefono;

    /**
     * 
     */
    private String contrasenia;

    /**
     * 
     */
    private Adapter adapter;

    /**
     * 
     */
    private StateCuenta estado;

    /**
     * @param idEjemplar 
     * @return
     */
    public Ejemplar buscarEjemplar(Integer idEjemplar) {
        // TODO implement here
        return null;
    }

    /**
     * @param estato 
     * @return
     */
    public void cambiarEstado(StateCuenta estato) {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public void verHistorialPrestamos() {
        // TODO implement here
        return;
    }

}