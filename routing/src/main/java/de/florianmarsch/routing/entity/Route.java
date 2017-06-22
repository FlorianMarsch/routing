package de.florianmarsch.routing.entity;

import java.util.ArrayList;
import java.util.List;

import de.florianmarsch.routing.math.GPS;

public class Route implements Comparable<Route>{

	private List<Location> waypoints = new ArrayList<Location>();
	private Location lastTraveledLocation;
	private Double traveledDistance = Double.valueOf(0);

	public void addWaypoint(Location aWaypoint) {
		waypoints.add(aWaypoint);
		if(hasToTravel()){
			Double distance = getGPS().distanceInKm(lastTraveledLocation, aWaypoint);
			traveledDistance = traveledDistance + distance;
		}
		lastTraveledLocation = aWaypoint;
	}
	
	Boolean hasToTravel(){
		return lastTraveledLocation != null;
	}
	
	GPS getGPS() {
		return new GPS();
	}

	public Double getTraveledDistance() {
		return traveledDistance;
	}

	@Override
	public String toString() {
		return "Route [waypoints=" + waypoints + ", lastTraveledLocation=" + lastTraveledLocation
				+ ", traveledDistance=" + traveledDistance + "]";
	}

	public int compareTo(Route anOtherRoute) {
		return traveledDistance.compareTo(anOtherRoute.getTraveledDistance());
	}

	
}