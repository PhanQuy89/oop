public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Wooow");
    }
    public void greets(Dog anotherDog)
    {
        System.out.println("Woooooow");
    }
    public void greets(BigDog anotherBigDog) {
        System.out.println("Wooooooooow");

    }
}