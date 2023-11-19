
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Prestamo {


    private Integer idPrestamo;
    private LocalDate fecha;
    private LocalDate vencimiento;
    private Socio socio;
    private Ejemplar ejemplar;
    private StatePrestamo estadoPrestamo;
    private LocalDate fechaEntregado;
    private List<ObserverPrestamo> observadores;

    public Prestamo() {
    }

    public boolean verificarPlazo() {
        // TODO implement here
        return false;
    }

    public void notificar() {
        // TODO implement here
    }

    public void alertarCercaniaVencimiento() {
        // TODO implement here
    }

    public void agregarObservador(ObserverPrestamo observador) {
        // TODO implement here
    }

    public void eliminarObservador(ObserverPrestamo observador) {
        // TODO implement here
    }

}