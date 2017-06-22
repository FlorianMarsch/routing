package de.florianmarsch.routing;

import java.util.ArrayList;
import java.util.List;

import de.florianmarsch.routing.entity.Drone;
import de.florianmarsch.routing.entity.Location;
import de.florianmarsch.routing.entity.Route;

public class Main {

	public static void main(String[] args) {

		List<Location> customers = new ArrayList<Location>();
		customers.add(new Location("Kronprinzenstraße 88, 40217 Dusseldorf", Double.valueOf("51.21172"),  Double.valueOf("6.770084")));
		customers.add(new Location("Kaiserstraße 2, 40479 Dusseldorf", Double.valueOf("51.23516"),  Double.valueOf("6.778400")));
		customers.add(new Location("Wildenbruchstraße 2, 40545 Dusseldorf", Double.valueOf("51.22747"),  Double.valueOf("6.759863")));
		customers.add(new Location("Schlesische Straße 5, 40231 Dusseldorf", Double.valueOf("51.20805"),  Double.valueOf("6.831059")));

		for (Location location : customers) {
			
			RoutingService  routingService = new RoutingService();
			Route fastestDeliveryRoute = routingService.getFastestDeliveryRoute(location);
			new Drone().transport(fastestDeliveryRoute );
		}
		    

		    
	}

}
