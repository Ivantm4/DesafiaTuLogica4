
public class Combate extends Avion {
	
	private boolean esFurtivo;
	
	public Combate(int idAvion,String modAvion,int capAvion,Piloto piloto,boolean esFurtivo) {//Constructor
		
		super(idAvion,modAvion,capAvion,piloto);
		this.esFurtivo=esFurtivo;
	}

}
