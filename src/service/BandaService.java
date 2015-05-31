package service;

import java.util.ArrayList;

import DAO.BandaDAO;
import beans.Banda;

public class BandaService {

	private BandaDAO dao = new BandaDAO();
	
	public ArrayList<Banda> getAll(){
		return dao.getAll();
	}
	
	public Banda getBanda( int id ) {
		return dao.getBanda( id );
	}
	
	public boolean addBanda( Banda banda) {
		return dao.addBanda( banda );
	}
	
	public boolean updateBanda( Banda banda ) {
		return dao.updateBanda( banda );
	}
	
	public boolean deleteBanda( int id ) {
		return dao.deleteBanda( id );
	}
	
}