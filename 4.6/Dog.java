public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("woof");
    }
    public void greets(Dog another){
        System.out.println("woof");
    }
    public String toString(){
        return "Dog";
    }
}