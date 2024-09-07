import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private double salary;
    private int dept;
    private String location;

    public Employee(int id, String name, double salary, int dept, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                ", location='" + location + '\'' +
                '}';
    }
}
public class EmployeeCRUDArrayListProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee>employeeList = new ArrayList<Employee>();

        while (true){
            System.out.println("1.Add Record !");
            System.out.println("2.Display Record !");
            System.out.println("3.Display All !");
            System.out.println("4.Update Record !");
            System.out.println("5.Delete Record !");
            System.out.println("6.Exit");
            System.out.println("7.Sorting name wise data display");

            System.out.println("Enter Choice !");
            int choice = scanner.nextInt();

            if(choice==1){
                System.out.println("Enter Employee id");
                int id = scanner.nextInt();

                System.out.println("Enter Employee name");
                String name = scanner.next();

                System.out.println("Enter Employee salary");
                double salary = scanner.nextDouble();

                System.out.println("Enter Employee dept");
                int dept = scanner.nextInt();

                System.out.println("Enter Employee location");
                String location = scanner.next();

                Employee employee = new Employee(id,name,salary,dept,location);
                employeeList.add(employee);

                System.out.println("Employee Successfully added ! \n");
            }
            else if(choice==2){
                if(employeeList.isEmpty()){
                    System.out.println("Empty list");
                }
                else{
                    System.out.println("Enter Employee Id ");
                    int id = scanner.nextInt();

                    boolean flag = false;
                   for(Employee employee:employeeList){
                       if(employee.getId()==id){
                           System.out.println(employee);
                           System.out.println();
                           flag=true;
                       }
                   }
                   if(!flag){
                       System.out.println("Invalid Id");
                   }
                }
            }
            else if(choice==3){
                for(Employee employee:employeeList){
                    System.out.println("Id : "+employee.getId()+" Name : "+employee.getName()+" "+"salary : "+employee.getSalary()+" "+"dept : "+employee.getDept()+" "+"location : "+employee.getLocation());
                }
            }
            else if(choice==4){
                System.out.println("Enter Employee Id !");
                int id = scanner.nextInt();

                boolean flag = false;

               for(Employee employee:employeeList){
                   if(employee.getId()==id){

                       System.out.println("Enter Employee name");
                       String name = scanner.next();

                       System.out.println("Enter Employee salary");
                       double salary = scanner.nextDouble();

                       System.out.println("Enter Employee dept");
                       int dept = scanner.nextInt();

                       System.out.println("Enter Employee location");
                       String location = scanner.next();

                       employee.setName(name);
                       employee.setDept(dept);
                       employee.setLocation(location);
                       employee.setSalary(salary);

                       System.out.println("Employee updated !");
                       flag=true;
                   }
               }
               if(!flag){
                   System.out.println("Invalid id");
               }
            }
            else if(choice==5){
                System.out.println("Enter Employee Id !");
                int id = scanner.nextInt();
                boolean flag = false;

                if(employeeList.isEmpty()){
                    System.out.println("List is empty !");
                }
                Iterator<Employee> iterator = employeeList.iterator();

                while(iterator.hasNext()){
                    if(iterator.next().getId()==id){
                        iterator.remove();
                        flag=true;
                    }
                }
                if(!flag){
                    System.out.println("Invalid Id");
                }
            }
            else if(choice==6){
                System.exit(1);
                System.out.println("Ended ...");
            }
            else if(choice==7){
                employeeList.stream().sorted((name1,name2)->name1.getName().compareTo(name2.getName())).forEach(System.out::println);
            }
            else{
                System.out.println("Please enter valid choice !");
            }
        }
    }
}
