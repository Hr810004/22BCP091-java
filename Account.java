import java.util.Scanner;
class Account {
    static int balance;
    void account(int initialbalance)
    {
        int balance = initialbalance;
    }
    void deposit(int amount){
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount add to previous balance is:" + amount);
            System.out.println("Updated balance is:" + balance);
        }
        else{
            System.out.println("Invalid amount,balance is:" + balance);
        }
    }
    void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn is:" + amount);
            System.out.println("Updated balance is:" + balance);
        }
        else{
            System.out.println("Not enough balance, Balance avaialable is:" + balance);
        }
    }
    void show(){
        System.out.println(balance);
    }
    public static void main(String[] args) 
    {
        int money,choice;
        Scanner sc = new Scanner(System.in);
        Account d1= new Account();
        while(true)
        {
            System.out.println("Enter your choice\n1.Deposit\n2.Withdraw\n3.Show balance\n4.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the amount you want to deposit:");
                money = sc.nextInt();
                d1.deposit(money);
                break;
                case 2:
                System.out.println("ENter the amount you want to withdraw:");
                money = sc.nextInt();
                d1.withdraw(money);
                break;
                case 3:
                if(balance==0){
                    System.out.println("Balance is empty...");
                }
                else{
                    System.out.println("Balance available is:" + balance);}
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Invalid choice\n");
                continue;
            }
        }
    }
}
