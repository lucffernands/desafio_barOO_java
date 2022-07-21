package util;

public class Bill {
	
    public static char gender;
    public static int beer;
    public static int barbecue;
    public static int softDrink;
    

	public static double feeding() {
		return (beer * 5.0) + (softDrink * 3.0) + (barbecue * 7.0);
	}

	public static double cover() {
		if (feeding() <= 30.0) {
			return 4.0;
		} else {
			return 0.0;
		}
	}
	
	public static double ticket() {
		if (gender == 'M') {
			return 10.00;
		}
		else {
			return 8.00;
		}					
	}
	
	public static double total() {
		return feeding() + cover() + ticket();
	}
		

}
