import java.util.ArrayList;

public class PrintPermutations {
    public static void printF(int ind, ArrayList<Integer> ds,int[] arr,int n){
      
        if(ind==n){
            for (int i:ds) {
                System.out.println(i);
            }
            return;
        }
        ds.add(arr[ind]);
        printF(ind+1,ds,arr,n);
        ds.remove(arr[ind]);
        printF(ind+1,ds,arr,n);
    }

    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=arr.length;
        ArrayList<Integer> ds=new ArrayList<>();
        printF(0,ds,arr,n);
    }
}
