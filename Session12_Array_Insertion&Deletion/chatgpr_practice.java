// public class chatgpr_practice {
//     public static void main(String[] args) {
//        int arr[] = {3,6,9,12};
//         int key = 9;
//         boolean found = false;

//         for(int i =0;i<arr.length;i++){
//             if(arr[i] == key){
//                 System.out.println(i);
//                 found = true;
//                 break;
//             }
//         }
//     }
// }


// Question 3 (Medium — Deletion)

// Given:

// int arr[] = {10,20,30,40};
// int position = 1;
 //Delete the element at index 1.

// public class chatgpr_practice {
//     public static void main(String[] args) {
//        int arr[] = {10,20,30,40};
// int position = 1;

//         int new_array[] = new int[arr.length -1];
//         int j =0;

//         for(int i=0;i<arr.length;i++){
//             if(i==position){
//                 continue;
//             }

//             new_array[j] = arr[i];
//             j++;
//         }

//         for(int no : new_array){
//             System.out.println(no);
//         }        
//     }
// }



// Question 4 (Medium — Insertion)

// Given:

// int arr[] = {1,2,4,5};
// int position = 2;
// int element = 3;

// ❓ Insert 3 at index 2.

public class chatgpr_practice {
    public static void main(String[] args) {
    int arr[] = {1,2,4,5};
    int position = 2;
    int element = 3;

    int new_arr[] = new int[arr.length+1];
    new_arr[position] = element;

    for(int i=0;i<position;i++){
            new_arr[i] = arr[i];
    }


    for(int i =position+1;i<new_arr.length;i++){
        new_arr[i] = arr[i-1];
    }

    for(int no:new_arr){
        System.out.print(no+" ");
    }              


    }
}
