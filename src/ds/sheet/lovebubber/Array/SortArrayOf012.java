package ds.sheet.lovebubber.Array;

/*
    my Approch
                * take the array and sort it by using inbuild liberary funtions
                  and then just print it

    better Approch

                DNF Alog - for refercne -> http://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/

 */




import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int [] ar = {2,1,2,0,0,1};
        arrySort(ar);
        arprint(ar);
    }

    private static void arprint(int[] ar) {

//            using liberary function
        System.out.print(Arrays.toString(ar));

    }

    private static void arrySort(int[] ar) {

      //  Arrays.sort(ar);   by my apprch

      // better approch
        int mid = 0;
        int low = 0;
        int high = ar.length -1 ;


        while(mid <= high){

            if(ar[mid] == 0){
                int temp = ar[low];
                ar[low] = ar[mid];
                ar[mid] = temp;
                mid++;
                low++;
            }
            else if(ar[mid] == 1){
                mid++;
            }
            else {
                int temp = ar[high];
                ar[high]  = ar[mid];
                ar[mid] = temp;
                high -- ;
            }
        }

    }
}
