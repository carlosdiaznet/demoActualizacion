package sv.gob.cnr.service;

@Urgente
public class MensajeroSMS implements Mensajero {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje por SMS: " + mensaje);
		
	}

}
