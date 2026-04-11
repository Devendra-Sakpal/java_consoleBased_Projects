   import java.util.ArrayList;
import java.util.Scanner;


public class toDoList{
    public static void main(String[] args) {
        ArrayList<String> Tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) { 
            
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("1.Add Task");
            System.out.println("2.Remove Task");
            System.out.println("3.View Task");
            System.out.println("4.Exit");
            System.out.println("Select Task");

            int Choice = sc.nextInt();

            if(Choice==4){
                System.out.println("Task Exit........");
                System.out.println("Thank You !");
                break;
            }

            if(Choice<1 || Choice>4){
                System.out.println("Select Valid Task..");
                continue;
            }


            sc.nextLine();

            switch(Choice){

                case 1:
                    System.out.println("Enter Task");
                    String action = sc.nextLine();
                    Tasks.add(action);

                break;

                case 2:
                    System.out.println("Enter task number to remove");
                    int taskIndex = sc.nextInt();

                    if(taskIndex>0 && taskIndex<=Tasks.size()){
                        Tasks.remove(taskIndex-1);
                        System.out.println("Task remove succesfully.");
                    }else{
                         System.out.println("Task number is incorrect.");
                    }
                break;

                case 3:
                    System.out.println("Your TO-Do List Is Here");
                    if(Tasks.isEmpty()){
                        System.out.println("No task added");
                    }else{
                        for (int i = 0; i < Tasks.size(); i++) {
                            System.out.println((i+1)+" "+Tasks.get(i));
                        }
                    }
                break;

            }
        }
    }
}