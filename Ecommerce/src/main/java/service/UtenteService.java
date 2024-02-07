package service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import model.dao.LibroDao;
import model.dao.UtenteDao;
import model.dto.UtenteDto;

import utils.converter.UtenteConverter;

public class UtenteService {

	public List<Map<UtenteBean, Integer>> piuDiCinqueLibri() {
		UtenteDao utenteDao = new UtenteDao();
		LibroDao libroDao = new LibroDao();

		List<Map<UtenteBean, Integer>> listaMappa = utenteDao.piuDiCinqueLibri();

		for (Map<UtenteBean, Integer> map : listaMappa) {
			for (Map.Entry<UtenteBean, Integer> entry : map.entrySet()) {
				UtenteBean utente = entry.getKey();
				
				
                List<LibroBean> libri = libroDao.listaLibriUtente(utente.getIdUtente());
                for (LibroBean libro : libri) {
                	if(libro.getPrezzoLibro() >= 100) {
                     utente.setPremium(true);
                     utenteDao.update(utente);
                		
                	}
                }
                
                
			}
		}
		return listaMappa;

	}

}
