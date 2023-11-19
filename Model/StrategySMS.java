
public class StrategySMS implements StrategyComunicacion {


    private String numeroTelefono;

    public StrategySMS(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void comunicarVencimiento(String mensaje) {
        // Lógica específica de comunicación a través de SMS
        System.out.println("Enviando mensaje por SMS al número " + numeroTelefono + ": " + mensaje);
    }
}

