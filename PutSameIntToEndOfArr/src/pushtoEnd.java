import java.util.Arrays;

public class pushtoEnd {
    public static void main(String[] args) {
        int[] testarr = {7, 0, 5, 9, 0, 0, 3, 4, 3, 2, 0, 2};
        //int[] testarr = {1,0,0,1,0,3};

        //System.out.println(Arrays.toString(ZeroAtEndArr(testarr)));

       // System.out.println(Arrays.toString(moveZerosToEnd(testarr)));
        System.out.println("Result: " + Arrays.toString(IfNonZeroSwapWithLastSpot(testarr)));
    }
    private static int[] IfNonZeroSwapWithLastSpot(int[] a){
        int ArrLen = a.length;
        int LastSpot = 0;
        int temp;

        for(int i = 0; i < ArrLen; i++){
            if(a[i] != 0){ //desired # to be moved

                temp = a[LastSpot];
                a[LastSpot] = a[i];
                a[i] = temp;
                LastSpot++;
            }
        }
        return a;
    }




    //ONLINE SOLUTION

  static int[] moveZerosToEnd(int arr[]) {

        // Count of non-zero elements
        int n = arr.length;
        int count = 0;
        int temp;

        // Traverse the array. If arr[i] is
        // non-zero, then swap the element at
        // index 'count' with the element at
        // index 'i'


        for (int i = 0; i < n; i++) {
            if ((arr[i] != 0)) {
                temp = arr[count];

                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;
    }
}


// LEGACY CODE : Has problem it skips if more than 1 zero next to each other

   /* private static int[] ZeroAtEndArr(int[] a){
        int LenArr = a.length;
        int temp = 0;
        int ArrCount = a.length;
        int Aa = 0;
        for(int i = 0; i < LenArr; i++){
            if(a[i] == 0) {                             //When desired element found
                temp = a[i];                            //Remmeber that element
                Aa = i;                                 //Remember our spot in list
                for (int j = 1; j < ArrCount; j++) {    //Do somtin for me the amount of times as length of list (cheap insurance)
                    a[Aa] = a[i + j];                   //starting w/ spot on list, swap with next spot
                    Aa++;                               //increase first spot (make 5th->4th, 4th->3rd... etc)
                }
                a[LenArr - 1] = temp;                   //Last element is the desired element found
            }
            ArrCount--;                                 //Decreases arr length so inner for loop doesnt blow up
            System.out.println(i);
        }
        return a;
    }
   */