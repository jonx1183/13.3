import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileWriteRead {
  Person p1 = new Person();
  Person p2 = new Person();
  Person p3 = new Person();

  public static void main(String[] args) {
    FileWriteRead main = new FileWriteRead();
    main.go();
  }

  public void go() {
    cretePerson();
    writeToFile();
    readFromFile();
  }

  public void cretePerson(){
    p1.setName("Jhon");
    p1.setAge(20);
    p1.setSex('m');

    p2.setName("Jane");
    p2.setAge(33);
    p2.setSex('f');

    p3.setName("Tom");
    p3.setAge(23);
    p3.setSex('m');
  }

  public void writeToFile(){
    String destination = "fileTest1.txt";

    try(PrintStream ps = new PrintStream(destination)){
      ps.println("Name: " +p1.getName());
      ps.println("Age: " +p1.getAge());
      ps.println("Sex: " +p1.getSex());
    } catch (FileNotFoundException e){
      System.out.println("File not found!");
    }

  }
  public void readFromFile(){
   try {
     File myFile = new File("fileTest1.txt");
     Scanner sc = new Scanner(myFile);

     while (sc.hasNextLine()) {
       String date = sc.nextLine();
       System.out.println(date);
     }
   } catch(FileNotFoundException e){
      System.out.println("File not found");
    }
  }
}
