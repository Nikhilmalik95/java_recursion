public class Fibonachi {

    

    static void fiboRec(int f , int s , int n){
        if(n == 0) return;

        int ans = f + s;
            f = s;
            s = ans;
            System.out.print(ans + " ");
            fiboRec(f, s, n-1);
         


    }

    static void fibo(int f , int s, int n){
        System.out.print(f + " ");
        System.out.print(s + " ");

        for(int i = 2; i<n; i++){
            int ans = f + s;
            f = s;
            s = ans;
            System.out.print(ans + " ");

        }
    }
    public static void main(String[] args) {
        int n = 10;
      //  int first = 0;
        //int second = 1;
       // fibo(first , second , n);

     //  System.out.print(first + " ");
       // System.out.print(second + " ");
      // fiboRec(first , second ,  n);

    }
}
