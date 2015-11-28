
public class EcrasementAvionException extends Exception {

	public EcrasementAvionException() {
		// TODO Auto-generated constructor stub
	}

	public EcrasementAvionException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public EcrasementAvionException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public EcrasementAvionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public EcrasementAvionException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage()
	{
		return "Erreur: " + this.toString();
	}

}
