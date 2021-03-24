import java.util.*;
import java.util.Collections;
public class kthMinMaxArray {
    public static int minArray(int [] inp, int k){
        PriorityQueue<Integer> pQueue  = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<inp.length;i++){
                pQueue.add(inp[i]);
                if(pQueue.size() > k) pQueue.poll();
        }

        return pQueue.peek();
    }
    public static int maxArray(int[] inp, int k){
        PriorityQueue<Integer> pQueue  = new PriorityQueue<Integer>();
        for(int i=0;i<inp.length;i++){
                pQueue.add(inp[i]);
                if(pQueue.size() > k) pQueue.poll();
        }
        return pQueue.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inp[] = new int[n];
        for(int i=0;i<inp.length;i++){
            inp[i]= sc.nextInt();
        }
        System.out.print("Enter K :");
        int k = sc.nextInt();
        System.out.println(k+"th Min Value : "+ minArray(inp,k));
        System.out.println(k+"th Max Value : "+ maxArray(inp,k));
        sc.close();
    }
}
