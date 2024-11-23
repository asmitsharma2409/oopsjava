class Fruit {
    String name;
    int price;
    String bunchOrSingle;

    Fruit(String name, int price, String bunchOrSingle){
        this.name = name;
        this.price = price;
        this.bunchOrSingle = bunchOrSingle;
    }
    void displayFruit(){
        System.out.println("Fruit: " + this.name + "\nBunch/Single: " + this.bunchOrSingle + "\nPrice: " + this.price);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple",180,"bunch");
        Fruit mango = new Fruit("Mango",150,"bunch");
        apple.displayFruit();
        mango.displayFruit();
    }
}
