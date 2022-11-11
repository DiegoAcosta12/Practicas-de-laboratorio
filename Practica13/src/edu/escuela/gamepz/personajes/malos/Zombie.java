package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;
import edu.escuela.gamepz.utils.*;

public class Zombie extends Personaje implements Muerto{
    private boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida, 0.0f);
        this.ataque = ataque;
    }
    public Zombie(String nombre, float size){
        super(nombre,3,0.0f);   
    }
    public Zombie(String nombre, boolean ataque){
        this(nombre, 3, ataque);
    }
    public Zombie(String nombre){
        this(nombre, 3, false);
    }
    public boolean getAtaque() {
        return ataque;
    }

    public void comer(){
        System.out.println("Come cerebros");
    }

    public String toString(){
        return super.toString() + "\t" + ataque;
    }
    public void decVida(){
        if(!ataque){
            setVida(3);
        } else {setVida(2);
        }
    }
    public void decVida(int dec){
        if(!ataque){
            setVida(3*dec);
        } else {setVida(2*dec);
        }
    }
    public void addVida(){
        if(ataque){
            setVida(3);
        }
    }
    public void addVida(int add){
        if(ataque){
            setVida(3*add);
        }
    }
}
