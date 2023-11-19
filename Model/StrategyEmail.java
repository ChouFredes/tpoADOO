
public class StrategyEmail implements StrategyComunicacion {

    private String direccionEmail;

    public StrategyEmail(String direccionEmail) {
        this.direccionEmail = direccionEmail;
    }

    @Override
    public void comunicarVencimiento(String mensaje) {
        // Lógica específica de comunicación a través de Email
        System.out.println("Enviando mensaje por Email a la dirección " + direccionEmail + ": " + mensaje);
    }
}