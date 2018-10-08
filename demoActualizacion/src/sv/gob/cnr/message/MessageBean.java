package sv.gob.cnr.message;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="messageBean")
@RequestScoped
public class MessageBean {
	
	public void adicionarMensajeError(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Resumen de mensaje de error", "Mensaje de error completo");
		
		context.addMessage("destinoError", msg);
	}
	
	public void adicionarMensajeAviso(){
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Resumen de mensaje de error", "Mensaje de error completo");
		
		context.addMessage(null, msg);
	}
}
