package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.*;
public class Planta extends Personaje{
    private Escudo escudo;

    public Planta(String nombre, int vida, Escudo escudo){
        super(nombre, vida,0.0f);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        this(nombre, 3, escudo);
    }
    public Planta(String nombre, int vida){
        this(nombre,vida,Escudo.NULO);
    }
    public Planta(String nombre){
        this(nombre, 3,Escudo.NULO);
    }
    public Escudo getEscudo(){
        return escudo;
    }
    public String toString(){
        return super.toString() + "\t" + escudo.getNivel();
    }
    public void decVida(){
        setVida(vida - escudo.getNivel());

        /*
        if(escudo == 'A'){
            super.decVida(2);
        } else {super.decVida();
        }*/
    }
    public void decVida(int dec){
        setVida(vida - escudo.getNivel()*dec);

        /*
        if(escudo == 'A'){
            super.decVida(2*dec);
        } else {super.decVida(dec);
        }*/
    }
    public void addVida(){
        setVida(vida + escudo.getNivel());

        /*if(escudo == 'A'){
            super.addVida(2);
        } else {super.addVida();
        }*/
    }
    public void addVida(int add){
        setVida(vida + escudo.getNivel()*add);

        /*
        if(escudo == 'A'){
            super.addVida(2*add);
        } else {super.addVida(add);
        }*/
    }
}
    