package sv.gob.cnr.cdi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import sv.gob.cnr.service.ElSalvador;

@Named
@RequestScoped
public class FormateoBean {
	
	//private DateFormat formatoDato = new SimpleDateFormat("dd-MMMM-yyyy");
	@Inject @ElSalvador
	private DateFormat formatoDato;
	
	private Date datoDesconocido;
	private String datoFormato;
	
	public void enviar(){
		this.datoFormato = formatoDato.format(datoDesconocido);
	}

	public Date getDatoDesconocido() {
		return datoDesconocido;
	}

	public void setDatoDesconocido(Date datoDesconocido) {
		this.datoDesconocido = datoDesconocido;
	}

	public String getDatoFormato() {
		return datoFormato;
	}
	
	
}
