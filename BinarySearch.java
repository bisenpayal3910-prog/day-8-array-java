public class BinarySearch {
     public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int search = 40;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == search) {
                System.out.println("Found at Index " + mid);
                return;
            }
            else if(arr[mid] < search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");
    }
}
