public class ZerosOnesArray {

    public static int[] sort(int[] inp){
        int zeros=0,Ones=0,Twos=0;
        for(int i=0;i<inp.length;i++){
            if(inp[i]==0)   zeros++;
            else if(inp[i]==1)   Ones++;
            else            Twos++;
        }
        int ans[]= new int[3];
        ans[0]=zeros;
        ans[1]=Ones;
        ans[2]=Twos;
        return ans;

    }
    public static void main(String[] args) {
        int inp[]= {1,1,0,2,0};
        int ans[] = new int[5];
        ans = sort(inp);
        for(int i=0;i<inp.length;i++){
            if(ans[0]-- > 0)  System.out.println('0');
            else if(ans[1]-- >0)   System.out.println('1');
            else if(ans[2]-- >0)   System.out.println('2');
        }
    }
}
