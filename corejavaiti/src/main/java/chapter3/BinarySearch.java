package chapter3;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int output=binarySearch(arr,0,arr.length-1,5);
        System.out.println("Searched Result "+output);
    }
    public static int binarySearch(int[]arr,int left,int right,int searchNumber) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchNumber) {
                return arr[mid];
            }
            if (arr[mid] < searchNumber) {
                left = mid + 1;
            }
            if (arr[mid] > searchNumber) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
