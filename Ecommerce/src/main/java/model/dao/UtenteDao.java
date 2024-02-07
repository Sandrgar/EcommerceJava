package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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

	public List<Map<UtenteBean, Integer>> piuDiCinqueLibri() {
		String query = "SELECT utente.*, COUNT(id_libro) AS libri_acquistati FROM utente JOIN libro ON utente.id_utente = libro.id_utente_fk GROUP BY utente.id_utente HAVING libri_acquistati >= 5";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<Map<UtenteBean, Integer>> utentiConCinqueLibri = new ArrayList<>();
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

				int piuDiCinque = rs.getInt("libri_acquistati");

				Map<UtenteBean, Integer> utentiLibriMappa = new HashMap<>();
				utentiLibriMappa.put(utenteBean, piuDiCinque);

				utentiConCinqueLibri.add(utentiLibriMappa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return utentiConCinqueLibri;
	}

	public int update(UtenteBean utenteBean) {
		String query = "UPDATE utente SET nome=?, cognome=?, email=?, password=?, saldo=?, data_modifica=?, flg_cancellato=?, premium=? WHERE id_utente=?";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, utenteBean.getNomeUtente());
			ps.setString(2, utenteBean.getCognomeUtente());
			ps.setString(3, utenteBean.getEmailUtente());
			ps.setString(4, utenteBean.getPasswordUtente());
			ps.setInt(5, utenteBean.getSaldoUtente());
			ps.setTimestamp(6, Timestamp.valueOf(utenteBean.getDataModificaUtente()));
			ps.setBoolean(7, utenteBean.isFlgCancellatoUtente());
			ps.setBoolean(8, utenteBean.getPremium());
			ps.setLong(9, utenteBean.getIdUtente());

		} catch (SQLException e) {
			e.printStackTrace();
		}

		int updateOutput = 0;
		try {
			updateOutput = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return updateOutput;
	}

}
