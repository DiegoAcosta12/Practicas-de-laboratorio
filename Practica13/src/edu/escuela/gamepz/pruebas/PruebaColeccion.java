package edu.escuela.gamepz.pruebas;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;
public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO);
			new Planta("Bianca",Tablero.genVida());
			new Planta("Fabian",Tablero.genVida());	
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO);	
			new Zombie("Bianca",Tablero.genVida());
			new Planta("Dayan",Tablero.genVida());
			new Zombie("Armando",Tablero.genVida(),false);
			new Zombie("Dayan",Tablero.genVida(),true);
			new Zombie("Armando",Tablero.genVida());

			TreeSet<Personaje> arbol = new TreeSet<>();
			//ts.add(p1);
			//ts.add(p2);
			//ts.add(p3);
			//ts.add(p4);
			//ts.add(z1);
			//ts.add(p5);
			//ts.add(z2);
			//ts.add(z3);
			//ts.add(z4);
			for (Personaje tmp: datos){
				System.out.println(tmp);
			}
			LinkedList<Personaje>linked = new LinkedList<>();
			linked.addAll(ts);
			System.out.println("---Orden Natural---");
			for (Personaje p : arbol) {
				System.out.println(p);
			}
			System.out.println("---Orden Vida---");
			Collections.sort(lista,new ByVida());
			for (Personaje p:lista ) {
				System.out.println(p);
			}
			ArrayList arr = new ArrayList();
			arr.addAll(lista);
			System.out.println("---Orden Ternario---");
			Collections.sort(arr,new BySize());
			for (Personaje p:arr ) {
				System.out.println(p);
			}
		}			
	}
}