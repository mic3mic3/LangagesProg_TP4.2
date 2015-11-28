import java.util.Scanner;

public abstract class Avion {

	// Propri�t�s
	private int quantiteEssence;
	private String numeroSerie;
	private static int prochainNumeroSerie = 0;
	
	public Avion()
	{
		this.quantiteEssence = 10;
		numeroSerie = Integer.toString(prochainNumeroSerie++);
	}
	
	public Avion(int quantiteEssence)
	{
		this.quantiteEssence = quantiteEssence;
		numeroSerie = Integer.toString(prochainNumeroSerie++);
	}

	// M�thodes

	public String getDescription() {
		return "(NS:" + numeroSerie + ", ESS:" + quantiteEssence + ")" + this.getNom();
	}

	public abstract String getNom();

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public int getQuantiteEssence() {
		return quantiteEssence;
	}

	public void diminuerQuantiteEssence(int quantite) throws EcrasementAvionException {
		quantiteEssence -= quantite;
		if (quantiteEssence <= 0)
			throw new EcrasementAvionException("L'avion " + numeroSerie + " s'est �cras�!");
	}
}