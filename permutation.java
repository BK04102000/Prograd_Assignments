import java.util.*;
public class permutation {
    public  static int factorial(int a){
        int num = 1;
        for(int i=1;i<=a;i++){
		    
		    num = num * i;
		}
		return num;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str1 = sc.nextLine();
		char arr1[] = str1.toCharArray();
		int n = factorial(arr1.length);
		//System.out.println("No.of permutations: " + n);
		HashMap<Character, Integer> H1 = new HashMap<Character, Integer>();
		for (int i=0;i<arr1.length;i++){
            if (H1.get(arr1[i])==null){
                H1.put(arr1[i],1);
            }
            else{
                Integer c = (int) H1.get(arr1[i]);
                H1.put(arr1[i],++c);
            }
		
	}
	for (Integer value : H1.values()) {
    //System.out.println("Value = " + value);
    n = n/factorial(value);
    //System.out.println("No.of permutations: " + n);
}
	System.out.println("No.of permutations: " + n);
}}
