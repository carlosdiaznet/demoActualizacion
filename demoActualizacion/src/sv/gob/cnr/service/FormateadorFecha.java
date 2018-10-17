package sv.gob.cnr.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class FormateadorFecha {
	
	@Produces @ElSalvador
	public DateFormat getFormateadorFechaSV(){
		return new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
	}
	
	
	@Produces @Default
	public DateFormat getFormateadorFechaES(){
		return new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
	}
	

}
