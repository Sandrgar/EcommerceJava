package application;

import java.util.List;
import java.util.Map;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import model.dao.LibroDao;
import model.dao.UtenteDao;
import service.UtenteService;

public class main {

	public static void main(String[] args) {
		
		LibroDao libroDao = new LibroDao();		
		/*List<LibroBean> libroBean = libroDao.AutoreOrderByPubblicazione("lorim");
		System.out.println(libroBean);*/
		
		
		/*List<LibroBean> libriInEsaurimento = libroDao.getLibriInEsaurimento();
		System.out.println(libriInEsaurimento);*/
		
		
		/*List<LibroBean> libriDisponibili = libroDao.getCopieDisponibili();
		System.out.println(libriDisponibili);*/
		
		
        UtenteDao utenteDao = new UtenteDao();		
		/*List<Map<UtenteBean, Integer>>utentiLibriAcquistati = utenteDao.libriAcquistati();
		System.out.println(utentiLibriAcquistati);*/
		
		/*List<LibroBean> libriUtente = libroDao.listaLibriUtente(1l);
		System.out.println(libriUtente);*/
		
		/*List<Map<UtenteBean, Integer>> result = utenteDao.piuDiCinqueLibri();
		
		for(Map<UtenteBean, Integer> map : result) {
			for(Map.Entry<UtenteBean, Integer> entry : map.entrySet()) {
				UtenteBean utente = entry.getKey();		
				int piuDiCinque = entry.getValue();
				
				System.out.println("UtenteBean: \n" + utente);
				System.out.println("Libri: \n" + piuDiCinque);
				
			}
		}*/
		
		UtenteService utenteService = new UtenteService();
		utenteService.piuDiCinqueLibri();
		
		
		
		
	}

}
