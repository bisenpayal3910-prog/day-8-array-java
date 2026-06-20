public class CountDuplicateElements {
      public static void main(String[] args) {

        int arr[] = {10, 20, 10, 30, 20};
        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate) {
                count++;
            }
        }

        System.out.println("Duplicate Count = " + count);
    }
}
