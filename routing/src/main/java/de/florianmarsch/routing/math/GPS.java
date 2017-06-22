package de.florianmarsch.routing.math;

import de.florianmarsch.routing.entity.Location;

public class GPS {

	//https://www.kompf.de/gps/distcalc.html
	public Double distanceInKm(Location aLocation, Location anOtherLocation) {
		Double lat1 = aLocation.getLatitude();
		Double lat2 = anOtherLocation.getLatitude();
		Double lon1 = aLocation.getLongitude();
		Double lon2 = anOtherLocation.getLongitude();

		
		Double dx = 71.5 * (lon1 - lon2);
		Double dy = 111.3 * (lat1 - lat2);
		
		Double distance = Math.sqrt(dx * dx + dy * dy);

		return distance;
	}
}
