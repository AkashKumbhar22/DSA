public class Delete {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int position = 3;  // The position of eleent which we have to delete 

        int new_arr[] = new int[arr.length-1];     //The new_array which will be formed after the deletion
        int j = 0;                                  //The indexing of new_array


        System.out.print("Before Deletion: ");
        //The array before deleting
        for(int i=0;i<arr.length;i++){
        System.out.print( arr[i]);
        }


        System.out.print("                        After Deletion:");
        for(int i=0;i<arr.length;i++){
            if(i==position){                        //If the value of i is equal to the position of the element we skip that position
                continue;
            }
            
        
            new_arr[j] = arr[i];                   //copy the value of arra in new_array
                j++;
            }

            for(int x:new_arr){
                System.out.print(x);
            }
        }

    }

