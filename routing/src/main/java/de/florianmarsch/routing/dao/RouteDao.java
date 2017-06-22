package de.florianmarsch.routing.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.florianmarsch.routing.entity.Location;
import de.florianmarsch.routing.entity.Route;
import de.florianmarsch.routing.math.GPS;

//mock, should be stored in DB as they are fixed and do not needed to be calculated on the fly


public class RouteDao {
	
	private List<Route> fastestStartRoutes = new ArrayList<Route>();

	public RouteDao(){
		LocationDao locationDao = getLocationDao();
		List<Location> depots  = locationDao.getDepots();
		List<Location> stores = locationDao.getStores();
		Map<Location,Route> fastestStart = new HashMap<Location, Route>();
		
		for (Location store : stores) {
			for (Location depot : depots) {
				Route current = new Route();
				current.addWaypoint(depot);
				current.addWaypoint(store);
				if(fastestStart.containsKey(store)){
					Route fastest = fastestStart.get(store);
					fastest = getFastestRoute(fastest, current);
					fastestStart.put(store, fastest);
				}else{
					fastestStart.put(store, current);
				}
			}
		}
		
		fastestStartRoutes.addAll(fastestStart.values());
		
	}
	
	public List<Route> getStartRoutes(){
		return fastestStartRoutes;
	}
	
	Route getFastestRoute(Route fastest, Route current) {
		return fastest.compareTo(current) < 0 ? fastest : current;
	}

	LocationDao getLocationDao(){
		return new LocationDao();
	}
	
	GPS getGPS() {
		return new GPS();
	}
	
}
