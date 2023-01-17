package Replit;

public class P088 {
    /*In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
*/
    String breed;
    String name;
    String color;
    public void bark(){
        System.out.println(breed+" barks a lot.");
    }
    public void run(){
        System.out.println("I have "+color+" color "+breed+" dog can run fast");
    }
    public void play(){
        System.out.println("My dog name is "+name+" and he likes to play");
    }

    public static void main(String[] args) {
        P088 dog = new P088();
        dog.name="kapil";
        dog.breed = "Husky";
        dog.color = "Red";
        dog.play();
        dog.run();
        dog.bark();
    }
}
