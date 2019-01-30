package reusables;

public class Reusable {
	public static String[] date_conversion(String date)
	{
		//String[] a = new String[3];
		String departure_date = date;
		String day = departure_date.split(" ")[0];
		String month = departure_date.split(" ")[1].toLowerCase();
		String year = departure_date.split(" ")[2];
		switch(month)
		{
		case "january": case "jan": case "1": case "01":
			month = "0";
			break;
		case "february": case "feb": case "2": case "02":
			month = "1";
			break;
		case "march": case "mar": case "3": case "03":
			month = "2";
			break;
		case "april": case "apr": case "4": case "04":
			month = "3";
			break;
		case "may": case "5": case "05":
			month = "4";
			break;
		case "june": case "jun": case "6": case "06":
			month = "5";
			break;
		case "july": case "jul": case "7": case "07":
			month = "6";
			break;
		case "august": case "aug": case "8": case "08":
			month = "7";
			break;
		case "september": case "sep": case "9": case "09":
			month = "8";
			break;
		case "october": case "oct": case "10":
			month = "9";
			break;
		case "november": case "nov": case "11":
			month = "10";
			break;
		case "december": case "dec": case "12":
			month = "11";
			break;
		}
		/*a[0] = day;
		a[1] = month;
		a[2] = year;
		return a;*/
		return new String[] {day,month,year};
	}
}
