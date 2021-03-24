public class negativePositivearray {
    public static void arrange(int[] inp) {
        for( int i=0,j=inp.length-1;i<=j;){
            if(inp[i]<0 || inp[j]>0){
                if(inp[i]<0)    i++;
                if(inp[j]>0)    j--;
            }
            else{
                int t = inp[i];
                inp[i]=inp[j];
                inp[j] =t;
            }
        } 
        for(int i=0;i<inp.length;i++){
            System.out.println(inp[i]);
        }
    }

    public static void main(String[] args) {
        int inp[]= {-3,-5,3,2,-4,8,11};
        arrange(inp);

    }
}
