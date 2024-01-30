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

	public LibroDto(Long idLibro, String nomeLibro, String autoreLibro, String descrizioneLibro, String passwordUtente,
			int saldoUtente, Long idRuolo, Long idGruppo) {
		this(idLibro, nomeLibro, autoreLibro, descrizioneLibro, prezzoLibro, quantitaLibro);

	}

	// Getters e Setters
	

}
