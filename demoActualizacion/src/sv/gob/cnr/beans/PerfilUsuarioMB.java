package sv.gob.cnr.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioMB")
@ViewScoped
public class PerfilUsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final List<Intereses> INTERESES = new ArrayList<Intereses>();
	
	
	static {
		INTERESES.add(new Intereses("Deportes", "005-pagina"));
		INTERESES.add(new Intereses("Computacion", "001-controlar"));
		INTERESES.add(new Intereses("Entretenimiento", "002-campana"));
		INTERESES.add(new Intereses("Investigacion", "004-investigacion"));
	}
	
	private List<String> estados = new ArrayList<String>();
	private List<String> ciudades = new ArrayList<String>();
	private List<String> jobies;
	private List<String> paises = new ArrayList<String>();
	
	private String login;
	private String password;
	private String nombre;
	private String asunto;
	private Date fechaNacimiento;
	private String profesion;
	private Intereses interes;
	private String estado;
	private String ciudad;
	private String sexo;
	private String estadoCivil;
	private String pais;
	
	
	
	public PerfilUsuarioMB() {
		estados.add("SS");
		estados.add("SM");
		estados.add("SV");
		paises.add("El Salvador");
		paises.add("Guatemala");
		paises.add("Honduras");
		paises.add("Nicaragua");
		paises.add("Costa Rica");
		paises.add("Panama");
	}

	public void actualizar(){
		System.out.println("Password: " + this.password);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar2(){
		System.out.println("Asunto: " + this.asunto);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar3(){
		System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar4(){
		System.out.println("Profesion: " + this.profesion);
		System.out.println("Intereses: " + this.interes.getDescripcion());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar5(){
		System.out.println("Profesion: " + this.profesion);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar6(){
		System.out.println("Intereses: " + this.interes.getDescripcion());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar7(){
		System.out.println("Estado: " + this.estado);
		System.out.println("Ciudad: " + this.ciudad);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void cargarCiudades(){
		ciudades.clear();
		if("SS".equals(estado)){
			ciudades.add("San Marcos");
			ciudades.add("Santa Elena");
			ciudades.add("Escalon");
		} else if ("SM".equals(estado)){
			ciudades.add("Arequipe");
			ciudades.add("Ostuma");
			ciudades.add("Quezalte");
		} else if("SV".equals(estado)){
			ciudades.add("San Vicente");
			ciudades.add("San Felipe");
			ciudades.add("Ocote");
		}
	}
	
	public void actualizar8(){
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Estado civil: " + this.estadoCivil);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar9(){
		for(String jobie : jobies){
			System.out.println("Interes: " + jobie);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	
	
	public void actualizar10(){
		
			System.out.println("Pais: " + this.pais);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public List<String> sugerirPaises(String consulta){
		List<String> paisesSugeridos = new ArrayList<String>();
		for(String pais : this.paises){
			if(pais.toLowerCase().startsWith(consulta.toLowerCase())){
				paisesSugeridos.add(pais);
			}
		}
		return paisesSugeridos;
	}
	
	public List<Intereses> getIntereses(){
		return INTERESES;
	}
	
	public Date getFechaHora(){
		return new Date();
	}
	
	public List<String> completarTexto(String consulta){
		List<String> resultados = new ArrayList<String>();
		
		if(consulta.startsWith("Jua")){
			resultados.add("Juan");
			resultados.add("Juan Carlos");
			resultados.add("Juan Carlos Diaz");
			resultados.add("carlosdiaznet");
		}
		
		return resultados;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Intereses getInteres() {
		return interes;
	}

	public void setInteres(Intereses interes) {
		this.interes = interes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public List<String> getJobies() {
		return jobies;
	}

	public void setJobies(List<String> jobies) {
		this.jobies = jobies;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
