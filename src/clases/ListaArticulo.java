package clases;
import java.util.ArrayList;

public class ListaArticulo {
	private ArrayList <Articulo> list;

	public ListaArticulo(ArrayList<Articulo> list) {
		this.list = list;
	}

	public ArrayList<Articulo> getList() {
		return list;
	}

	public void setList(ArrayList<Articulo> list) {
		this.list = list;
	}
	
	public void fillData() {
		list.add(new Vino("a1", "Bilbao", "Ramon Bilbao", 8.5, 100, "Tinto", "Rioja", 1990, "Garnacha"));
		list.add(new Vino("a2", "Banda Azul", "Paternina", 6.5, 75, "Tinto", "Rioja", 2001, "Garnacha"));
		list.add(new Vino("a3", "Ramon Bilbao", "Bodegas Bilbao", 5.0, 30, "Tinto", "Rioja", 1997, "Garnacha"));
		list.add(new Refresco("a9", "Naranja", "Fanta", 1.5, 64, "Cola", false, true, 50));
		list.add(new Refresco("a10", "Zumo piña", "Juver", 1.0, 40, "piña", true, false, 40));
		list.add(new Refresco("a11", "Zumo manzana", "Juver", 1.5, 64, "Cola", false, true, 35));
	}
	
	public ArrayList <Articulo> reponer() {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getStock()<50) {
				list.get(i).setStock(list.get(i).SumarStock(25));
			}
		}
		return list;
	}
	
	public ArrayList <Articulo> masCaro() {
		ArrayList <Articulo> caro=new ArrayList <Articulo>();
		int c=0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getPrice()>c) {
				c=i;
			}
		}
		caro.add(list.get(c));
 		return caro;
	}
	
	public ArrayList <Articulo> equivalentes(String code) {
		double price=0;
		ArrayList <Articulo> equiv=new ArrayList <Articulo>();
		for (Articulo a:list) {
			if (a.getCode().equalsIgnoreCase(code)) {
				price=a.getPrice();
			}
		}
		
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getPrice()==price) {
				equiv.add(list.get(i));
			}
		}
		return equiv;
	}
	
	public double precio(String code) {
		double price=0;
		for (Articulo a:list) {
			if (a.getCode().equalsIgnoreCase(code)) {
				price=a.getPrice();
			}
		}
		return price;
	}
}
