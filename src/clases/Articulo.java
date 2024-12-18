package clases;

public abstract class Articulo {
	protected String code;
	protected String name;
	protected String brand;
	protected double price;
	protected int stock;
	
	public Articulo(String code, String name, String brand, double price, int stock) {
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Codigo: "+code+", Nombre: "+name+", Marca: "+brand+", Precio: "+price+", Stock: "+stock+"";
	}
	
	public int SumarStock(int stock) {
		return this.stock+stock;
	}
	
	public int QuitarStock(int stock) {
		return this.stock-stock;
	}
	
	public abstract void printCaracteristicas();
	public abstract boolean sano();
}
