import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2021-05-22T13:49:12Z"));
		System.out.println(sdf.format(d));
		
		Calendar calculator = Calendar.getInstance();
		calculator.setTime(d);
		int minutes = calculator.get(Calendar.MINUTE);
		int month = 1 + calculator.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println("minutes " + minutes);
		System.out.println("month " + month);
	}

}
