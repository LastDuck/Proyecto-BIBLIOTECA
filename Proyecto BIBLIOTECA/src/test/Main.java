package test;

import java.util.Scanner;

import libro.LibroNuevoB;
import menu.menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner lector=new Scanner(System.in);
		int opcion=0;
		int indice=0;
		String cedula="";
		String nombre="",autor="";
		menu objmenu = new menu();
		
		
	
		LibroNuevoB[] biblioteca=new LibroNuevoB[15];
		
		do {	
			
				System.out.println("\n\t→>> Biblioteca Uce <<←");
				System.out.println("Bienvenido Sistema Bibliotecario ");
				System.out.println("  1.- Estudiante");
				System.out.println("  2.- Bibliotecario");
				System.out.println("  3.- Salir");
				System.out.print("Elija una opcion: ");
				opcion=lector.nextInt();
			
				if(opcion==1) {
					
					opcion=objmenu.estudns();
					int opcionE=lector.nextInt();
						if(opcionE==1) {
						lector.nextLine();
						
						System.out.println("Ingrese el nombre y/o autor del libro:");
						String anBuscar=lector.nextLine();
						
						for(int i=0;i<biblioteca.length;i++) {
							//try {	
							LibroNuevoB NOmbre=biblioteca[i];
							LibroNuevoB LE=biblioteca[i];
							if(NOmbre!=null ) {  ///arreglar
							
							boolean  elibroe=LE.getAutor().contains(anBuscar);
							boolean libroE= NOmbre.getNombre().contains(anBuscar);
						
								if(elibroe==true && libroE==false) {
									if(LE.getAutor().contains(anBuscar)  ) {
										if(biblioteca[i]!=null) {
											System.out.println("\n"+"Codigo:"+biblioteca[i].getCodigo()+ " Nombre:"+biblioteca[i].getNombre()+ " Autor:"+biblioteca[i].getAutor()+" Año:"+biblioteca[i].getAnoDePublicacion()+ " Estado:"+biblioteca[i].getEstado());	
										}								
									}
							}else if(elibroe==false && libroE==true){
								if(NOmbre.getNombre().contains(anBuscar)  ) {
									if(biblioteca[i]!=null) {
										System.out.println("\n"+"Codigo:"+biblioteca[i].getCodigo()+ " Nombre:"+biblioteca[i].getNombre()+ " Autor:"+biblioteca[i].getAutor()+" Año:"+biblioteca[i].getAnoDePublicacion()+ " Estado:"+biblioteca[i].getEstado());	
		
									}
								}
							}else {
								System.out.println("No se encontro nombre ni autor del libro");
							}	
							}
//							}catch(NullPointerException exception)  {
//								continue;
//							}
						
						}//	
											
					}else if(opcionE==2) {
						lector.nextLine();
						
						System.out.println("Ingrese el codigo del libro:");
						String Bcodigo=lector.nextLine();
						
						for(int i=0;i<biblioteca.length;i++) {
							LibroNuevoB CE=biblioteca[i];
							boolean Clibro=true;
							 Clibro=CE.getCodigo().equals(Bcodigo);
							if(Clibro==true ) {                              
								if(biblioteca[i].getEstado().equals("Disponible")) {
									biblioteca[i].setEstado("Reservado");
									System.out.println("Ingrese cedula del estudiante:");
									 cedula=lector.nextLine();
									 biblioteca[i].setCedula(cedula);
								    System.out.println("Se a reservado por:"+cedula);
									
								}else {
									System.out.println("No se encontro disponible el libro del libro"  );
									//System.out.println("El libro estara disponible en:"+biblioteca[i].);
										}
							}else  {
								System.out.println("No se encontro codigo del libro del libro"  );
								
							}
							biblioteca	[i]=CE ;
							break;
						}
					}
				
				}else if(opcion==2) {
					opcion=objmenu.biblio();
					int opcionB=lector.nextInt();
					
					if(opcionB==1) {
						
						System.out.println("Ingrese datos del libro-");
						System.out.print("Codigo: ");
						lector.nextLine();
						String codigo=lector.nextLine();
						System.out.print("Nombre: ");
		 				 nombre=lector.nextLine();
						System.out.print("Auto: ");;
						autor=lector.nextLine();
						System.out.print("Año de publicación: ");
						int anopublicacion=lector.nextInt();
						System.out.print("Editorial: ");
						lector.nextLine();
						String editorial=lector.nextLine();
						System.out.print("Cantidad de páginas: ");
						int cpaginas=lector.nextInt();
						System.out.print("Precio: ");
						double precio=lector.nextDouble();
					
						System.out.println("Que tipo de libro es:");
						System.out.println("1.-Libro de trabajo");
						System.out.println("2.-Libro lectura");
					
						int opcion2=0;
						String cAuto="";
						int tAproxi = 0;
						
						opcion2=lector.nextInt();
						if(opcion2==1) {
							System.out.println("Ingrese Código autorización: ");
							cAuto=lector.nextLine();
							lector.nextLine();
							System.out.println("Se a guardado correctamente el Libro");
						}else if(opcion2==2) {
							System.out.println("Ingrese Tiempo aproximado de lectura:");
							 tAproxi=lector.nextInt();
							lector.nextLine();
							System.out.println("Se a guardado correctamente el Libro");
						}
				
					biblioteca[indice]=new LibroNuevoB (codigo, nombre, autor, anopublicacion, editorial, cpaginas, precio,cAuto,tAproxi,cedula);
					indice++;

					}else if(opcionB==2) {
						lector.nextLine();
						
						System.out.println("Ingrese el codigo del libro:");
						String Bcodigo=lector.nextLine();
						
						for(int i=0;i<biblioteca.length;i++) {
							LibroNuevoB CE=biblioteca[i];
							boolean Clibro=true;
							 Clibro=CE.getCodigo().equals(Bcodigo);
							if(Clibro==true ) {                              
								if(biblioteca[i].getEstado().equals("Reservado")) {
									System.out.print("Codigo:"+biblioteca[i].getCodigo()+ " Nombre:"+biblioteca[i].getNombre()+ " Estado:"+biblioteca[i].getEstado()+ " Fecha comple: "+" Reservado por:"+biblioteca[i].getCedula());
									int Opestar=0;
									System.out.println("\nElija opcicon:");
									System.out.println(" 1.-Prestar");
									System.out.println(" 2.-No Prestar");
									Opestar=lector.nextInt();
									if(Opestar==1) {
									biblioteca[i].setEstado("Prestado");
									System.out.println("Estado del libro:"+biblioteca[i].getEstado() +" Fecha de a Entrega el Libro: ");
									}else if(Opestar==2) {
										System.out.println("No se presto  el libro solicitado"  );
									}
								}else {
									System.out.println("No se encontro codigo del libro /Estado negado"  );
									
										}
							}else  {
								System.out.println("No se encontro codigo del libro /Estado negado"  );
								
							}
							biblioteca	[i]=CE ;
							break;
						}
					
					}else if(opcionB==3) {
						lector.nextLine();
						
						System.out.println("Ingrese el codigo del libro:");
						String Bcodigo=lector.nextLine();
						System.out.println("Ingrese el cedula del libro:");
						String Bcedula=lector.nextLine();
						
						for(int i=0;i<biblioteca.length;i++) {
							LibroNuevoB CoE=biblioteca[i];
							LibroNuevoB CeE=biblioteca[i];
							boolean Clibro=true, Celibro=true;
							 Clibro=CoE.getCodigo().equals(Bcodigo);
							 Celibro=CeE.getCedula().equals(Bcedula);
							if(Clibro==true && Celibro==true) {                              
								if(biblioteca[i].getEstado().equals("Prestado")) {
									System.out.print("Codigo:"+biblioteca[i].getCodigo()+ " Nombre:"+biblioteca[i].getNombre()+ " Estado:"+biblioteca[i].getEstado()+"  Fecha Entrega::"+biblioteca[i].getAnoDePublicacion()+ " Prestado a:"+biblioteca[i].getCedula());
									
									int Apestar=0;
									System.out.println("\nElija opcicon:");
									System.out.println(" 1.-Aplazar");
									System.out.println(" 2.-No Aplazar");
									Apestar=lector.nextInt();
									
									if(Apestar==1) {
										System.out.println("Nueva fecha de :");
									}else if(Apestar==2) {
								break;
								}		
									
								}else {
									System.out.println("No se encontro disponible el libro del libro"  );
							
										}
							}else  {
								System.out.println("No se datos invalidos"  );
								
							}
							biblioteca	[i]=CoE ;
							break;
						}
					}
				}
			
		}while(opcion!=3);
	
		}
}
