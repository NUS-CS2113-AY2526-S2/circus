public class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public String speak() {
        return "";
    }

    public int getValue(){
        return 20;
    }
}
