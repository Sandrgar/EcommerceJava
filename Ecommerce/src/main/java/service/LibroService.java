package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import model.dao.LibroDao;
import model.dao.UtenteDao;
import utils.DbConnection;

public class LibroService {

	/*public List<Map<UtenteBean, Integer>> piuDiCinqueLibri() {

		LibroDao libroDao = new LibroDao();
		UtenteDao utenteDao = new UtenteDao();

		List<Map<UtenteBean, Integer>> utentiConLibri = libroDao.piuDiCinqueLibri();
		List<UtenteBean> listaUtenti = new ArrayList<>();

		for (Map<UtenteBean, Integer> map : utentiConLibri) {
			for (Map.Entry<UtenteBean, Integer> entry : map.entrySet()) {
				UtenteBean user = entry.getKey();

				listaUtenti.add(user);
			}
		}
	}*/

	public List<LibroBean> AutoreOrderByPubblicazione(String nome) {

		List<LibroBean> libri = new ArrayList<>();
		if (nome != null) {
			LibroDao libroDao = new LibroDao();
			libri = libroDao.AutoreOrderByPubblicazione("lorim");
		}
		return libri;
	}
	
	

	public List<LibroBean> getLibriInEsaurimento() {
		LibroDao libroDao = new LibroDao();
		
		List<LibroBean> libri = libroDao. getLibriInEsaurimento();
	
		return libri;
	}
}
