package sv.gob.cnr.converter;

import java.util.List;

public class MarcaRepository {
	private List<Marca> listMarca;
	private Marca marca = new Marca();
	
	public MarcaRepository() {
		this.marca.setId(1);
		this.marca.setMarca("HP");
		this.marca.setCantidad(15);
		this.marca.setPrecio(24.36);
		this.listMarca.add(marca);
		marca = new Marca();
		this.marca.setId(2);
		this.marca.setMarca("DELL");
		this.marca.setCantidad(25);
		this.marca.setPrecio(34.36);
		this.listMarca.add(marca);
		marca = new Marca();
		this.marca.setId(3);
		this.marca.setMarca("TOSHIBA");
		this.marca.setCantidad(5);
		this.marca.setPrecio(14.36);
		this.listMarca.add(marca);
		marca = new Marca();
		this.marca.setId(4);
		this.marca.setMarca("LENOVO");
		this.marca.setCantidad(19);
		this.marca.setPrecio(25.68);
		this.listMarca.add(marca);
	}
	
	public List<Marca> getListMarca() {
		return listMarca;
	}
	
	public void setListMarca(List<Marca> listMarca) {
		this.listMarca = listMarca;
	}
	
	
	
	
}
