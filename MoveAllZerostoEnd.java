public class MoveAllZerostoEnd {
     public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 4};

        int index = 0;

        // Non-zero elements ko start me rakho
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Remaining positions me 0 bhar do
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
