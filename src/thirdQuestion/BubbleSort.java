package thirdQuestion;

public class BubbleSort {
   //O(n^2) better for large array
    public static void sort(int[] a){
        int n= a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        
    }
}
