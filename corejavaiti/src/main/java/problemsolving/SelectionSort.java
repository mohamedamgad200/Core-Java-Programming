package problemsolving;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {10,9,4,2,5};
        int[] output = selectionSort(arr);
        for(int i:output)
        {
            System.out.println(i);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static int[] selectionSort(int[] arr) {
        //{10,9,4,2,5}
        //min index 0
        //min index 3
        //2,9,4,10,5
        //minindex=1
        //minindex=2
        //2,4,9,10,5
        //minindex=2
        //minindex=4
        //2,4,5,9,10 //sorted array o(n2)
        int minIndex;
        for(int i=0;i<arr.length-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
        return arr;
    }
}

