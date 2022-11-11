package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;
public abstract class Personaje implements Comparable<Personaje>{
    private String nombre;
    protected int vida;
    private float size;

    public Personaje(String nombre, int vida, float size){
        if(size == 0.0f){
            this.size = genSize();
        }else{
            this.size = Math.round(size)/100;
        }
        this.nombre = nombre;
        this.vida = vida;
    }
    public int compareTo(Personaje o){
        if(this.nombre.compareTo(o.nombre) ==  ){

        } 
    }
    public Personaje(String nombre){
        this(nombre, 3);
    }

    public void setNombre(String nombre){
        if ((nombre.length() > 5) && (nombre.length() < 25)){
            this.nombre = nombre;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }

    public int getVida(){
        return vida;
    }

    public boolean setVida(int vida){
        if (vida >= 0 && vida < 100){
            this.vida = vida;
            return true;
        }
        return false;
    }
    public String toString(){
        return nombre + "\t" + vida;
    }
    public abstract void decVida();

    public abstract void decVida(int dec);

    public abstract void addVida();

    public abstract void addVida(int add);

    public float genSize(){
        float size = (float)(Math.random()*10);
        DecimalFormat df = new DecimalFormat("#.00");
        size = Float.valueOf(df.format(size));
        return size;  
    }
}