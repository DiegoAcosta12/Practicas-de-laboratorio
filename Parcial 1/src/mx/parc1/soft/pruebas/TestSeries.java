package mx.parcial1.soft.series;
import mx.parcial.soft.pruebas.*;
public class TestSeries{
	public static void main(String[] args) {
		
		Series s = new Serie();
		int m = s.genNumero(100);
		s.primos(m);
		int o = s.primoN(m/10);
		System.out.println(o);
		int n = s.genNumero(100);
		s.fibo(n);
		int.fibo(n);
		int p = s.fiboN(3,11);
		System.out.println(p);
	}
}