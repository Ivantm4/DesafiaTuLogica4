
public class Piloto {

	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	
	public Piloto(int idPiloto,String nomPiloto,int horasVueloPiloto,String rangoPiloto) {//Constructor
		
		this.idPiloto=idPiloto;
		this.nomPiloto=nomPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		this.rangoPiloto=rangoPiloto;
	}
	
	public int getIdPiloto() {//Getter
		
		return idPiloto;
	}
	public String getNomPiloto() {//Getter
		
		return nomPiloto;
	}
	public int getHorasVueloPiloto() {//Getter
		
		return horasVueloPiloto;
	}
	public String getRangoPiloto() {//Getter
		
		return rangoPiloto;
	}
	
	public void setMostrarPiloto() {//Setter
		
		System.out.println("El ID del piloto es: "+idPiloto);
		System.out.println("El nombre del piloto es: "+nomPiloto);
		System.out.println("Horas de vuelo: "+horasVueloPiloto);
		System.out.println("Rango piloto: "+rangoPiloto);
	}
	
}
