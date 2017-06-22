package de.florianmarsch.routing.entity;

public class Drone {
	
	private Double speed = Double.valueOf(60);

	public void transport(Route aRoute){
		Double distance = aRoute.getTraveledDistance();
		Double timeSpend = distance / speed;
		Double hourSpend =timeSpend-( timeSpend % 1);
		Double minuteSpend = ((timeSpend-hourSpend)*60) ;
		
		System.out.println(hourSpend +" Hours and "+minuteSpend+" minutes spend on route "+aRoute);
	}
}
