package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*	;
public class PruebaTablero{
	public static void main(String[] args) {
		Personaje per01 = new Planta("David", 100);
        Personaje per02 = new Zombie("Bianca");
        Planta plan01 = new Planta("Fabian", 10, Escudo.MEDIO);
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", Escudo.BAJO);
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        Personaje[] datos = {per01,per02, plan01,plan02,plan03,plan04,zom01,zom02,zom03};
        for (Personaje p :datos) {
        	int poss =(int)(Math.random()*20-5);
        	try{
        		Tablero.insertar(p,poss);
        	}catch(PersException pe){
        		System.out.println(pe.getMessage() +" "+ pe.getPoss());
        	}
        }//foreach
        Tablero.mostrar();
        int i;
        for (i = 0;i < Tablero.MAX_SIZE;i++ ) {
        	int poss = (int)(Math.random()*20-5);
        	try{
        		Tablero.borrar(poss);
        	}catch(PersException pe){
        		System.out.println(pe.getMessage() +" "+pe.getPoss());
        	}
        }//for clasico
        Tablero.mostrar();
	}//main
}//clase