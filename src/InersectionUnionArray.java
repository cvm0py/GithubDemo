import java.util.*;
public class InersectionUnionArray {
    static void intersection(Integer []arr1, Integer []arr2){
        System.out.println("Intersection");
        Set<Integer> s = new TreeSet<>(); 
        Collections.addAll(s, arr1); 
        Collections.addAll(s, arr2);
        System.out.print(s); 

    }
    static void union(Integer []arr1,Integer [] arr2) 
    { 
        // Create a set using array elements 
        System.out.println("Union");
        SortedSet<Integer> s = new TreeSet<>(); 
        Collections.addAll(s, arr1); 
        Collections.addAll(s, arr2);
        System.out.print(s); 
    } 
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inp[] = new int[n]; */
        Integer arr1[]={2,4,6,8,10,12};
        Integer arr2[]={1,3,4,6,12};
        union(arr1,arr2);
        intersection(arr1,arr2);

    }
    
}
