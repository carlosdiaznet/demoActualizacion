package sv.gob.cnr.converter;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("marcaconverter")
public class MarcaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		ValueExpression vex = context.getApplication()
				.getExpressionFactory()
					.createValueExpression(context.getELContext(), "#{marcaMB}", MarcaMB.class);
		MarcaMB marcas = (MarcaMB)vex.getValue(context.getELContext());
		return marcas.getMarca(Integer.valueOf(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value == null){
			return null;
		}
		return ((Marca) value).getId().toString();
	}

}
