package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.bean.UtenteBean;
import utils.DbConnection;

public class UtenteDao {

	public List<Map<UtenteBean, Integer>> libriAcquistati() {
		String query = "SELECT utente.*, COUNT(id_libro) AS libri_acquistati FROM utente \r\n"
				+ "JOIN libro ON utente.id_utente = libro.id_utente_fk \r\n" + "GROUP BY utente.id_utente \r\n"
				+ "HAVING libri_acquistati >= 1";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<Map<UtenteBean, Integer>> utentiLibriAcquistati = new ArrayList<>();
		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				UtenteBean utenteBean = new UtenteBean();

				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setSaldoUtente(rs.getInt("saldo"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
				utenteBean.setDataCreazioneUtente(rs.getTimestamp("data_creazione").toLocalDateTime());
				utenteBean.setDataModificaUtente(rs.getTimestamp("data_modifica").toLocalDateTime());
				utenteBean.setFlgCancellatoUtente(rs.getBoolean("flg_cancellato"));

				Map<UtenteBean, Integer> mappa = new HashMap<>();
				int numeroDiLibriAcquistati = rs.getInt("libri_acquistati");
				mappa.put(utenteBean, numeroDiLibriAcquistati);
				utentiLibriAcquistati.add(mappa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return utentiLibriAcquistati;
	}

	public List<UtenteBean> premiumRicevuto(Long Id) {
		String query = "SELECT COUNT(id_libro) " + "FROM libro " + "WHERE id_utente_fk = ? AND prezzo >= 100.0p";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		List<UtenteBean> utentiPremiumRicevuto = new ArrayList<>();
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, Id);


			ResultSet rs = ps.executeQuery(query);

			while (rs.next()) {
				UtenteBean utenteBean = new UtenteBean();

				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setSaldoUtente(rs.getInt("saldo"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
				utenteBean.setDataCreazioneUtente(rs.getTimestamp("data_creazione").toLocalDateTime());
				utenteBean.setDataModificaUtente(rs.getTimestamp("data_modifica").toLocalDateTime());
				utenteBean.setFlgCancellatoUtente(rs.getBoolean("flg_cancellato"));

				utentiPremiumRicevuto.add(utenteBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return utentiPremiumRicevuto;
	}

}
