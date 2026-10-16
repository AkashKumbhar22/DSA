//Also called as linea search
//Must use boolean as it is a good practice in searching
public class Searching {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int search = 22;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.print("The element "+search+" is found at position: "+i);
                found = true;
               break;
        }
    }

    if(found == false){
        System.out.println("Element not found");
    }
}
}

