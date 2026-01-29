public class Updation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int position = 2;
        int element = 69;

        System.out.print("Before updation: ");
        for(int no:arr){
            System.out.print(no+" ");
        }


        System.out.print("              After Updation:");
        arr[position] = element;
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
