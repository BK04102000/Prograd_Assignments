//Number of Distinct Years in a String

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DistinctYears {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myStr = sc.nextLine();
		
		HashSet<String> mySet = new HashSet<>();
		
		Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher matcher = pattern.matcher(myStr);
		
		boolean check = matcher.find();
		
		while (check = true) {
			mySet.add(myStr.substring((matcher.end()) - 4, matcher.end()));
			myStr = myStr.substring(matcher.end());
			matcher = pattern.matcher(myStr);
			check = matcher.find();
			if (check == true)
				continue;
			else
				break;
		}
		
		System.out.println(mySet.size());
		
	}

}
