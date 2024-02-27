
        /* The answers for the time complexity questions
        1. O(1)
        2. O(n)
        3. O(log n) -> Binary Search
        4. O(n^2) -> Quick Sort
        5. O(n^2) -> Bubble Sort
        */

public class TA {
    public static void main(String[] args) {
        //Animal animal = new Animal(); -> Error
        //Can not be instantiated because it is an abstraction class
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setChar("Dog",4);
        System.out.println(dog.getName());
        System.out.println("Legs: "+ dog.getLegs());
        dog.Sound();
        cat.setChar("Cat",4);
        System.out.println(cat.getName());
        System.out.println("Legs: " + cat.getLegs());
        cat.Sound();
        }
    }
