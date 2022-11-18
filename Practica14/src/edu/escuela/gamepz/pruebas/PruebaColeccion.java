package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;
import java.util.TreeSet;
import java.io.File;	
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;
public class PruebaColeccion{
	public static void main(String[] args) {
		String path = System.getProperty("user.home") +System.getProperty("file.separator"); 
		Scanner s = new Scanner(System.in);
		System.out.print("Escribe el nombre del archivo: ");
		String fname = "";
		fname = s.nextLine();
		path += fname;
		File f = new File(path);
		if (f.exists() && f.isFile()){
			System.out.println("El archivo si existe");
			System.exit(0);
		}
		if (f.isDirectory()){
			mostrarDirectorio(f);		
			System.out.println("Es un directorio");
			System.exit(0);
		}


		Personaje [] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
			};
		TreeSet <Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<Personaje>();
		for (Personaje personajes : datos) {
			arbol.add(personajes);
		}
		lista.addAll(arbol);


		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p:arbol){
		System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p:lista){
		System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<Personaje>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
		System.out.println(p);
		}	
	}
	private static void mostrarDirectorio(File f){
		String[] dir = f.list();
		for (String tmp: dir){
			System.out.println(tmp);		
		}
	}
	private static void guardarObjetos(File f, TreeSet <Personaje> arbol){
		try{
		FileOutputStream fa = new FileOutputStream(f);
		FileOutputStream s = new ObjectOutputStream (fa);
		for ( Personaje tp: arbol) {
			s.writeObject(tp);
		}
		s.close ();
		}catch (IOException e){
			e.printStackTrace ();
		}
	}
}