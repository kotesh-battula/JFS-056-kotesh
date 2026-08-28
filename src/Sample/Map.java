package Sample;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Map
{
	public static void main(String[] args)
	{
		Date d=new Date();
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,32);
		System.out.println(cal.get(cal.MONTH)+1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("EEE, dd-MMMM-yyyy hh:mm:ss a");
		System.out.println(sdf.format(d));
	}
}
