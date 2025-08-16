class Animal{
    void Eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Babydog extends Dog{
    void sleep(){
        System.out.println("Baby Dog is sleeping");
    }
}
class Inheritance_multi{
    public static void main(String[] args) {
        Babydog d1=new Babydog();
        d1.sleep();
	d1.bark();
        d1.Eat();
    }
}