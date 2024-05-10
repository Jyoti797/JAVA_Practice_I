public class demo29 {
    public static void main(String[] args) {
        Aeroplane obj1 = new Cargoflight();
        Aeroplane obj2 = new Fighterjet();
        Aeroplane obj3 = new PassangerPlane();
        Aeroplane obj4 = new Fighterjet();
        Fighterjet obj5 = new Fighterjet();
        obj1.fly();
        obj2.carry();
        obj3.fly();
        obj4.beautiful();
        obj5.strike();
    }
}
abstract class Aeroplane{
    abstract void fly();
    abstract void carry();
    void beautiful(){
        System.out.println("Aeroplane is looking beautiful");
    }
}  
class PassangerPlane extends Aeroplane{
    void fly(){
        System.out.println("Boeing 777 is flying");
    }
    void carry(){
        System.out.println("Boeing 777 is acrrying passangers");
    }
}
class Cargoflight extends Aeroplane{
    void fly(){
        System.out.println("Cargo plane Airbus C-95 is flying");
    }
    void carry(){
        System.out.println("Airbus c-95 is carrying goods");
    }
}
class Fighterjet extends Aeroplane {
    void fly(){
        System.out.println("tejas mk-2 rapter is flying");
    }
    void carry(){
        System.out.println("tejas mk-2 is carrying troops ");
    }
    void strike(){
        System.out.println("F-22 rapter is raining missiles");
    }
}

