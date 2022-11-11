package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;
public class ByVida implements Comparator<Personaje>{

	public int compare(Personaje p1, Personaje p2){
		if(p1.getVida() != p2.getVida()){
			return (p1.getVida()<p2.getVida()) ? -1 : 1;
		}
		if(p1.getNombre() == p2.getNombre()){
			return p2.getNombre()-p1.getNombre();
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}
}