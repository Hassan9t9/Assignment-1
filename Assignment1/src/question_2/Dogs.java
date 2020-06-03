package question_2;

public class Dogs extends CreaturesMutualCharacteristics {

    public void bark(){
        System.out.print("\nBark");
    }

    public void run(){
        System.out.print("\nRun");
    }

    public void playDead(){
        System.out.print("\nPlayDead");
    }

    public void walk(){
        System.out.print("\nWalk");
    }

    @Override
    public void breathe() {
        System.out.print("\nBreathe");
    }

    @Override
    public void eatFood() {
        System.out.print("\nEat Food");
    }

    @Override
    public void pet() {
        System.out.print("\nPet");
    }
}

