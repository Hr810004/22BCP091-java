class const_Overload {
 
    const_Overload(String name,int age)
    {
        System.out.println("Method with 2 parameters called:");
        System.out.println("Name is:"+ name);
        System.out.println("Age is:" + age);
    }  
    const_Overload(String name,int age,int marks)
    {
        System.out.println("Same method with 3 parameters called:");
        System.out.println("Name is:"+ name);
        System.out.println("Age is:" + age);
        System.out.println("Marks is:" + marks);
    }
    public static void main(String[] args) 
    {
        const_Overload A1= new const_Overload("Harsh",18);
        const_Overload A2= new const_Overload("Harsh",18,97);
    }

}
