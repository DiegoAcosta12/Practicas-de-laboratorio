package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje{
    private Escudo escudo;

    public Planta(String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        this(nombre, 3, escudo);
    }
    public Planta(String nombre, int vida){
        this(nombre, vida);
        escudo = Escudo.NULO;
    }
    public Planta(String nombre){
        this(nombre, 3);
        escudo = Escudo.NULO;
    }
    public Escudo getEscudo(){
        return escudo;
    }
    public String toString(){
        return super.toString() + "\t" + Escudo.getNivel();
    }
    public void decVida(){



        /*
        if(escudo == 'A'){
            super.decVida(2);
        } else {super.decVida();
        }*/
    }
    public void decVida(int dec){




        /*
        if(escudo == 'A'){
            super.decVida(2*dec);
        } else {super.decVida(dec);
        }*/
    }
    public void addVida(){



        /*if(escudo == 'A'){
            super.addVida(2);
        } else {super.addVida();
        }*/
    }
    public void addVida(int add){




        /*
        if(escudo == 'A'){
            super.addVida(2*add);
        } else {super.addVida(add);
        }*/
    }
}
