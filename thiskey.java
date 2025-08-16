class Parent{
    int roll_no;
    String name;
    void display(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
        System.out.println("Roll no is:"+roll_no);
        System.out.println("Name is:"+ name);
    }
}
class thiskey{
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.display(91,"Harshkumar rana");
    }
}
