package clases;

public class Vino extends Articulo {
	private String colour;
	private String origin;
	private int year;
	private String grape;
	public Vino(String c, String n, String b, double p, int s, String colour, String o, int y, String g) {
		super(c,n,b,p,s);
		this.colour=colour;
		this.origin=o;
		this.year=y;
		this.grape=g;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getGrape() {
		return grape;
	}
	
	public void setGrape(String grape) {
		this.grape = grape;
	}
	
	@Override
	public String toString() {
		return "Vino [colour=" + colour + ", origin=" + origin + ", year=" + year + ", grape=" + grape + ", toString()="+ super.toString() + "]";
	}

	@Override
	public void printCaracteristicas() {
		
	}

	@Override
	public boolean sano() {
		
		return false;
	}
}
