import java.util.Date;

/**
 * 
 * @author Oscar
 *
 */
public class Appuntamenti {
	public static final String[] URGENZE={"nero","marrone","giallo","rosso"};
	private Date data,Orafine;
	private String urgenza;
	private Dottori medico;
	private Pazienti paziente;
	private int id;
	
	public Appuntamenti(Date data, Date orafine, String urgenza, Dottori medico, Pazienti paziente, int id) {
		super();
		this.data = data;
		Orafine = orafine;
		this.urgenza = urgenza;
		this.medico = medico;
		this.paziente = paziente;
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getUrgenza() {
		return urgenza;
	}

	public void setUrgenza(String urgenza) {
		this.urgenza = urgenza;
	}
	
	
}
