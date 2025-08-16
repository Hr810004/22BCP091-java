import java.util.Scanner;
class Employee{
    public static void main(String[] args) {
            int id;
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee id:");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee name:");
            name=sc.nextLine();
            System.out.println("Entered id is:" + id);
            System.out.println("Entered id is:" + name);
            sc.close();
     }
}


