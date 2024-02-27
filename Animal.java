//Abstraction
abstract class Animal {
    // Encapsulating the name and can be used by other defined methods
    // The set and get name
    private String name = "Animal";
    private int legs = 0;

    public void Sound(){
        System.out.println("Sound created!");
    }

    public void setChar(String newName, int newLegs){
        this.name = newName;
        this.legs = newLegs;
    }

    public String getName(){
        return name;
    }

    public int getLegs(){
        return legs;
    }
}

//Inheritance by extending from parent Animal
class Dog extends Animal{
    //Polymorphism
    public void Sound(){
        System.out.println("Guk GUk");
    }
}

//Inheritance by extending from parent Animal
class Cat extends Animal{
    //Polymorphism
    public void Sound(){
        System.out.println("Meong");
    }
}