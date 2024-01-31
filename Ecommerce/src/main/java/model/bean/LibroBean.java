package model.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LibroBean {

	// Attributi

	private Long idLibro;
	private String nomeLibro;
	private String autoreLibro;
	private String descrizioneLibro;
	private LocalDate pubblicazioneLibro;
	private int disponibileLibro;
	private double prezzoLibro;
	private int quantitaLibro;
	private boolean esaurimentoLibro;
	private LocalDateTime dataCreazioneLibro;
	private LocalDateTime dataModificaLibro;
	private boolean flgCancellatoLibro;

	// Costruttore

	public LibroBean() {
	}

	public LibroBean(Long idLibro, String nomeLibro, String autoreLibro, String descrizioneLibro,
			LocalDate pubblicazioneLibro, int disponibileLibro, double prezzoLibro, int quantitaLibro,
			LocalDateTime dataCreazioneLibro, LocalDateTime dataModificaLibro, boolean flgCancellatoLibro, boolean esaurimentoLibro) {
		this.idLibro = idLibro;
		this.nomeLibro = nomeLibro;
		this.autoreLibro = autoreLibro;
		this.descrizioneLibro = descrizioneLibro;
		this.pubblicazioneLibro = pubblicazioneLibro;
		this.disponibileLibro = disponibileLibro;
		this.prezzoLibro = prezzoLibro;
		this.quantitaLibro = quantitaLibro;
		this.esaurimentoLibro = esaurimentoLibro;
		this.dataCreazioneLibro = dataCreazioneLibro;
		this.dataModificaLibro = dataModificaLibro;
		this.flgCancellatoLibro = flgCancellatoLibro;

	}

	// Getters e Setters

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getNomeLibro() {
		return nomeLibro;
	}

	public void setNomeLibro(String nomeLibro) {
		this.nomeLibro = nomeLibro;
	}

	public String getAutoreLibro() {
		return autoreLibro;
	}

	public void setAutoreLibro(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}

	public String getDescrizioneLibro() {
		return descrizioneLibro;
	}

	public void setDescrizioneLibro(String descrizioneLibro) {
		this.descrizioneLibro = descrizioneLibro;
	}

	public LocalDate getPubblicazioneLibro() {
		return pubblicazioneLibro;
	}

	public void setPubblicazioneLibro(LocalDate pubblicazioneLibro) {
		this.pubblicazioneLibro = pubblicazioneLibro;
	}

	public int getDisponibileLibro() {
		return disponibileLibro;
	}

	public void setDisponibileLibro(int disponibileLibro) {
		this.disponibileLibro = disponibileLibro;
	}

	public double getPrezzoLibro() {
		return prezzoLibro;
	}

	public void setPrezzoLibro(double prezzoLibro) {
		this.prezzoLibro = prezzoLibro;
	}

	public int getQuantitaLibro() {
		return quantitaLibro;
	}

	public void setQuantitaLibro(int quantitaLibro) {
		this.quantitaLibro = quantitaLibro;
	}

	public LocalDateTime getDataCreazioneLibro() {
		return dataCreazioneLibro;
	}

	public void setDataCreazioneLibro(LocalDateTime dataCreazioneLibro) {
		this.dataCreazioneLibro = dataCreazioneLibro;
	}

	public LocalDateTime getDataModificaLibro() {
		return dataModificaLibro;
	}

	public void setDataModificaLibro(LocalDateTime dataModificaLibro) {
		this.dataModificaLibro = dataModificaLibro;
	}

	public boolean isFlgCancellatoLibro() {
		return flgCancellatoLibro;
	}

	public void setFlgCancellatoLibro(boolean flgCancellatoLibro) {
		this.flgCancellatoLibro = flgCancellatoLibro;
	}

	public boolean getEsaurimentoLibro() {
		return esaurimentoLibro;
	}

	public void setEsaurimentoLibro(boolean esaurimentoLibro) {
		this.esaurimentoLibro = esaurimentoLibro;
	}


	@Override
	public String toString() {
		return "Libro: {" + "Id = " + getIdLibro() + ", Nome = " + getNomeLibro() + ", Autore = " + getAutoreLibro()
				+ ", Descrizione = " + getDescrizioneLibro() + ", Pubblicazione = " + getPubblicazioneLibro()
				+ ", Disponibile = " + getDisponibileLibro() + ", Prezzo = " + getPrezzoLibro() + ", Quantita = "
				+ getQuantitaLibro() + "}\n";

	}
}
