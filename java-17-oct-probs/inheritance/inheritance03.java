// Multilevel inheritace


class superhero{
    void displaypower(){
        System.out.println("Superhero has unique powers");
    }
}

class Avenger extends superhero{
    void team(){
        System.out.println("Avenger is the part of the team");
    }
}

class Ironman extends Avenger{
    void fly(){
        System.out.println("I am iron man");
    }
}

public class inheritance03{
    public static void main(String[] args) {
        Ironman stark = new Ironman();
        stark.fly();
        stark.team();
        stark.displaypower();
    }
}