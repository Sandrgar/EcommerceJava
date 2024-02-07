package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bean.LibroBean;
import utils.DbConnection;

public class LibroDao {

	public List<LibroBean> AutoreOrderByPubblicazione(String nome) {
		String query = "SELECT * FROM libro WHERE autore = ? ORDER BY pubblicazione";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		List<LibroBean> libriAutore = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nome);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setNomeLibro(rs.getString("nome"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setDescrizioneLibro(rs.getString("descrizione"));
				libroBean.setPubblicazioneLibro(rs.getTimestamp("pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setDisponibileLibro(rs.getInt("disponibile"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setQuantitaLibro(rs.getInt("quantita"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));

				libriAutore.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return libriAutore;
	}

	public List<LibroBean> getLibriInEsaurimento() {
		String query = "SELECT * FROM libro WHERE quantita < 3 ";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<LibroBean> libriInEsaurimento = new ArrayList<>();

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setNomeLibro(rs.getString("nome"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setDescrizioneLibro(rs.getString("descrizione"));
				libroBean.setPubblicazioneLibro(rs.getTimestamp("pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setDisponibileLibro(rs.getInt("disponibile"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setQuantitaLibro(rs.getInt("quantita"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));

				libriInEsaurimento.add(libroBean);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return libriInEsaurimento;
	}

	public List<LibroBean> getCopieDisponibili() {
		String query = "SELECT * FROM libro WHERE quantita > 0";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<LibroBean> libriDisponibili = new ArrayList<>();

		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setNomeLibro(rs.getString("nome"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setDescrizioneLibro(rs.getString("descrizione"));
				libroBean.setPubblicazioneLibro(rs.getTimestamp("pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setDisponibileLibro(rs.getInt("disponibile"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setQuantitaLibro(rs.getInt("quantita"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));

				libriDisponibili.add(libroBean);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return libriDisponibili;
	}

	public List<LibroBean> listaLibriUtente(Long Id) {
		String query = "SELECT * FROM libro WHERE id_utente_fk = ?";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		List<LibroBean> libriUtente = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, Id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setNomeLibro(rs.getString("nome"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setDescrizioneLibro(rs.getString("descrizione"));
				libroBean.setPubblicazioneLibro(rs.getTimestamp("pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setDisponibileLibro(rs.getInt("disponibile"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setQuantitaLibro(rs.getInt("quantita"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));

				libriUtente.add(libroBean);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return libriUtente;
	}
}
