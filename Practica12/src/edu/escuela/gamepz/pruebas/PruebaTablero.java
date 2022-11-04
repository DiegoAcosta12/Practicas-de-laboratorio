package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.utils.PersException;
import edu.escuela.gamepz.utils.Tablero;
import edu.escuela.gamepz.personajes.Personaje;
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
	}
}