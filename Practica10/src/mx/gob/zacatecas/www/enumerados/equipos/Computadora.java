package mx.gob.zacatecas.www.equipos.Computadora;
import mx.gob.zacatecas.www.utilerias.Memoria;
import mx.gob.zacatecas.www.utilerias.Tipo;
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
		return marca + " "+ tipo + " " + velocidad + " " + pines + " " + type;
	}
}