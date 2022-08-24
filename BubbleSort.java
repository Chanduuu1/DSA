import java.util.*;


public class BubbleSort{    
    public static void sort(int a[]){
        int n = a.length;
        int temp;
        for(int turn = 0; turn <= n-2 ; turn++){
            for(int j = 0; j <= n-2-turn ; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int k = 0; i < n ; k++){
            System.out.print(a[i]);
        }
        
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        sort(arr);
    }
}