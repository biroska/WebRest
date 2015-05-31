package DAO;

import java.util.ArrayList;

import beans.Banda;

public class BandaDAO {
	
	private static ArrayList<Banda> listaBandas = new ArrayList<Banda>();

	/* Inicializa a base de bandas */
	static {
		
		int id = 1;
		
		listaBandas.add( new Banda( id++, "Led Zeppelin", 1968) );
		listaBandas.add( new Banda( id++, "AC/DC", 1973) );
		listaBandas.add( new Banda( id++, "Rolling Stones", 1962) );
		listaBandas.add( new Banda( id++, "Black Sabbath", 1968 ) );
		listaBandas.add( new Banda( id++, "Cream", 1966) );
		listaBandas.add( new Banda( id++, "The Animals", 1964) );
		listaBandas.add( new Banda( id++, "The Who", 1964) );
		listaBandas.add( new Banda( id++, "Creedence Clearwater Revival", 1967) );
		listaBandas.add( new Banda( id++, "The Mamas & the Papas", 1966) );
		listaBandas.add( new Banda( id++, "Deep Purple", 1968) );
	}
	
	public ArrayList<Banda> getAll() {
		return listaBandas;
	}
	
	public Banda getBanda( int id ) {
		
		for (int i = 0; i < listaBandas.size(); i++) {
			if ( listaBandas.get( i ).getId() == id ){
				return listaBandas.get( i );
			}
		}
		return null;
	}
	
	public boolean addBanda( Banda banda ) {
		return listaBandas.add( banda );
	}
	
	public boolean updateBanda( Banda banda ) {

		for (int i = 0; i < listaBandas.size(); i++) {
			if ( listaBandas.get( i ).getId() == banda.getId() ){
				listaBandas.set( i , banda );
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteBanda( int id ) {
		
		for (int i = 0; i < listaBandas.size(); i++) {
			if ( listaBandas.get( i ).getId() == id ){
				listaBandas.remove( i );
				return true;
			}
		}
		
		return false;
	}
	
}