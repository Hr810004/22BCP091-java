interface Shape{
        void getArea();
}

class Rectangle implements Shape{
    public void getArea(){
        float length = 20;
        float breadth = 40;
        float area=length*breadth;
        System.out.println("Area of Recatngle is:" + area);
    }
}

class Circle implements Shape{
    public void getArea(){
            float pie = 22/7;
            float radius = 7;
            float area=pie * radius * radius;
            System.out.println("Area of Circle is:" + area);
        }
}

class Triangle implements Shape{
        public void getArea(){
            float height = 20;
            float base = 40;
            float area=1/2 * height * base;
            System.out.println("Area of Triangle is:" + area);
        }
}

class assign_6_4{
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Circle c1= new Circle();
        Triangle t1= new Triangle();
        r1.getArea();
        c1.getArea();
        t1.getArea();
    }
}
