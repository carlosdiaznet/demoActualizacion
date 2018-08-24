package sv.gob.cnr.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="listas")
@ViewScoped
public class Listas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
	private String pais;
	private String ciudad;
	private Map<String, String> paises;
	private Map<String, String> ciudades;
	
	@PostConstruct
	public void init(){
		paises = new HashMap<String, String>();
		paises.put("USA", "USA");
		paises.put("El Salvador", "El Salvador");
		paises.put("JAPON", "JAPON");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("NEW YORK", "NEW YORK");
		map.put("LOS ANGELES", "LOS ANGELES");
		map.put("SAN DIEGO", "SAN DIEGO");
		data.put("USA", map);
		
		map = new HashMap<String, String>();
		map.put("SAN SALVADOR", "SAN SALVADOR");
		map.put("SAN MARCOS", "SAN MARCOS");
		map.put("SAN VICENTE", "SAN VICENTE");
		data.put("EL SALVADOR", map);
		
		map = new HashMap<String, String>();
		map.put("TOKIO", "TOKIO");
		map.put("HIROSHIMA", "HIROSHIMA");
		map.put("NAGASAKI", "NAGASAKI");
		data.put("JAPON", map);
		
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Map<String, Map<String, String>> getData() {
		return data;
	}

	public Map<String, String> getPaises() {
		return paises;
	}

	public Map<String, String> getCiudades() {
		return ciudades;
	}
	
	public void onPaisChange(){
		if(pais != null && !pais.equals("")){
			ciudades = data.get(pais);
		} else {
			ciudades = new HashMap<String, String>();
		}
	}
	
	public void displayLocation(){
		FacesMessage msg;
		if(ciudad != null && pais != null){
			msg = new FacesMessage("Seleccionado", ciudad + " de " + pais);
		} else {
			msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalido", "Ciudad no seleccionada");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
}
