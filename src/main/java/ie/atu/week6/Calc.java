package ie.atu.week6;

public class Calc {
    private int ans;

    public Calc(){ ans = 0; }

    public int Add(int a, int b){
        ans = a + b;
        return ans;
    }

    public  int Subtract(int a, int b){
        ans = a - b;
        return ans;
    }

    public int Multiply(int a, int b){
        ans = a * b;
        return ans;
    }

    public int Divide(int a, int b){
        ans = a/b;
        return ans;
    }
}
