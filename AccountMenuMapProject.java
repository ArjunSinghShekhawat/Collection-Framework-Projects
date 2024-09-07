package map.project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account{
    private String name;
    private int number;
    private Double balance;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                ", location='" + location + '\'' +
                '}';
    }
}
public class AccountMenuMapProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer,Account>accountMap = new HashMap<>();

        while(true){
            System.out.println("1.Add Account");
            System.out.println("2.Update Account");
            System.out.println("3.Display Account");
            System.out.println("4.Remove Account");
            System.out.println("5.Quite");
            System.out.println("6 Get All Data");


            System.out.println("Enter your choice !");
            int choice = scanner.nextInt();

            if(choice==1){
                System.out.println("Enter account number");
                int number  = scanner.nextInt();

                if(accountMap.containsKey(number)){
                    System.out.println("Account Already exists");
                }
                else{
                    System.out.println("Enter name ");
                    String name  = scanner.next();

                    System.out.println("Enter Balance ");
                    Double balance =scanner.nextDouble();

                    System.out.println("Enter Location ");
                    String location = scanner.next();

                    Account account = new Account();
                    account.setBalance(balance);
                    account.setName(name);
                    account.setLocation(location);
                    account.setNumber(number);

                    accountMap.put(number,account);
                    System.out.println("Account successfully created !");
                }
            }
            else if(choice==2){
                System.out.println("Enter account number");
                int number  = scanner.nextInt();

                if(accountMap.containsKey(number)){
                    Account account = accountMap.get(number);

                    System.out.println("Enter name ");
                    String name  = scanner.next();

                    System.out.println("Enter Balance ");
                    Double balance =scanner.nextDouble();

                    System.out.println("Enter Location ");
                    String location = scanner.next();

                    account.setBalance(balance);
                    account.setName(name);
                    account.setLocation(location);

                    accountMap.put(number,account);
                    System.out.println("Account successfully updated !");
                }
                else{
                    System.out.println("Invalid account number");
                }
            }
            else if(choice==3){
                System.out.println("Enter account number");
                int number  = scanner.nextInt();

                if(accountMap.containsKey(number)){
                    System.out.println(accountMap.get(number));
                }
                else{
                    System.out.println("Invalid account number !");
                }
            }
            else if(choice==4){
                System.out.println("Enter account number");
                int number  = scanner.nextInt();

                if(accountMap.containsKey(number)){
                    accountMap.remove(number);
                    System.out.println("Account remove successfully !");
                }
                else{
                    System.out.println("Invalid number !");
                }
            }
            else if(choice==5){
                System.out.println("Ended ...");
                System.exit(1);
            }
            else if(choice==6){
                accountMap.entrySet().
                        stream().
                        sorted(Map.Entry.comparingByValue((obj1,obj2)->obj1.getName().compareTo(obj2.getName())))
                        .forEach(System.out::println);
            }
            else{
                System.out.println("Invalid choice !");
            }
        }

    }
}
