public class PruebaPersonaje{
	public static void main(String[]args){
		Personaje alumno = new Personaje("Kal El");
		alumno.setNombre("Kobie Bryant");
		alumno.saludar();
		S.o.println("Nombre: "+alumno.getNombre()+"Edad: " +almuno.getEdad());
		S.o.println("Modificando el nombre"+alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.Saludar();
		if(!alumno.setEdad(30)){
			S.o.println("Edad sin cambios");
		}
		S.o.println("Nombre:"+alumno.getNombre()+"Edad:"+alumno.getEdad());
		S.o.println("Modificando edad en 130");
		if(!alumno.setEdad(130)){
			S.o.println("Edad sin cambio");
		}
		S.o.println("Edad sin cambio");
}