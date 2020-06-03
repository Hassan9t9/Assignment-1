package question_2;

public class Birds extends CreaturesMutualCharacteristics {

    public void fly(){
        System.out.print("\nFly");
    }

    public void singSong(){
        System.out.print("\nSingSong");
    }

    public void makeNest(){
        System.out.print("\nMakeNest");
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
