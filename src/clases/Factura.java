package clases;
import java.util.ArrayList;

import interfaces.Facturacion;

public class Factura implements Facturacion {
	private int num;
	private String name;
	private String surN;
	private ArrayList<LineaFactura> receiptLines;
	private double total;

	public Factura(int num, String name, String surN, ArrayList<LineaFactura> receiptLines, double total) {
		this.num = num;
		this.name = name;
		this.surN = surN;
		this.receiptLines = receiptLines;
		this.total = total;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurN() {
		return surN;
	}

	public void setSurN(String surN) {
		this.surN = surN;
	}

	public ArrayList<LineaFactura> getReceiptLines() {
		return receiptLines;
	}

	public void setReceiptLines(ArrayList<LineaFactura> receiptLines) {
		this.receiptLines = receiptLines;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [num=" + num + ", name=" + name + ", surN=" + surN + ", receiptLines=" + receiptLines+ ", total=" + total + "]";
	}

	public void añadirLinea(String code, int quantity, double total) {
		this.receiptLines.add(new LineaFactura(code, quantity, total));
	}

	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public double calcularTotal() {
		double total=0;
		ArrayList <ListaArticulo> a=new ArrayList <ListaArticulo>();
		
		return total;
	}
}
