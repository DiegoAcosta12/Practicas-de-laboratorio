package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;
public class Computadora{
	private String marca;
	private Tipo tipo;
	private Memoria memoria;

	public Computadora(String marca,Tipo tipo,Memoria memoria){
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}

	public String toString(){
		return marca + " " + tipo + " " + memoria + " " + memoria.getTipo() + " " + memoria.getVelocidad() + " " + memoria.getPines() + " " + tipo.getType();
	}
}