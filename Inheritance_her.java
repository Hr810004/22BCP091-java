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
    class Cat extends Animal{
        void sleep(){
            System.out.println("Cat is sleeping");
        }
    }
    class Inheritance_her{
        public static void main(String[] args) {
            Dog d1=new Dog();
            Cat c1=new Cat();
            c1.sleep();
            d1.bark();
            d1.Eat();
            c1.Eat();
        }
    }

