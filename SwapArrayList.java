/*Logic:

Input no. of Elements
Input space separated String:
	a = 1 2 3 4 5 6
	(or)
	a = 1 2 3 4 5
i=0
i < length(6 or 5) - 1 
[null,null]
[null,1]
	a = 2 3 4 5 6
	or
	a = 2 3 4 5
[2,1]
	a = 3 4 5 6
	or
	a = 3 4 5
i=2
i < length(6 or 5) - 1
[2,1,null,null]
[2,1,null,3]
	a = 4 5 6
	or
	a = 4 5
[2,1,4,3]
	a = 5 6
	or
	a = 5
i=4

Case 1: i < length(6) - 1

[2,1,4,3,null,null]
[2,1,4,3,null,5]
	a = 6 --- No whitespace
	break swapLoop
[2,1,4,3,6,5] ---->Output

Case 2: i = length(5) - 1
[2,1,4,3,null]
	a = 5 --- No whitespace
	break swapLoop
[2,1,4,3,5]

 */
import java.util.*;

public class SwapArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Elements: ");
		int length = sc.nextInt();
		sc.nextLine();

		ArrayList<String> myArray = new ArrayList<String>(length);
		
		System.out.println("Enter the space-separated inputs:");
		String myInput = sc.nextLine();

		swapLoop: for (int i = 0; i < length; i = i + 2) {
			if (length - 1 != i) {
				myArray.add(null);
				myArray.add(null);
			} else {
				myArray.add(null);
			}
			if (myInput.contains(" ")) {
				myArray.set(i + 1, myInput.substring(0, myInput.indexOf(" ")));
			} else {
				break swapLoop;
			}
			myInput = myInput.substring(myInput.indexOf(" ") + 1);
			if (myInput.contains(" ")) {
				myArray.set(i, myInput.substring(0, myInput.indexOf(" ")));
			} else {
				break swapLoop;
			}
			myInput = myInput.substring(myInput.indexOf(" ") + 1);
		}
		if (length % 2 != 0) {
			myArray.set(length - 1, myInput.substring(myInput.lastIndexOf(" ") + 1));
		} else {
			myArray.set(length - 2, myInput.substring(myInput.lastIndexOf(" ") + 1));
		}
		System.out.println("Swapped Array: " + myArray);
	}
}
