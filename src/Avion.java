import java.io.Console;
import java.util.Scanner;

public abstract class Avion {
	
	// Propri�t�s
	private int _quantiteEssence;
	private String _numeroSerie;
	
	
	// M�thodes
	
	public String getDescription()
	{
		return "(NS:" + _numeroSerie + ", ESS:" + _quantiteEssence + ")" + this.getNom();
	}
	
	public String getNom()
	{
		return ""; // � impl�menter
	}
	
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