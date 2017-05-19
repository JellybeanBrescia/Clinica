
public class ClinicaMain {
	private final static String MSG_BENVENUTO ="Benvenuto nella nostra clinica";
	private final static String MSG_ADDIO = "Arrivederci";
	private static void benvenuto(){
		System.out.println(MSG_BENVENUTO);
		System.out.println();
	}
	private static void addio(){
		System.out.println(MSG_ADDIO);
		System.out.println();
	}
	public static void main(String[] args) {
		benvenuto();
		
		addio();
		

	}
	public static void stampaMenu(){
		
	}

}
