package problemsolving;

public class SecontHighstinunsortedarray {
    public static void main(String[] args) {
        int []arr={5,10,4,8,20,2};//20 10
        int firstHighest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstHighest)
            {
                secondHighest=firstHighest;
                firstHighest=arr[i];
            }
            if(arr[i]<firstHighest&&arr[i]>secondHighest){
                secondHighest=arr[i];
            }
        }
        System.out.println("First highest is "+firstHighest);
        System.out.println("Second highest is "+secondHighest);
    }
}
