import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        nano(arr);
        for (int num : arr) {
      System.out.print(num + " ");
}

    }
    public static void nano(int arr[]){
        int n=arr.length;
        for(int i=0; i < n-1; i++){
            int mini = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
                swap(i,mini,arr);
            }
        }
    }
    public static void swap(int i,int mini,int arr[]){
        int temp=arr[mini];
        arr[mini]=arr[i];
        arr[i]=mini;
    }
}