public abstract class Avion {
	// Temporaire, le temps d'ajouter toutes les classes.
	// Aller dans Run>Run configurations>Java application et
	// modifier la classe o� se trouve le main.
	public static void main(String[] args)
	{
		System.out.println("test");
	}
	
	// Propri�t�s
	private int _quantiteEssence;
	private String _numeroSerie;
	
	
	// M�thodes
	
	public String getNumeroSerie()
	{
		return _numeroSerie;
	}
	
	public int getQuantiteEssence()
	{
		return _quantiteEssence;
	}
	
	public void diminuerQuantiteEssence(int quantite) throws EcrasementAvionException
	{		
		_quantiteEssence = quantite;
		if(_quantiteEssence <= 0)
			throw new EcrasementAvionException("L'avion " + _numeroSerie + " s'est �cras�!");
	}
}