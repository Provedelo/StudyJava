package OutrosTopicosJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncaoCalendar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); //instancia calendario mas n se usa o new
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 0); //<- no lugar do 0 pode-se adicionar quaisquer horario a mais ou a menos para ser creditado da hora instanciada
		d = cal.getTime();
		System.out.println(d);
		System.out.println(sdf.format(d));
		
		int minutos = cal.get(Calendar.MINUTE);
		int horas = cal.get(Calendar.HOUR_OF_DAY);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = 1 + cal.get(Calendar.MONTH);
		int diaS = cal.get(Calendar.DAY_OF_WEEK);
		int semana = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("||Dia da Semana: " + diaS + "\n||Semana: " + semana);
		System.out.println("||Dia: " + dia + " do mes " + mes + " \n||" + horas + " Horas e " + minutos + " minutos");
		
	}

}
