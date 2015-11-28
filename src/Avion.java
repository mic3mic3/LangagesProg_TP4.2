import java.util.Scanner;

public abstract class Avion {

	// Propriétés
	private int quantiteEssence;
	private String numeroSerie;

	// Méthodes

	public String getDescription() {
		return "(NS:" + numeroSerie + ", ESS:" + quantiteEssence + ")" + this.getNom();
	}

	public String getNom() {
		return ""; // À implémenter
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public int getQuantiteEssence() {
		return quantiteEssence;
	}

	public void diminuerQuantiteEssence(int quantite) throws EcrasementAvionException {
		quantiteEssence = quantite;
		if (quantiteEssence <= 0)
			throw new EcrasementAvionException("L'avion " + numeroSerie + " s'est écrasé!");
	}
}