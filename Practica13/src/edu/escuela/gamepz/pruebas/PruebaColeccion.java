public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje[] datos = {
			Planta p1 = new Planta("Fabian",Tablero.genVida(),MEDIO),
			Planta p2 = new Planta("Bianca",Tablero.genVida()),
			Planta p3 = new Planta("Fabian",Tablero.genVida(),),	
			Planta p4 = new Planta("Armando",Tablero.genVida(),BAJO),	
			Zombie z1 = new Zombie("Bianca",Tablero.genVida()),
			Planta p5 = new Planta("Dayan",Tablero.genVida()),
			Zombie z2 = new Zombie("Armando",Tablero.genVida(),false),
			Zombie z3 = new Zombie("Dayan",Tablero.genVida(),true),
			Zombie z4 = new Zombie("Armando",Tablero.genVida());

			TreeSet<Personaje> ts = new TreeSet<>();
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
			ts.add(p4);
			ts.add(z1);
			ts.add(p5);
			ts.add(z2);
			ts.add(z3);
			ts.add(z4);
			for (Personaje datos: ts ) {
			System.out.println(datos);
		}
		}

	}
	
}