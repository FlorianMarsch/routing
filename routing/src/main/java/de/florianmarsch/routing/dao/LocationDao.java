package de.florianmarsch.routing.dao;

import java.util.ArrayList;
import java.util.List;

import de.florianmarsch.routing.entity.Location;

// mock, should be stored in DB as they are fixed and do not needed to be calculated on the fly




public class LocationDao {


	private List<Location> depots = new ArrayList<Location>();
	private List<Location> stores = new ArrayList<Location>();
	
	public LocationDao(){
		// init Stores
		depots.add(new Location("Metrostrasse 12, 40235 Dusseldorf", Double.valueOf("51.23467"),  Double.valueOf("6.825636")));
		depots.add(new Location("Am Albertussee 1, 40549 Dusseldorf", Double.valueOf("51.23681"),  Double.valueOf("6.724176")));
		
		stores.add(new Location("Schiessstraße 31, 40549 Dusseldorf", Double.valueOf("51.23764"),  Double.valueOf("6.719612")));
		stores.add(new Location("Friedrichstraße 152, 40217 Dusseldorf", Double.valueOf("51.20894"),  Double.valueOf("6.778820")));
		stores.add(new Location("Breslauer Str. 2, 41460 Neuss", Double.valueOf("51.20199"),  Double.valueOf("6.718629")));
		stores.add(new Location("Bataverstraße 93, 41462 Neuss", Double.valueOf("51.23123"),  Double.valueOf("6.685699")));
		stores.add(new Location("Am Sandbach 30, 40878 Ratingen", Double.valueOf("51.29651"),  Double.valueOf("6.831492")));

	}

	public List<Location> getDepots() {
		return depots;
	}


	public List<Location> getStores() {
		return stores;
	}


}
