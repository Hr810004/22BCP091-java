class DMD {
    void display(){
        System.out.println("Parent class has been called");
    }
}

class DMD2 extends DMD{
    void display(){
        System.out.println("Child class has been called");
    }
}

class DMD3{
    public static void main(String[] args) {
        DMD d1=new DMD();
        DMD2 d2=new DMD2();
        DMD r;
        r = d1;
        r.display();
        r = d2;
        r.display();
    }
}
