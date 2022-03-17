import java.util.*;
public class Holiday {
	 private String name;
	 private int day;
	 private String month;
	 
	 // 1st Part
	 public Holiday(String n, int d, String m) {
		 name = n;
		 day = d;
		 month = m;
		}
	 
	 //2nd Part
	 public boolean inSameMonth(Holiday hol){
		 return this.month.equals(hol.month);
		}
	 
	 //3rd Part
	 public static double avgDate(Holiday[] hol) {
		 int sum = 0;
		 for(int i = 0; i < hol.length; i++) {
		 sum = sum + hol[i].day;
		 }
		 return ((double) sum)/hol.length;
		}
		// 4th Part 
	 	//Holiday hol = new Holiday(“Independence Day”, 4, “July”);
	 
	}
