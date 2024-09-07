package map.project;

import java.util.Scanner;
import java.util.Stack;

public class StackProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer>stack = new Stack<>();

        while(true){
            System.out.println("1.Add/Push");
            System.out.println("2.Display");
            System.out.println("3.Pop/remove");
            System.out.println("4.Peek/top");
            System.out.println("5.Quit");


            int choice = scanner.nextInt();

            if(choice==1){
                System.out.println("Enter your number for push in stack !");
                int num = scanner.nextInt();

                stack.push(num);

                System.out.println("Push Successfully Done !");
            }
            else if(choice==2){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty");
                }
                else{
                    System.out.println(stack);
                }
            }
            else if(choice==3){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty ");
                }
                else{
                    stack.pop();
                }
            }
            else if(choice==4){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty !");
                }
                else{
                    System.out.println("Top element "+stack.peek());
                }
            }
            else if(choice==5){
                System.exit(1);
            }
            else{
                System.out.println("Please enter valid choice !");
            }
        }
    }
}
