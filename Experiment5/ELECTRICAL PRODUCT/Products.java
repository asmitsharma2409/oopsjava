import java.util.*;
class Product{
    int productId;
    String name;
    int categoryId;
    int unitPrice;
    Product(int productId,String name, int categoryId, int unitPrice){
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
}
class ElectricalProduct extends Product{
    int voltageRange;
    int wattage;
    ElectricalProduct(int productId,String name, int categoryId, int unitPrice, int voltageRange, int wattage){
        super(productId,name,categoryId,unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    void updateWattage(int wattage){
        this.wattage = wattage;
    }
    void updateVoltageRange(int voltageRange){
        this.voltageRange = voltageRange;
    }

    void diplayDetails(){
        System.out.println("Electrical Product Details: ");
        System.out.println("Product Name: " + this.name);
        System.out.println("Product ID: " + this.productId);
        System.out.println("Category ID: " + this.categoryId);
        System.out.println("Unit Price: " + this.unitPrice);
        System.out.println("Voltage Range: " + this.voltageRange);
        System.out.println("Wattage: " + this.wattage);
    }
}
public class Products{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String name = sc.nextLine();
        System.out.print("Enter the product id: ");
        int id = sc.nextInt();
        System.out.print("Enter the unit price: ");
        int unit = sc.nextInt();
        System.out.print("Enter the wattage: ");
        int watt = sc.nextInt();
        System.out.print("Enter the voltage range: ");
        int voltage = sc.nextInt();
        System.out.print("Enter the category id: ");
        int cat = sc.nextInt();
        System.out.println();
        ElectricalProduct fan = new ElectricalProduct(id, name, cat, unit, voltage, watt);
        fan.diplayDetails();

    }
}