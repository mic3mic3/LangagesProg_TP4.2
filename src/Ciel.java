import java.lang.System;
public class Ciel extends Thread {
	
	private LieuAtterrissage lieuAtterrissage;
	
	public Ciel() {
		lieuAtterrissage = null;
	}
	
	public Ciel(LieuAtterrissage lieuAtterrissage) {
		this.lieuAtterrissage = lieuAtterrissage;
	}
	
	public void run()
	{
		while (true)
		{
			Avion nouvelAvion = null;
			String avionClassName = null;
			
			//G�n�ration d'une avion au hasard parmi les 3 types
			int random = (int)(Math.random() * 3) + 1;
			switch (random)
			{
				case 1:
					avionClassName = AvionTypeA.class.getName();
					break;
				case 2:
					avionClassName = AvionTypeB.class.getName();
					break;
				case 3:
					avionClassName = AvionTypeC.class.getName();
					break;
				default:
			}
			
			try {
				//Instanciation dynamique gr�ce � la class Class
				nouvelAvion = (Avion) Class.forName(avionClassName).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			lieuAtterrissage.survoler(nouvelAvion); //Mettre l'avion dans l'a�roport
			
			//Sleep
			try
		    { 
		       Thread.sleep(5000); 
		    } 
		    catch (InterruptedException  interruptedException) //Si interruption pendant le sleep
		    { 
		      System.out.println(interruptedException); 
		    }
		}
	}

}
