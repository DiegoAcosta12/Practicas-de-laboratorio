public class Pruebacomputadora{
	public static void main(String[] args) {
		Computadora c1 = new Computadora("Lenovo",LAPTOP,DDR2);
		Computadora c2 = new Computadora("HP",DESKTOP,DDR4);
		Smallfactor s1 = Smallfactor("Dell",WORKSTATION,DDR3,true);
		Smallfactor s2 = Smallfactor("Acer",SERVER,DDR,false);

		Computadora[] = computadoras {c1,c2,s1,s2};
		for (Computadora tmp : computadoras) {
			System.out.println(tmp);
		}
	}
}