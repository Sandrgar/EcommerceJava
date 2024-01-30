package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import model.bean.UtenteBean;
import utils.DbConnection;

public class UtenteDao {

	public List<UtenteBean> findAll() {
		String query = "SELECT * FROM utente;";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<UtenteBean> utenti = new ArrayList<>();
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

				utenti.add(utenteBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return utenti;
	}

	// Metodo per ottenere un utente per ID

	public UtenteBean fetchUtenteById(long idUtente, Connection con) throws SQLException {
		String query = "SELECT * FROM utente WHERE id_utente = ?";

		
		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setLong(1, idUtente);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
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
					return utenteBean;
				}
			}
		}
	}
}
