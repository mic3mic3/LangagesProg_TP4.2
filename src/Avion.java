
public class Avion {
	// Temporaire, le temps d'ajouter toutes les classes.
	// Aller dans Run>Run configurations>Java application et
	// modifier la classe où se trouve le main.
	public static void main(String[] args)
	{
	}
	
	// Propriétés
	private int _quantiteEssence;
	private String _numeroSerie;
	
	
	// Méthodes
	
	public String getNumeroSerie()
	{
		return _numeroSerie;
	}
	
	public int getQuantiteEssence()
	{
		return _quantiteEssence;
	}
	
	public void diminuerQuantiteEssence(int quantite)
	{
		int bidon = 0;
		
		int valeurFinale = _quantiteEssence - quantite;
		if(valeurFinale < 0)
			bidon = 0; // TODO: Lancer exception
		_quantiteEssence = valeurFinale;
	}
}