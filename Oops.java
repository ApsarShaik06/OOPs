package OOPS;

public class Oops {
    public static void main(String args[]){
        Pen p1 = new Pen(); // creating Pen.
        p1.color = "Blue";
        p1.tipSize = 5;
        System.out.println(p1.color);
        System.out.println(p1.tipSize);
        p1.setColor("Black");
        System.out.println(p1.color);
        System.out.println(p1.getColor());

        Animal a1 = new Animal();

        Fish f1 = new Fish();
        System.out.println(f1.eat());
        System.out.println(f1.breathes());
        System.out.println(f1.swin());
    }
}

class Pen{
    String color;
    int tipSize;
    
    void setColor(String newColor){
        color = newColor;
    }

    String getColor(){
        return this.color;
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("Breathes");
    }
}

// single level inheritance
class Fish extends Animal{
    int swins;
    void swim(){
        System.out.println("Fish swims");
    }
}
