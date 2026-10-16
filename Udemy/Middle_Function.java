public class Middle_Function {
    public static int[] middle(int arr[]){
        if(arr.length < 2){
            return new int[0]; 
        }
        int result[] = new int[arr.length-2];

            for(int i = 0; i < result.length ; i++){
                result[i] = arr[i+1];
            }
            return result;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4};

        int[] res = middle(arr);

        for(int i = res.length-1 ; i >= 0 ; i--){
            System.out.println(res[i]);
        }
    }
}
