import java.util.Date;
/**
 * 
 * @author Oscar
 *la classe Dottori estende persone e quindi ne eredit� gli attributi,
 * in pi� ne vengono aggiunti alcuni specifici dei medici pi� i metodi 
 * per modificarli o visualizzarli
 *
 */
public class Dottori extends Persone {
	private int matricola;
	private Date annoLaurea, annoAssunzione;
	
	
	public Dottori(String nome, String cognome, String codFiscale, String luogoNascita, Date dataNascita, int matricola,
			Date annoLaurea, Date annoAssunzione) {
		super(nome, cognome, codFiscale, luogoNascita, dataNascita);
		this.matricola = matricola;
		this.annoLaurea = annoLaurea;
		this.annoAssunzione = annoAssunzione;
	}
	

}
