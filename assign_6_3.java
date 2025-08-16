abstract class Employee{
    abstract void calculateSalary(float Salary);
    abstract void displayInfo();
}

class Manager extends Employee{
    void calculateSalary(float Salary){
        Salary = Salary - (Salary)*0.1f;
        System.out.println("Salary is:" + Salary);
    }
    void displayInfo(){
        int id=91;
        String name ="Harsh";
        System.out.println("Id is:" + id);
        System.out.println("Name is:" + name);
    }
}


class Programmer extends Employee{
    void calculateSalary(float Salary){
        Salary = Salary - (Salary)*0.1f;
        System.out.println("Salary is:" + Salary);
    }
    void displayInfo(){
        int id=103;
        String name ="Pal Shah";
        System.out.println("Id is:" + id);
        System.out.println("Name is:" + name);
    }
}

class assign_6_3{
    public static void main(String[] args) {
        Manager m1= new Manager();
        Programmer p1= new Programmer();
        m1.displayInfo();
        m1.calculateSalary(50000);
        p1.displayInfo();
        p1.calculateSalary(100000);
    }
}