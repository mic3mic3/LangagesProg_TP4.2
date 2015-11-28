import java.util.Scanner;

public abstract class Avion {

	// Propri�t�s
	private int quantiteEssence;
	private String numeroSerie;

	// M�thodes

	public String getDescription() {
		return "(NS:" + numeroSerie + ", ESS:" + quantiteEssence + ")" + this.getNom();
	}

	public String getNom() {
		return ""; // � impl�menter
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
			throw new EcrasementAvionException("L'avion " + numeroSerie + " s'est �cras�!");
	}
}