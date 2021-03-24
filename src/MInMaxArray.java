import java.util.Scanner;
public class MInMaxArray {
    public static int minArray(int[] inp){
        int min= inp[0];
        for(int i=1;i<inp.length;i++){
            if(min>inp[i]) min = inp[i];
        }
        return min;
    }
    public static int maxArray(int[] inp){
        int max= inp[0];
        for(int i=1;i<inp.length;i++){
            if(max<inp[i]) max = inp[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inp[] = new int[n];
        for(int i=0;i<n;i++){
            inp[i]=sc.nextInt();
        }

        System.out.println("Max : "+ maxArray(inp));
        System.out.println("Min : "+ minArray(inp));
        sc.close();
    }
}
