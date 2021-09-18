package menu;

public class menu {
	

	public int estudns() {
		int opcionE=0;
		System.out.println("\n>>Menu Estudiantes");
		System.out.println(" 1. Consultar libros");
		System.out.println(" 2. Reservar libro");
		System.out.print("Elija una opcion: ");
		return opcionE;
	}

	public int biblio() {
		int opcionB=0;
		System.out.println("\n>>Menu Bibliotecario");
		System.out.println(" 1.-Ingresar un libro");
		System.out.println(" 2.-Prestar un libro");
		System.out.println(" 3.-Aplazar fecha de entrega");
		System.out.print("Elija una opcion: ");
		return opcionB;

	}
	
	
}
