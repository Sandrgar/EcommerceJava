package model.dto;

import java.time.LocalDate;

public class LibroDto {

	// Proprietà
	private Long idLibro;
	private String nomeLibro;
	private String autoreLibro;
	private String descrizioneLibro;
	private LocalDate pubblicazioneLibro;
	private int disponibileLibro;
	private double prezzoLibro;
	private int quantitaLibro;
	private boolean esaurimentoLibro;

	// Costruttori
	public LibroDto() {
	}

	public LibroDto(Long idLibro, String nomeLibro, String autoreLibro, String descrizioneLibro,
			String pubblicazioneLibro, int disponibileLibro, double prezzoLibro, int quantitaLibro,
			boolean esaurimentoLibro) {
		this.idLibro= idLibro;
		this.nomeLibro = nomeLibro;
		this.autoreLibro = autoreLibro;
		this.descrizioneLibro = descrizioneLibro;
		this.prezzoLibro = prezzoLibro;
		this.quantitaLibro = quantitaLibro;
		
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
	
	

}
