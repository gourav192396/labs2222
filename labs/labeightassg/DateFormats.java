package labeightassg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(date));
	}

}
