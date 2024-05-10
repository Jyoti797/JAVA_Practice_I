public class demo10 {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int result = obj.mul(15, 25);
        System.out.println(result); 
    }
}
class Calc
{
    public int sum(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
}
class AdvCalc extends Calc
{   
    public int mul (int a, int b){
        return a*b;
    }
    public float divison(int a, int b){
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc{
  
    public int square(int a){
        int y = (int) a * a;
        return y;
    }
    public int cube (int a){
        int y = (int) a * a * a;
        return y;
    }
}

