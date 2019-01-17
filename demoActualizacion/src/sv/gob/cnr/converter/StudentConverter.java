package sv.gob.cnr.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("stdcon")
public class StudentConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String[] strArr = value.split("-");
		if (strArr.length >= 3) {
			Student student = new Student();
			student.setName(strArr[0]);
			student.setAge(Integer.parseInt(strArr[1]));
			student.setCollege(strArr[2]);
			return student;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null ){
			Student student = (Student)value;
			StringBuffer strBuff = new StringBuffer(student.getName()).append("-");
			strBuff.append(student.getAge()).append("-").append(student.getCollege());
			String studentStr = strBuff.toString();
			return studentStr;
		}
		return null;
	}

}
