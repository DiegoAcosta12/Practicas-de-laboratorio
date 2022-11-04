package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.PersException;
public class Tablero{
	public static int MAX_SIZE = 10;
	public static Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	} 
	public static void mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en el tablero\n");
		int contar = 0;
		for (Personaje tmp:personajes ) {
			if(tmp == null ){
				System.out.println(contar + "- - -");
			}else{
				System.out.println(contar +" "+ tmp);
			}
			System.out.println("\nFin * * * Contenido del arreglo en Tablero\n");	
		}contar+=1;	
	}
	public static void insertar(Personaje p,int poss)throws PersException{
		if(poss < 0 || poss >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",poss);
		}
		personajes[poss] = p;
	}

	public static void borrar(int poss)throws PersException{
		if(poss < 0 || poss >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",poss);
		}
		if(personajes[poss] == null){
			throw new PersException("Si personaje para borrar",poss);	
		}
		personajes[poss] = null;

	}
}