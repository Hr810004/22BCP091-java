class Employee2{
    public int id;
    public String name;

    public Employee2(){
        name= "Patel";
        id = 905;
       
    }
    public Employee2(String myname,int myid){
        name = myname;
        id = myid;
    }

    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
}
class ex3_4 {
    public static void main(String args[]) {
        
       Employee2 e2 =  new Employee2();
       Employee2 e3 = new Employee2("patel2", 55);

       System.out.println(e2.getname());
       System.out.println(e3.getname());

    }
}
