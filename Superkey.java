class Parent{
    int Roll_no=91;
    String name="Harsh rana";
    void display(){
        System.out.println("Roll no is:" + Roll_no);
        System.out.println("Name is:" + name);
    }
}
class Child extends Parent{
    int Roll_no=100;
    String name="Harshkumar rana";
    void display(){
        System.out.println("Roll no is:" + Roll_no);
        System.out.println("Name is:" + name);
        super.display();
    }
}
class Superkey{
    public static void main(String[] args){
    Child c1=new Child();
    c1.display();
    }
}
