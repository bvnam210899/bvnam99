package isp;

public class Dog implements IWalk {
    @Override
    public void walk() {
        System.out.println("dog can walk");
    }
}
