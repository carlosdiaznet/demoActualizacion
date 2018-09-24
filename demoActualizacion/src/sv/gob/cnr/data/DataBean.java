package sv.gob.cnr.data;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dataBean")
@ViewScoped
public class DataBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Date getDateActual(){
		return new Date();
	}
	

}
