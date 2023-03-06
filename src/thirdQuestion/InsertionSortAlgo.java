package thirdQuestion;

public class InsertionSortAlgo {
    //O(n^2) better for small array
    public static void sort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int p= a[i];
            int j=i-1;
            while(j>=0 && a[j]>p){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=p;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }

    }
    
}
