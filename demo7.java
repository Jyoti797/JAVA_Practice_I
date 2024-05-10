public class demo7 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Realme";
        obj1.price = 29000;
        obj2.brand = "Samsung";
        obj2.price = 33000;
        obj1.name = "11 pro 5G";
        obj2.name = "Galaxy S21FE 5G";
        Mobile.show(obj2);
        Mobile.show(obj1);
    
   }
}
class Mobile{
    String brand;
    int price;
    String name;
    public static void show(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }
}

