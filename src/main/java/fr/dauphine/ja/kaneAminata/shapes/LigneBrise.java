package fr.dauphine.ja.kaneAminata.shapes;

import java.util.ArrayList;
import java.util.LinkedList;

public class LigneBrise {
	
	/*
	private Point [] tab;
	private int taille;
	
	public void add(Point p) {
		tab[0] = p;
	}
	public int pointCapacity() {
		return this.taille;
	}
	public int nbPoints() {
		int i=0;
		while(this.tab[i]!=null && i<taille)
			i++;
		return i;
	}
	public boolean contains(Point p) {
		for(Point i :tab) {
			if(i == p)
				return true;
		}
		return false;
	}
	*/
	
	private LinkedList<Point> list ;
	
	//constructeur 
	public LigneBrise() {
		this.list = new LinkedList<>();
	}
	
	//ajouter un point 
	public void add(Point p) {
		list.add(p);
	}
	
	//aussi le nombre de point 
	public int pointCapacity() {
		return list.size();
	}
	public boolean contains(Point p) {
		return list.contains(p);
	}
	
	
	
}
