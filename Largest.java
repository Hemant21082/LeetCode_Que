public class Largest {

    public static int largest_in_arr(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,25,63,12,877};
        int largest = largest_in_arr(arr);
        System.out.println("Largeset in array : "+largest);
    }
}
