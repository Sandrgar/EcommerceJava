package model.bean;

import java.time.LocalDateTime;

public class UtenteBean {

	// Attributi

	private Long idUtente;
	private String nomeUtente;
	private String cognomeUtente;
	private String emailUtente;
	private String passwordUtente;
	private int saldoUtente;
	private boolean premium;
	private LocalDateTime dataCreazioneUtente;
	private LocalDateTime dataModificaUtente;
	private boolean flgCancellatoUtente;

	// Costruttore

	public UtenteBean() {
	}

	public UtenteBean(Long idUtente, String nomeUtente, String cognomeUtente, String emailUtente, String passwordUtente,
			int saldoUtente,boolean premium, LocalDateTime dataCreazioneUtente, LocalDateTime dataModificaUtente,
			boolean flgCancellatoUtente) {
		this.idUtente = idUtente;
		this.nomeUtente = nomeUtente;
		this.cognomeUtente = cognomeUtente;
		this.emailUtente = emailUtente;
		this.passwordUtente = passwordUtente;
		this.saldoUtente = saldoUtente;
		this.premium = premium;
		this.dataCreazioneUtente = dataCreazioneUtente;
		this.dataModificaUtente = dataModificaUtente;
		this.flgCancellatoUtente = flgCancellatoUtente;
	}

	// Getters e Setters

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCognomeUtente() {
		return cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getEmailUtente() {
		return emailUtente;
	}

	public void setEmailUtente(String emailUtente) {
		this.emailUtente = emailUtente;
	}

	public String getPasswordUtente() {
		return passwordUtente;
	}

	public void setPasswordUtente(String passwordUtente) {
		this.passwordUtente = passwordUtente;
	}

	public int getSaldoUtente() {
		return saldoUtente;
	}

	public void setSaldoUtente(int saldoUtente) {
		this.saldoUtente = saldoUtente;
	}

	public LocalDateTime getDataCreazioneUtente() {
		return dataCreazioneUtente;
	}

	public void setDataCreazioneUtente(LocalDateTime dataCreazioneUtente) {
		this.dataCreazioneUtente = dataCreazioneUtente;
	}

	public LocalDateTime getDataModificaUtente() {
		return dataModificaUtente;
	}

	public void setDataModificaUtente(LocalDateTime dataModificaUtente) {
		this.dataModificaUtente = dataModificaUtente;
	}

	public boolean isFlgCancellatoUtente() {
		return flgCancellatoUtente;
	}

	public void setFlgCancellatoUtente(boolean flgCancellatoUtente) {
		this.flgCancellatoUtente = flgCancellatoUtente;
	}
	public boolean getPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Utente: {" + "Id = " + getIdUtente() + ", Nome = " + getNomeUtente() + ", Cognome = "
				+ getCognomeUtente() + ", Email = " + getEmailUtente() + ", Password = " + getPasswordUtente()
				+ ", Saldo = " + getSaldoUtente() + "}\n";
	}

}
