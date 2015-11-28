import java.lang.System;
import java.math.*;
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
			
			System.out.println(nouvelAvion.getClass().getName());
			lieuAtterrissage.survoler(nouvelAvion);
			try
		    { 
		       Thread.sleep(1000); 
		    } 
		    catch (InterruptedException  interruptedException) 
		    { 
		      System.out.println(interruptedException); 
		    }
		}
	}

	public Ciel(Runnable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Ciel(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Ciel(ThreadGroup arg0, Runnable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Ciel(ThreadGroup arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Ciel(Runnable arg0, String arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Ciel(ThreadGroup arg0, Runnable arg1, String arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public Ciel(ThreadGroup arg0, Runnable arg1, String arg2, long arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
