class Parent{
    int roll_no=91;
    String name="Harshkumar rana";
    final void display(){
        System.out.println("roll_no is:"+ roll_no);
        System.out.println("roll_no is:"+ name);
    }

}
class Child extends Parent{
    int roll_no=100;
    String name="Harsh rana";
    void display(){
        System.out.println("roll_no is:"+ roll_no);
        System.out.println("roll_no is:"+ name);
    }
}
class finalkey{
    public static void main(String[] args) {
    Child c1=new Child();
    c1.display();
}
}
