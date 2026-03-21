public class Reverse_array{
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        int start = 0;
        int end = arr.length - 1;

     while(start <= end){
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;

        System.out.println("The element at index" + start + ": " + (arr[start]) );
        start ++;
        end--;
     }

    }
}

