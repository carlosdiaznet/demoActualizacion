package sv.gob.cnr.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.sun.el.parser.ParseException;

@ManagedBean(name="funcionarioBean")
@ViewScoped
public class FuncionarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String[] nombres = { "Andrea", "Dina", "Juan", "Fernanda", "Esther", "Carlos" };
	private static final String[] apellidos = { "Diaz", "Cordova", "Garcia", "Hernandez", "Rivera", "Deras" };
	
	private List<Funcionario> funcionarios;
	
	public FuncionarioBean() throws ParseException {
		funcionarios = new ArrayList<Funcionario>();
		for(int i=0;i<50;i++){
			adicionarFuncionario();
		}
	}
	
	private void adicionarFuncionario(){
		String nombreCompleto = getNombreAleatorio() + " " + getNombreAleatorio() + " " + getApellidoAleatorio();
		funcionarios.add(new Funcionario(getMatriculaAleatoria(), nombreCompleto, getFechaAleatoria(), getSalarioAleatorio()));
	}
	
	private BigDecimal getSalarioAleatorio(){
		return new BigDecimal(1000 + (Math.random() * 29000));
	}
	
	private Long getMatriculaAleatoria(){
		return (long) (Math.random() * 1000);
	}
	
	private Date getFechaAleatoria(){
		long diezAniosEnMillis = 24 * 60 * 60 * 1000;
		long periodoSorteadoEnMillis = ((long) (Math.random() * 10 * 365)) * diezAniosEnMillis;
		return new Date(System.currentTimeMillis() - periodoSorteadoEnMillis);
	}
	
	private String getApellidoAleatorio(){
		int posicion = (int) Math.round(Math.random() * (apellidos.length -1));
		return apellidos[posicion];
	}
	
	private String getNombreAleatorio(){
		int posicion = (int) Math.round(Math.random() * (nombres.length -1));
		return nombres[posicion];
	}
	
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
}
