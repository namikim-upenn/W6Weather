import java.util.HashMap;

/**
 * MCIT591 Summer 2019
 * Week 6 Practice Activity: Make (and test) Weather in a City! (Ungraded Practice)
 * This class keeps track of max temperatures for every single day of each month in a year, 
 * assuming the year has 365 days. It does this by storing a hash map that maps 
 * each month to an array of temperatures, where each index in the array corresponds 
 * to one day in that month.
 * @author Nami Kim
 * @since 2019-07-01
 */
public class City {
	private String name;
	private HashMap<String, double[]> maxTempOfDay = new HashMap<String, double[]>();
	
	public City(String name) {
		this.name = name;
	}
	
	/**
	 * this is a method that takes in a month, day, and a max temp for that date and stores it.
	 * If temp already exists for the given day, it will be replaced with the new temp.
	 * @param month
	 * @param day
	 * @param temp max temp of the day 
	 * @return true if successfully stored.
	 */
	public boolean addTempForDate(String month, int day, double temp) {
		
		// check month validity - must be integer 1 to 12, or string name of a month.
		// this is a part of code I would like to implement, but not yet done.
		
		// check day validity - must be integer 1 to 31 depending on the month 
		if (day < 1 || day > 31) {
			return false;
		}
		int daysInMonth = 32; // this is set in variable, so it can be changed later depending on the month
		
		// check if month already exist in HashMap, 
		// if not, create a new array of temp, put in the HashMap
		if (maxTempOfDay.get(month.toLowerCase()) == null) {
			double[] tempArray = new double[daysInMonth];
			tempArray[day] = temp; 
			maxTempOfDay.put(month.toLowerCase(), tempArray);
		}
		else { // if exists, retrieve HashMap value that is array of temp and add the new temp
			double[] tempArray = maxTempOfDay.get(month.toLowerCase());
			tempArray[day] = temp;
			maxTempOfDay.put(month.toLowerCase(), tempArray);
		}
		
		return true;
	}
	
}
