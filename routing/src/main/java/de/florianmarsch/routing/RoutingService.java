package de.florianmarsch.routing;

import java.util.Collections;
import java.util.List;

import de.florianmarsch.routing.dao.RouteDao;
import de.florianmarsch.routing.entity.Location;
import de.florianmarsch.routing.entity.Route;

public class RoutingService {

	public Route getFastestDeliveryRoute(Location aLocation){
		
		List<Route> startRoutes = getRouteDao().getStartRoutes();
		for (Route route : startRoutes) {
			route.addWaypoint(aLocation);
		}
		Route min = Collections.min(startRoutes);
		
		return min;
	}
	
	
	RouteDao getRouteDao(){
		return new RouteDao();
	}
	
}
