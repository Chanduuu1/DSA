public class CountingSort{
    public static void countSort(int arr[]){
        // for finding maximum element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // creating count arr
        int count[] = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++; 
        }
        // Now Sorting
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            } 
        }

    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        countSort(arr);
        printArr(arr);

    }
}