
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Socio extends Usuario {

    private StateCuenta stateCuenta;
    private StrategyComunicacion comunicacion;
    private LocalDate fechaLimiteDevolucion;
    private Boolean tengoPremio;
    private List<Prestamo> prestamos;
    private StrategyComunicacion strategyComunicacion;

    public Socio() {
    }

    public void setStrategyComunicacion(StrategyComunicacion strategyComunicacion) {
        this.strategyComunicacion = strategyComunicacion;
    }

    public void seleccionarComunicacionWhatsapp(String numero) {
        this.strategyComunicacion = new StrategyWhatsApp(numero);
    }

    public void seleccionarComunicacionSms(String numeroTelefono) {
        this.strategyComunicacion = new StrategySMS(numeroTelefono);
    }

    public void seleccionarComunicacionEmail(String direccionEmail) {
        this.strategyComunicacion = new StrategyEmail(direccionEmail);
    }

    public void setStateCuenta(StateCuenta nuevoEstado) {
        this.stateCuenta = nuevoEstado;


        if (nuevoEstado instanceof Habilitado) {
            this.fechaLimiteDevolucion = LocalDate.now().plusDays(10);

        }
        else if (nuevoEstado instanceof Bloqueado) {
        }
    }

    public void comunicarVencimiento(String mensaje) {
        if (strategyComunicacion != null) {
            strategyComunicacion.comunicarVencimiento(mensaje);
        } else {
            System.out.println("No se ha especificado una estrategia de comunicación.");
        }
    }

    public void comunicarVencimiento() {
    	//todo
    }

    public void verHistorialPrestamos() {
    	for(Prestamo prestamo: this.prestamos) {
    		System.out.println(prestamo);
    	}
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

	@Override
	public String toString() {
		return "Socio [stateCuenta=" + stateCuenta.getClass().getName() + ", comunicacion=" + comunicacion + ", fechaLimiteDevolucion="
				+ fechaLimiteDevolucion + ", tengoPremio=" + tengoPremio + ", prestamos=" + prestamos
				+ ", strategyComunicacion=" + strategyComunicacion.getClass().getName() + "]";
	}
    
    
}