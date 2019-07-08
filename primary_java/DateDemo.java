import java.util.*;
import java.text.*;
  
public class DateDemo {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(date));
        System.out.printf("%tc%n",date);          
        System.out.printf("%tF%n",date);  
        System.out.printf("%tr%n",date);  
        System.out.printf("%tT%n",date);
   }
}