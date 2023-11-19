
public class StrategyWhatsApp implements StrategyComunicacion {

    private String numeroTelefono;

    public StrategyWhatsApp(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void comunicarVencimiento(String mensaje) {
        // Lógica específica de comunicación a través de WhatsApp
        System.out.println("Enviando mensaje por WhatsApp al número " + numeroTelefono + ": " + mensaje);
    }

}