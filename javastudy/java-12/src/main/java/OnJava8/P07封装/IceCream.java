package OnJava8.P07封装;

class Sundae{
    private Sundae(){};
    static Sundae makeASundae(){
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        Sundae sundae = Sundae.makeASundae();
    }
}