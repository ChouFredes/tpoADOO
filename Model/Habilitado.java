
import java.util.*;


public class Habilitado implements StateCuenta {

    private Socio socio;
    private Date fechaLimiteDevolucion;

    public Habilitado(Socio socio) {
        this.socio = socio;
        this.fechaLimiteDevolucion = fechaLimiteDevolucion;
    }

    public void HabilitarCuenta() {
        System.out.println("La cuenta ya está habilitada.");
    }

    public void BloquearCuenta() {
        socio.setStateCuenta(new Bloqueado(socio));
        System.out.println("Bloqueando la cuenta.");
    }
}