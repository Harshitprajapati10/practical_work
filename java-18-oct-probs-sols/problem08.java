// create a class bulding with overloaded constuctors. Then create a class house that extends bulding , and use super() to call different constuctors from the superclass based on input paraemeters.


class Building{
    String name;
    int floors;
    Building(){
        this.name = "Default Building";
        this.floors = 1;
    }
    Building(String name){
        this.name = name;
        this.floors = 1;
    }
    Building(String name, int floors){
        this.name = name;
        this.floors = floors;
    }
    void displayInfo(){
        System.out.println("Building Name: " + name + ", Floors: " + floors);
    }
}

class House extends Building{
    House(){
        super();
    }
    House(String name){
        super(name);
    }
    House(String name, int floors){
        super(name, floors);
    }
}


public class problem08{
    public static void main(String[] args) {
        House h1 = new House();
        h1.displayInfo();
        House h2 = new House("My House");
        h2.displayInfo();
        House h3 = new House("NYC house", 3);
        h3.displayInfo();
    }
}