import java.util.*;

public class Gestion {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		
		//Apartado1
		
		Piloto piloto1=new Piloto(1,"Pete Maverick",10000,"Capitán");
		Piloto piloto2=new Piloto(2,"Natasha Phoenix",3000,"Teniente");
		Piloto piloto3=new Piloto(3,"Bradley Rooster",3500,"Teniente");
		
		//Apartado2 
		
		System.out.println("Introduce la información de dos nuevos pilotos.");
		System.out.println("Id del piloto 4: ");
		int idPiloto4=sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre del piloto 4: ");
		String nomPiloto4=sc.nextLine();
		System.out.println("Horas de vuelo del piloto 4: ");
		int horasVueloPiloto4=sc.nextInt();
		sc.nextLine();
		System.out.println("Rango del piloto 4: ");
		String rangoPiloto4=sc.nextLine();
		
		Piloto piloto4=new Piloto(idPiloto4,nomPiloto4,horasVueloPiloto4,rangoPiloto4);
		
		System.out.println("Id del piloto 5: ");
		int idPiloto5=sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre del piloto 5: ");
		String nomPiloto5=sc.nextLine();
		System.out.println("Horas de vuelo del piloto 5: ");
		int horasVueloPiloto5=sc.nextInt();
		sc.nextLine();
		System.out.println("Rango del piloto 5: ");
		String rangoPiloto5=sc.nextLine();
		
		Piloto piloto5=new Piloto(idPiloto5,nomPiloto5,horasVueloPiloto5,rangoPiloto5);
		
		//Apartado3
		System.out.println("La información del piloto Piloto 1 es:");
		piloto1.setMostrarPiloto();
		System.out.println("La información del piloto Piloto 3 es:");
		piloto3.setMostrarPiloto();
		
		//Apartado4
		
		System.out.println("La información del piloto 4 es: ");
		piloto4.setMostrarPiloto();
		System.out.println("La información del piloto 5 es: ");
		piloto5.setMostrarPiloto();
		
		//Apartado5
		
		
		Avion avionEntrenamineto1=new Entrenamiento(201,"F-22 Raptor",2,piloto2,true);
		Avion avionCombate1=new Combate(101,"Eurofighter Typhoon ",1,piloto1,true);
		Avion avionCombate2=new Combate(102,"F-35 Lockheed ",1,piloto4,true);
		
		//Crear avión 4 y 5
		
		System.out.println("Introduce la información de dos nuevos aviones de entrenamiento.");
		System.out.println("Id del avión 4 es: ");
		int idAvion4=sc.nextInt();
		sc.nextLine();
		System.out.println("Modelo del avión 4: ");
		String modAvion4=sc.nextLine();
		System.out.println("Capacidad avión 4: ");
		int capAvion4=sc.nextInt();
		sc.nextLine();
		System.out.println("¿Tiene doble mando este avión? (true o false): ");
		boolean tieneDobleMando4=sc.nextBoolean();
		System.out.println("Elige Id del piloto asignado para el avión 4 (1,2,3,4,5): ");
		int pilotoAvion4=sc.nextInt();
		sc.nextLine();
		
		Entrenamiento avionEntrenamiento2=null;
		
		switch(pilotoAvion4) {
						
		case 1:{
			avionEntrenamiento2=new Entrenamiento(idAvion4,modAvion4,capAvion4,piloto1,tieneDobleMando4);
			break;
		}case 2:{
			avionEntrenamiento2=new Entrenamiento(idAvion4,modAvion4,capAvion4,piloto2,tieneDobleMando4);
			break;
		}case 3:{
			avionEntrenamiento2=new Entrenamiento(idAvion4,modAvion4,capAvion4,piloto3,tieneDobleMando4);
			break;
		}case 4:{
			avionEntrenamiento2=new Entrenamiento(idAvion4,modAvion4,capAvion4,piloto4,tieneDobleMando4);
			break;
		}case 5:{
			avionEntrenamiento2=new Entrenamiento(idAvion4,modAvion4,capAvion4,piloto1,tieneDobleMando4);
			break;
		}default:
			System.out.println("Has elegido un Id inexistente.");
		}
		
	
//------------------------------------------------------------------------------
		
		System.out.println("Id del avión 5 es: ");
		int idAvion5=sc.nextInt();
		sc.nextLine();
		System.out.println("Modelo del avión 5: ");
		String modAvion5=sc.nextLine();
		System.out.println("Capacidad avión 5: ");
		int capAvion5=sc.nextInt();
		sc.nextLine();
		System.out.println("¿Tiene doble mando este avión? (true o false): ");
		boolean tieneDobleMando5=sc.nextBoolean();
		System.out.println("Elige Id del piloto asignado para el avión 5 (1,2,3,4,5): ");
		int pilotoAvion5=sc.nextInt();
		sc.nextLine();
		
		Entrenamiento avionEntrenamiento3=null;
		
		switch(pilotoAvion5) {
						
		case 1:{
			avionEntrenamiento3=new Entrenamiento(idAvion5,modAvion5,capAvion5,piloto1,tieneDobleMando5);
			break;
		}case 2:{
			avionEntrenamiento3=new Entrenamiento(idAvion5,modAvion5,capAvion5,piloto2,tieneDobleMando5);
			break;
		}case 3:{
			avionEntrenamiento3=new Entrenamiento(idAvion5,modAvion5,capAvion5,piloto3,tieneDobleMando5);
			break;
		}case 4:{
			avionEntrenamiento3=new Entrenamiento(idAvion5,modAvion5,capAvion5,piloto4,tieneDobleMando5);
			break;
		}case 5:{
			avionEntrenamiento3=new Entrenamiento(idAvion5,modAvion5,capAvion5,piloto5,tieneDobleMando5);
			break;
		}default:
			System.out.println("Has elegido un Id inexistente.");
		}
		
		System.out.println("Información avión 1:");
		avionEntrenamineto1.setMostrarAvion();
		System.out.println("Información avión 2:");
		avionCombate1.setMostrarAvion();
		System.out.println("Información avión 3:");
		avionCombate2.setMostrarAvion();
		System.out.println("Información avión 4:");
		avionEntrenamiento2.setMostrarAvion();
		System.out.println("Información avión 5:");
		avionEntrenamiento3.setMostrarAvion();
	}

}
