
public class Piste {

	public final int MAX_TOURS_SUR_PISTE = 5;
	
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
	
	// Après un certain nombre de tours à être présent sur la piste,
	// un avion est déplacé au hangar.
	private boolean avionPretPourAllerAuHangar()
	{
		return nbrTours >= MAX_TOURS_SUR_PISTE;
	}
	
	public boolean contientAvion()
	{
		return avion != null;
	}
	
	public String getDescription()
	{
		String description = "(" + Integer.toString(numero) + ") ";
		if(avion == null)
			description += "Libre";
		else
			description += "Occupé: " + avion.getDescription() + " (" + Integer.toString(this.nbrTours) + "/" + Integer.toString(MAX_TOURS_SUR_PISTE) + " tours)";	
		return description;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public void setAvion(Avion value) throws EcrasementAvionException
	{
		if(this.contientAvion())
			throw new EcrasementAvionException("Écrasement! Il y a eu collision entre l'avion " + avion.getDescription() + " et l'avion " + value.getDescription());
		
		avion = value;
	}
	
	// Update qui se fait à chaque tour.
	public void update()
	{
		// S'il n'y a pas d'avion sur la piste, rien à faire.
		if(this.contientAvion() == false)
			return;
		
		// On incrémente le nombre de tours depuis lequel
		// l'avion est présent sur la piste.
		++nbrTours;
		
		// Si l'avion a atteint le nombre maximal de tours
		// pour lequel il peut être présent sur la piste,
		// on le retire de la piste (on supprime l'objet).
		if(this.avionPretPourAllerAuHangar())
		{
			avion = null;
			nbrTours = 0;
		}
	}

}
