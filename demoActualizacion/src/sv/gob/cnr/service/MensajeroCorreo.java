package sv.gob.cnr.service;

import javax.enterprise.inject.Default;

@Default
public class MensajeroCorreo implements Mensajero {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje por correo: " + mensaje);
		
	}

}
