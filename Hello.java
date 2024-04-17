

import java.util.*;

public class Hello {

    public static void printNum(int n){
        if(n == 0) return ;

        System.out.print(n + " ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int x = Integer.parseInt(sc.nextLine());
       sc.close();
       printNum(x);
    }
}
