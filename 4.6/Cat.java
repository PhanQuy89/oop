public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    public String toString(){
        return super.toString() + "Cat";
    }
}
