import java.lang.System;
public class Ciel extends Thread {
	
	private LieuAtterrissage lieuAtterrissage;

	public Ciel() {
		// TODO Auto-generated constructor stub
	}
	
	public void run()
	{
		while (true)
		{
			System.out.println("Ciel");
			try
		    { 
		       Thread.sleep(1000); 
		    } 
		    catch (InterruptedException  interruptedException) 
		    { 
		      /*Interrupted exception will be thrown when a sleeping or  waiting 
		      * thread is interrupted. 
		      */
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
