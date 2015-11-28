
public class Piste {

	private Avion avion;
	private int nbrTours;
	private int numero;
	
	public Piste() {
		avion = null;
		numero = 0;
		nbrTours = 0;
	}
	
	public Piste(int numero) {
		avion = null;
		this.numero = numero;
		nbrTours = 0;
	}
	
	public String getDescription()
	{
		if(avion == null)
			return "Libre";
		
		return "Occupé: " + avion.getDescription();		
	}

}
