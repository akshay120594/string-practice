package fourthQuestion;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=0;
        for(int i=1;i<=n;i++){
            t+=Math.pow(i,i);
        }
        System.out.println(t);
        sc.close();
    }
    
}
