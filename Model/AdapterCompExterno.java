
import java.io.*;
import java.util.*;

public class AdapterCompExterno implements Adapter {
    public AdapterCompExterno() {
    }

    public void llamarCompExterno() {
        System.out.println("Llamé al componente externo");
    }

    public void adaptar(Integer idEjemplar) {
    	double numeroAleatorio = Math.random();

        int numeroPiso = (int) (numeroAleatorio * 7) + 1;
        int numeroColumna = (int) (numeroAleatorio * 50) + 1;
        int numeroFila = (int) (numeroAleatorio * 10) + 1;
        System.out.println("El libro se encuentra en piso: " + numeroPiso + "Columna: " + numeroColumna + "Fila: " + numeroFila);
    }

}