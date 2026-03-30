
public class printnum {
    public static void main(String[] args){
        // fun(5);
        System.out.println(count(102100));

    }
    static int count(int n){
        return  helper(n, 0);
    }
    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem =n%10;
        if(rem==0){
            return helper(n/10, ++c);
        }
        else{
            return helper(n/10,c);
        }
    }
    // static void fun(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     fun(n-1);
    // }

}
