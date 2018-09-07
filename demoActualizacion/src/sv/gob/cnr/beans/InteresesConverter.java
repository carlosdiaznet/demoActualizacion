package sv.gob.cnr.beans;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("interes")
public class InteresesConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null){
			for(Intereses intereses : PerfilUsuarioMB.INTERESES){
				if(value.equals(intereses.getNombreIcono())){
					return intereses;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null){
			Intereses interes = (Intereses) value;
			return interes.getNombreIcono();
		}
		return null;
	}
	
}
