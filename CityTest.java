import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CityTest {

	@Test
	void testMonthAddTempForDate() {
		City seoul = new City("Seoul");

		assertEquals(true, seoul.addTempForDate("6", 1, 24));
		assertEquals(true, seoul.addTempForDate("June", 1, 24));
		assertEquals(true, seoul.addTempForDate("june", 1, 24));
		assertEquals(true, seoul.addTempForDate("JUNE", 1, 24));
		
		//this is a part of code I would like to implement, but not yet done
		assertEquals(false, seoul.addTempForDate("JUNNNEE", 1, 24)); 
	}

	@Test
	void testDayAddTempForDate() {
		City seoul = new City("Seoul");

		assertEquals(false, seoul.addTempForDate("June", 0, 24));
		assertEquals(false, seoul.addTempForDate("June", -1, 24));
		assertEquals(false ,seoul.addTempForDate("June", 32, 24));
		
		//this is a part of code I would like to implement, but not yet done
		assertEquals(false, seoul.addTempForDate("June", 31, 24)); // June only has 30 days, 
		
	}

	@Test
	void testTempAddTempForDate() {
		City seoul = new City("Seoul");

		assertEquals(true, seoul.addTempForDate("June", 1, -10));
		assertEquals(true, seoul.addTempForDate("June", 1, 0));
		assertEquals(true, seoul.addTempForDate("June", 1, 100));
	}
	
	@Test
	void testNewAddTempForDate() {
		City seoul = new City("Seoul");
		
		//add new month
		assertEquals(true, seoul.addTempForDate("July", 1, 30));
		assertEquals(true, seoul.addTempForDate("August", 14, 33));

		//add a new day in a month already existing
		assertEquals(true, seoul.addTempForDate("July", 15, 27));	
	}
}
