package application;

import java.util.List;
import java.util.Map;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import model.dao.LibroDao;
import model.dao.UtenteDao;

public class main {

	public static void main(String[] args) {
		
		LibroDao libroDao = new LibroDao();		
		List<LibroBean> libroBean = libroDao.AutoreOrderByPubblicazione("lorim");
		System.out.println(libroBean);
		
		
		List<LibroBean> libriInEsaurimento = libroDao.getLibriInEsaurimento();
		System.out.println(libriInEsaurimento);
		
		
		List<LibroBean> libriDisponibili = libroDao.getCopieDisponibili();
		System.out.println(libriDisponibili);
		
		
        UtenteDao utenteDao = new UtenteDao();		
		List<Map<UtenteBean, Integer>>utentiLibriAcquistati = utenteDao.libriAcquistati();
		System.out.println(utentiLibriAcquistati);
		
		List<UtenteBean> utentiPremiumRicevuto = utenteDao.premiumRicevuto(1l);
		System.out.println(utentiPremiumRicevuto);
	}

}
