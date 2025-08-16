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
class Inheritance{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
        d1.Eat();
    }
}

