package main;

import utilidades.Utilidades;

import java.util.HashMap;

import clases.*;
public class GestionDeVentas {

	public static void main(String[] args) {
		HashMap <String, Articulo> prod=new HashMap <String, Articulo>();
		int menu=menu();
		
		switch (menu) {
		case 1:
			venta(prod);
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 6:
			
			break;
			
		case 7:
			
			break;
			
		case 0:
			System.out.println("Adios!");
		}
	}
	
	public static int menu() {
		System.out.println("1. Realizar una venta (crear factura)");
		System.out.println("2. Listar articulos");
		System.out.println("3. Listar articulos sanos");
		System.out.println("4. Pedir un codigo y mostrar los articulos que tienen el precio equivalente del articulo");
		System.out.println("5. Listar los productos mas caros");
		System.out.println("6. Listar los productos con stock bajo");
		System.out.println("7. Pedir codigo de articulo y aumentar stock");
		System.out.println("0. Salir");
		return Utilidades.leerInt(0,7);
	}
	
	public static void venta(HashMap <String, Articulo> prod) {
		
	}
}
