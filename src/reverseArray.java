/* Ques 1 Reverse Array
*/
import java.util.Scanner;
public class reverseArray {

    static int[] reverse(int [] arr){
        var ans = new int[arr.length];
        System.out.println("OUTPUT");
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr.length-i-1];
         }
         return ans;
    }

    public static void main(String[] args) {
        System.out.println("TESt Show");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans[] = new int[10];
        ans = reverse(arr);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }

}

