public class smallest {

public static void main(String[]args){
    int arr[]={1,0,2,3,4,5};
int small=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<small){
            small=arr[i];
        }
    }
    
    System.out.println(small);
}  

}
