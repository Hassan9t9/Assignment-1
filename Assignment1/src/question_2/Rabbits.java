package question_2;

public class Rabbits extends CreaturesMutualCharacteristics {

    public void hop(){
        System.out.print("\nHop");
    }

    public void burrow(){
        System.out.print("\nBurrow");
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
