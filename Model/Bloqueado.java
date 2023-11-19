
import java.io.*;
import java.util.*;


public class Bloqueado implements StateCuenta {

    private Socio socio;

    public Bloqueado(Socio socio){
        this.socio = socio;
    }

    public void HabilitarCuenta() {
        socio.setStateCuenta(new Habilitado(socio));
        System.out.println("Habilitando la cuenta.");
    }

    public void BloquearCuenta() {
        System.out.println("La cuenta ya está bloqueada.");
    }
}

