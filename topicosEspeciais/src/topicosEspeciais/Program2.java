package topicosEspeciais;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2021-09-28T16:34:15Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//adiciona horas para uma data
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		//obter minutos de uma data
		int minutes = cal.get(Calendar.MINUTE);
		//obter mês
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Month: "+ month);
		System.out.println("Minutes: "+ minutes);
	}

}
