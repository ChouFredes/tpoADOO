
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Prestamo {

    /**
     * Default constructor
     */
    public Prestamo() {
    }

    /**
     * 
     */
    private Integer idPrestamo;

    /**
     * 
     */
    private LocalDate fecha;

    /**
     * 
     */
    private LocalDate vencimiento;

    /**
     * 
     */
    private Socio socio;

    /**
     * 
     */
    private Ejemplar ejemplar;

    /**
     * 
     */
    private StatePrestamo estadoPrestamo;

    /**
     * 
     */
    private LocalDate fechaEntregado;

    /**
     * 
     */
    private List<ObserverPrestamo> observadores;

    /**
     * @return
     */
    public boolean verificarPlazo() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void notificar() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void alertarCercaniaVencimiento() {
        // TODO implement here
        return;
    }

    /**
     * @param observador 
     * @return
     */
    public void agregarObservador(ObserverPrestamo observador) {
        // TODO implement here
        return;
    }

    /**
     * @param observador 
     * @return
     */
    public void eliminarObservador(ObserverPrestamo observador) {
        // TODO implement here
        return;
    }

}