public class largest{
public static void main(String [] args){
int arr[]= {1,6,4,2,5};
int larg = 0;

for(int i=0;i<arr.length;i++){
    if(arr[i]>larg){   
        larg = arr[i];
    }
}
System.out.println(larg);
}
}