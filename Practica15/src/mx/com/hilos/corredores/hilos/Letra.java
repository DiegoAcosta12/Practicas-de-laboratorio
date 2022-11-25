package  mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
public class Letra implements Runnable{
	private char letra;
	private JLabel etq;
	
	public Letra(char letra, JLabel etq){
		this.letra = letra;
		this.etq = etq;
	}
	public void run(){
		String cadena;
		for (int i = 0;i <= 50 ;i++ ) {
			cadena = String.valueOf(letra);
			etq.setText(cadena);
			int rand = (int)(Math.random()*1000);
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch (InterruptedException e){

			}
			cadena = "Finalizado";
			etq.getText();
		}
	}
}