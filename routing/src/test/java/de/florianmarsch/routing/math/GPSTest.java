package de.florianmarsch.routing.math;

import org.junit.Assert;
import org.junit.Test;

import de.florianmarsch.routing.entity.Location;

public class GPSTest {

	private GPS sut = new GPS();

	@Test
	public void test() {
		
		// https://www.kompf.de/trekka/distance.php?lat1=49.9917&lon1=8.41321&lat2=50.0049&lon2=8.42182
		
		Location dummystart = new Location("Russelsheim Bahnhof", Double.valueOf("49.9917"),  Double.valueOf("8.41321"));
		Location dummyend = new Location("Russelsheim Opelbrucke", Double.valueOf("50.0049"),  Double.valueOf("8.42182"));
		
		Double distanceInKm = sut.distanceInKm(dummystart, dummyend);
		Assert.assertEquals("The distance is calculated wrong.", Double.valueOf("1.592925903431893"), distanceInKm);
	}

}