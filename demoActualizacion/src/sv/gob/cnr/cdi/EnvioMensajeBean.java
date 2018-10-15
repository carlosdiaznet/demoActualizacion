package sv.gob.cnr.cdi;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

import sv.gob.cnr.service.Mensajero;
import sv.gob.cnr.service.Urgente;

@Named("envioMensajeBean")
@RequestScoped
public class EnvioMensajeBean {
	
	
	@Inject @Urgente //@Default
	private Mensajero mensajero;
	
	private String texto;
	
	public void enviarMensaje(){
		mensajero.enviarMensaje(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
