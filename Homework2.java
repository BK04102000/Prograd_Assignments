/*
InvalidNameException
InvalidIDNumberException
InvalidMarksException 
IOException
FileNotFoundException
NoSuchFileException
ArrayIndexOutOfBoundsException
NumberFormatException
InputMismatchException
*/

import java.io.*;  
import java.util.*; 
import java.nio.file.*;
import java.util.stream.*;
/*class InvalidNameException extends Exception{
    public void InvalidNameException(String args){
        System.out.println("Invalid Name.Enter Correct Name.");
    }
}*/
class InvalidIDNumberException extends Exception{
    public void InvalidIDNumberExceptio(String args){
        System.out.println("Invalid ID number.Enter Correct ID Number.");
    }
}
class InvalidMarksException extends Exception{
    public void InvalidMarksExceptio(String args){
        System.out.println("Invalid Marks.Enter Correct Marks.");
    }
}
public class Main {
  public static void main(String[] args) {
      String line;
      int option;
      int n;
      String c[] = new String[3];
      Scanner sc = new Scanner(System.in);
    try {
      File fobj = new File("Students.txt");
      try{fobj.createNewFile();
          
          System.out.println("Do you want to append? If yes type '1', else press '2'");
          option = sc.nextInt();
          //System.out.println("\n");
          if (option == 1){
              Scanner sc2 = new Scanner(System.in);
               System.out.println("Enter comma separated values: 'Name','Id no.,'Total Marks'");
              String a = sc2.nextLine();
              c = a.split(",");
              System.out.println(Arrays.toString(c));
              try{
              int ID = Integer.parseInt(c[1]);
              if (ID<=100 || ID>200){
                  try{
                  throw new InvalidIDNumberException();
                  }
                  catch(InvalidIDNumberException ide){
                      System.out.println("Please enter correct ID Number. ID number must be from 100-200.");
                      System.exit(0);
                  }}
              int marks = Integer.parseInt(c[2]);
              if (marks>200){
                  try{
                  throw new InvalidMarksException();}
                  catch(InvalidMarksException me){
                      System.out.println("Please enter correct Marks. Total marks should not cross 500.");
                      System.exit(0);
                  }}}
              catch(NumberFormatException ne){
                  System.out.println("Invalid Number Format. Please Check.");
                  System.exit(0);
              }
              catch(ArrayIndexOutOfBoundsException ae){
                  System.out.println("Invalid input.Please Check.Give 3 comma-separated inputs.");
                  System.exit(0);
              }
              FileWriter myWriter = new FileWriter(fobj,true);
              myWriter.write(a);
              myWriter.write("\n");
              myWriter.close();
              System.out.println("Successfully wrote to the file.");}
              else if (option == 2){
                  "".isEmpty();
              }
      }
      catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    System.out.println("Do you want to read? If yes type '1', else press '2'");
    option = sc.nextInt();
      Scanner myReader = new Scanner(fobj);
      if (option == 1){
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        
      }
      myReader.close();
      }
       else if (option == 2){
                  "".isEmpty();
              }
      
    }catch(InputMismatchException ime){
        System.out.println("Invalid Command. Try again.");
        System.exit(0);
    } 
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try (Stream<String> lines = Files.lines(Paths.get("Students.txt"))) {
        System.out.println("Do you need any student's detail? If yes type '1', else press '2'");
        option = sc.nextInt();
        if (option == 1){
            System.out.println("Enter the serial number: ");
            n = sc.nextInt();
            line = lines.skip(n-1).findFirst().get();
            System.out.println(line);}
        else if (option == 2){
                  "".isEmpty();
              }
    }catch(InputMismatchException ime){
        System.out.println("Invalid Command. Try again.");
        System.exit(0);
    } 
    catch(IOException e){
        System.out.println(e);
      }
      }
}