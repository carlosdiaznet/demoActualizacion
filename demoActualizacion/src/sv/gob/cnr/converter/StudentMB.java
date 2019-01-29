package sv.gob.cnr.converter;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="studentForm")
@RequestScoped
public class StudentMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Student student; 
	
	
	public String changeStudentData(){
		System.out.println("funcion student");
		this.student.setName(this.student.getName().toUpperCase());
		this.student.setCollege(this.student.getCollege().toUpperCase());
		
		//System.out.println(marca.getPrecio());
		
		return "studentform";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	

}
