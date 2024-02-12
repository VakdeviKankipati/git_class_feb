public class calculator {
    private int ans;
    public int add(int a){
        ans += a;
        return ans;
    }
    public int sub(int b){
        ans -= b;
        return ans;
    }
    public int mil(int a){
        ans = ans*a;
        return ans;
    }
}
