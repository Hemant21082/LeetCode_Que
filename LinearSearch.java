public class LinearSearch {

    public static int linear_Search(int arr[],int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int res_index = linear_Search(arr, 5);
    }
}
