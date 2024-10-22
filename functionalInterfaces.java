@FunctionalInterface
interface IntegerOperation{
    //One abstact method
    int operate(int a,int b);
}
class Add implements IntegerOperation{
    @Override
    public int operate(int a,int b){
        return a+b;
    }
}
class Multiply implements IntegerOperation{
    @Override
    public int operate(int a,int b){    //instance method
        return a*b;
    }
}
public class functionalInterfaces {
    public static void main(String[] args) {
        /*Add a= new Add();
        System.out.println(a.operate(10, 20));
        Multiply m= new Multiply();
        System.out.println(m.operate(10, 20));*/
        IntegerOperation x= (a,b) -> a+b;
        System.out.println(x.operate(10, 20));
        IntegerOperation m= (a,b) -> a*b;
        System.out.println(m.operate(10, 20));
    }
}
