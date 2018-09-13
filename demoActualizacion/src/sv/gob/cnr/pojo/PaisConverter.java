package sv.gob.cnr.pojo;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("paisConverter")
public class PaisConverter implements Converter {
	
	//Retorna el objeto completo, recibiendo como parametro el ID o codigo como String
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null){
			Integer codigo = Integer.valueOf(value);
			
			for(Pais pais : PerfilUsuarioMB.PAISES){
				if(codigo.equals(pais.getCodigo())){
					return pais;
				}
			}
		}
		return null;
	}
	
	
	//Retorna como String el codigo del objeto, ingresando el objeto entero como parametro 
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !value.equals("")){
			Pais pais = (Pais) value;
			return String.valueOf(pais.getCodigo());
		}
		return null;
	}

}
