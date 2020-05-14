import java.util.*;
public class time{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int yr,days,min,yr_days,day;
System.out.println("Enter the minutes:");
min=sc.nextInt();
yr=((min/365)/24)/60;
day=(min/60)/24;
yr_days=yr*365;
days=day-yr_days;
System.out.println(min + "minutes=" + yr + " Years and" + days + "days");
}
}
