// Anagram code using Hashmaps

import java.util.*;
import java.io.*;
public class AnagramUsingHashMap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //str1 and str2 user inputs
        String str1 = sc.nextLine();   
        String str2 = sc.nextLine();   
        
        //converting string to character array
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        
        //Initialising HashMaps H1 and H2
        HashMap<Character, Integer> H1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> H2 = new HashMap<Character, Integer>();
        
        //For H1
        for (int i=0;i<arr1.length;i++){
            if (H1.get(arr1[i])==null){
                H1.put(arr1[i],1);
            }
            else{
                Integer c = (int) H1.get(arr1[i]);
                H1.put(arr1[i],++c);
            }
        }
        
        //For H2
         for (int j=0;j<arr2.length;j++){
            if (H2.get(arr2[j])==null){
                H2.put(arr2[j],1);
            }
            else{
                Integer d = (int) H2.get(arr2[j]);
                H2.put(arr2[j],++d);
            }
        }
        System.out.println(H1);
        System.out.println(H2);
        if(H1.equals(H2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

