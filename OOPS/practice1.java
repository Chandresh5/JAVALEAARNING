public class practice1{
    public static void main(String []mks){
        Car c1 = new Car();
        c1.setBrand("royals roys");
        System.out.println(c1.brand);
        c1.setModel("Rolls-Royce Spectre");
        System.out.println(c1.model);
        c1.setPrice( 90000000);
        System.out.println(c1.price);

    }
}
class Car{
    String brand;
    
    void setBrand(String newBrand){
        brand = newBrand;
    }
      String model;
    void setModel(String newModel){
        model = newModel;
    }
     double price;
    void setPrice(double newPrice){
        price = newPrice;
    }


}

