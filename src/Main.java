public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 7, 3, 11, 8};

        for(int i=0; i<arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//        for(int num : arr) {
//            System.out.print(num + " ");
//        }
    }
}