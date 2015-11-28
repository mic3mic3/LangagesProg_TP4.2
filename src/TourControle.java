
public interface TourControle {
	
	void afficherAvionsEnVol();
	void afficherStatutPistes();
	void faireAtterrirAvion(String noAvion, String noPiste) throws EcrasementAvionException;
	void faireSurvolerAvions() throws EcrasementAvionException;
}
