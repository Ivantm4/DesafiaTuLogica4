
public class Avion {

	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;
	
	public Avion(int idAvion,String modAvion,int capAvion,Piloto piloto) {//Constructor
		
		this.idAvion=idAvion;
		this.modAvion=modAvion;
		this.capAvion=capAvion;
		this.piloto=piloto;
	}
	
	public int getIdAvion() {//Getter
		
		return idAvion;
	}
	public String getModAvion() {//Getter
		
		return modAvion;
	}
	public int getCapAvion() {//Getter
		
		return capAvion;
	}
	public Piloto getPiloto() {//Getter
		
		return piloto;
	}
	
	public void setMostrarAvion() {//Setter
		
		System.out.println("El ID del avión es :"+idAvion);
		System.out.println("El modelo del avión es: "+modAvion);
		System.out.println("La capacidad del avión es: "+capAvion);
		System.out.println("El piloto del avión es: "+piloto);
		piloto.setMostrarPiloto();
	}
}
