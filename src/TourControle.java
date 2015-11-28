
public interface TourControle {
	
	void afficherAvionsEnVol();
	void afficherStatutPistes();
	void faireAtterrirAvion() throws EcrasementAvionException;
	void faireSurvolerAvions() throws EcrasementAvionException;
}
