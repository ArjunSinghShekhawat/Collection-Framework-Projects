package map.project;

import java.util.*;

public class ManuBookMapProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Double>map = new HashMap<>();
        while (true){

            System.out.println("1.Add book");
            System.out.println("2.Update book");
            System.out.println("3.Display book");
            System.out.println("4.Remove book");
            System.out.println("5.Quit");

            System.out.println("Enter your choice !");
            int choice=0;
            try{
                choice = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }

            if(choice==1){
                System.out.println("Enter Book Name !");
                String book = scanner.next();
                if(map.containsKey(book)){
                    System.out.println("This book is already present !");
                }else{
                    System.out.println("Enter Price !");
                    Double price = scanner.nextDouble();

                    map.put(book,price);
                    System.out.println("Book added successfully !");
                }
            }
            else if(choice==2){
                System.out.println("Enter your updated book name !");
                String book = scanner.next();

                if(map.containsKey(book)){
                    System.out.println("Enter print name !");
                    Double price = scanner.nextDouble();
                    map.put(book,price);
                    System.out.println("Book successfully updated !");
                }
                else{
                    System.out.println("Book Not present !");
                }
            }
            else if(choice==3){
                System.out.println("Enter book name ");
                String book = scanner.next();

                if(map.containsKey(book)){
                    System.out.println(map.get(book));
                    System.out.println("Book display successfully !");
                }
                else{
                    System.out.println("Invalid book name !");
                }
            }
            else if(choice==4){
                System.out.println("Enter book name !");
                String book = scanner.next();

                if(map.containsKey(book)){
                    map.remove(book);
                    System.out.println("book remove successfully ");
                }
            }
            else if(choice==5){
                System.out.println("End ");
                System.exit(1);
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}
