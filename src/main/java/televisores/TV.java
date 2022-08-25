package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	//metodos get
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	//metodos set
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if (this.volumen < 0 || this.volumen > 7) {
			return;
		}
		this.volumen = volumen;
	}
	
	public void setCanal(int canal) {
		if (this.canal < 0 || this.canal > 120) {
			return;
		}
		this.canal = canal;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	//metodos
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if (this.estado == false) {
			return;
		}
		
		if (this.canal < 0 || this.canal > 120) {
			return;
		}
		
		this.canal++;
	}
	
	public void canalDown() {
		if (this.estado == false) {
			return;
		}
		
		if (this.canal < 0 || this.canal > 120) {
			return;
		}
		
		this.canal--;
	}
	
	public void volumenUp() {
		if (this.estado == false) {
			return;
		}
		
		if (this.volumen < 0 || this.volumen > 7) {
			return;
		}
		
		this.volumen++;
	}
	
	public void volumenDown() {
		if (this.estado == false) {
			return;
		}
		
		if (this.volumen < 0 || this.volumen > 7) {
			return;
		}
		
		this.volumen--;
	}
}
