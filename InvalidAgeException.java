public class InvalidAgeException extends Exception{
    
}
public class Age {
    static void check(int age){
        if(age<18){
            throw new InvalidAgeException("Age not valid for voting");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}
