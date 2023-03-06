package firstQue;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int t=1;
        System.out.println("enter no. of loops ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                t=t+i;
            }
            else{
                t=t*i;
            }

        }
        System.out.println(t);
    }
    
}
