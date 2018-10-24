package fr.dauphine.ja.kaneAminata.shapes;

import java.util.ArrayList;

public class Point {
	//private double x;
	//private double y ; 
	protected double x;
	protected double y;
	
	public Point(double px, double py) {
		x=px;
		y=py;
	}
	
	public Point(Point p) {
		this.x=p.x;
		this.y = p.y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public boolean isSameAs(Point p1) {
		
		return(p1.x == x && p1.y ==y);	
	}
	
	//la methode translate 
		public void translate(double dx, double dy) {
			
			this.x = this.x+dx;
			this.y = this.y+dy;
			
		}
		
		//les getteurs 
		public double getAbscisse() {
			return this.x;
		}
		public double getOrdonnee() {
			return this.y;
		}
		
		//la methode toString 
		public String toString() {
			return ("abscisse = " +this.getAbscisse()+ " ordonnee = " +this.getOrdonnee());
		}
		
		
	 public static void main( String[] args ) {
		Point p = new Point(2,5);
		System.out.println("("+p.x+","+p.y+")");
		
		System.out.println("Exercice 2");
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		
	}


}
