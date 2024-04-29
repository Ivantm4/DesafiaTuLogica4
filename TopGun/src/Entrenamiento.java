
public class Entrenamiento extends Avion{

	private boolean tieneDobleMando;
	
	public Entrenamiento(int idAvion,String modAvion,int capAvion,Piloto piloto,boolean tieneDobleMando) {//Constructor
		
		super(idAvion,modAvion,capAvion,piloto);
		this.tieneDobleMando=tieneDobleMando;
	}
}
