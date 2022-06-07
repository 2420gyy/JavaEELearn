package day07.debugTest.methods;

public class Add {
    public int add(int a,int b){
        if(a>b){
            a+=a*2;
        }else {
            b+=b*2;
        }
        for (int i = 0; i < 3; i++) {
            a+=i;
        }
        if(a==b){
            a+=(a+b);
        }
        return a+b;
    }
}
