package sv.gob.cnr.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FormateadorFecha {
	public DateFormat getFormateadorFechaES(){
		return new SimpleDateFormat("dd 'de' MMMM 'de' YYYY", new Locale("es", "US"));
	}

}
