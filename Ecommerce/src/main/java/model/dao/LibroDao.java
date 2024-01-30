import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import model.bean.LibroBean;
import utils.DbConnection;

public class LibroDao {

	public List<LibroBean> AutoreOrderByPubblicazione(String autore) {
		String query = "SELECT * FROM libro WHERE autore = ? ORDER BY pubblicazione";

		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();

		PreparedStatement ps = null;
		List<LibroBean> libriAutore = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setString(1, autore);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_utente"));
				libroBean.setNomeLibro(rs.getString("nome"));
				libroBean.setAutoreLibro(rs.getString("cognome"));
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

		// Ordina la lista in base alla data di pubblicazione
		

		return libriAutore;
	}
	    public List<LibroBean> getDisponibilitaLibri(String autore) {
	        String query = "SELECT * FROM libro WHERE autore = ? ORDER BY pubblicazione";

	        DbConnection dbCon = new DbConnection();
	        Connection con = dbCon.getConnection();

	        PreparedStatement ps = null;
	        List<LibroBean> libriAutore = new ArrayList<>();

	        try {
	            ps = con.prepareStatement(query);
	            ps.setString(1, autore);

	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                LibroBean libroBean = new LibroBean();

	                libroBean.setIdLibro(rs.getLong("id_utente"));
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

	                // Verifica se il libro è in esaurimento
	                libroBean.setEsaurimentoLibro(libroBean.getDisponibileLibro() < 3);

	                libriAutore.add(libroBean);
	                
	                if(libroBean.getDisponibileLibro() < 3) {
	                	
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            dbCon.closeConnection(con);
	        }

	        return libriAutore;
	    }
	}
