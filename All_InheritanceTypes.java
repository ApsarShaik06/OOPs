package OOPS;

public class Oops {
    public static void main(String args[]){

        Fish f1 = new Fish();
        f1.eat();
        f1.swim();

        Shark s1 = new Shark();
        s1.eat();
        s1.size();
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
//   base class -- Animal
//         |
//         |
//  Derived Calss -- Fish

class Fish extends Animal{
    int swins;
    void swim(){
        System.out.println("Fish swims");
    }
}



// multi level Inheritance
//   base class -- Animal
//         |
//         |
//  Derived Calss -- Fish extends Animal
//         |
//         |
// Derived Calss -- Shark extenda Fish
class Shark extends Fish{
    void size(){
        System.out.println("small in size");
    }
}

//                           Hierarchical Inheritance
//                                base class -- Animal
//                                /            \
//                              /               \
//  Derived Calss -- Fish extends Animal     Derived class -- Dog

class Dog extends Animal{
    int legs;

    void sound(){
        System.out.println("Boww..Boww");
    }
}

// below code for Hybrid Inheritance
//                                base class -- Animal
//                                /            \     \
//                              /               \     -------------------\
//  Derived Calss -- Fish extends Animal     Derived class -- Dog       Bird
//           /         \                        /     \                  |
//        Shark       Tuna              Female dog  Male-Dog           Crow


