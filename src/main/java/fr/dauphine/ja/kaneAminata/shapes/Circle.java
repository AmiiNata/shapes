package fr.dauphine.ja.kaneAminata.shapes;

public class Circle extends Point{
	private double rayon ; 
	private Point centre;
	
	//constructeur 
	public Circle(Point p, int r) {
		super(p);
		rayon = r;
	}
	public double getRayon() {
		return this.rayon;
	}
	
	//toString 
	public String toString() {
		return (super.toString()+"rayon =" + this.getRayon() + " la surface est de " + this.surface());
	}
	
	
	//la methode translate deja dans Point 
			public void translate(double dx, double dy) {
				
				centre.translate(dx, dy);
			}
	
	public double getCenter() {
		return this.rayon;
	}
	
	//surface
	public double surface() {
		return (2*3.14*this.rayon);
	}
	
	
	public boolean contains(Point p) {
		
		return (Math.sqrt((p.x - rayon)*(p.x - rayon)+(p.y - rayon))<rayon);
	}
	
	public static void main( String[] args ) {
		
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		
		System.out.println(c+ " " +c2);
		
		
		
		
		
	}

}
