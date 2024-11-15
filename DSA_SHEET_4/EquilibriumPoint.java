import java.util.*;
public class EquilibriumPoint {
public static int equilibrium(int[] arr) {
int n=arr.length;

if(n==1){
return 1;
}
long prefix[] = new long[n];
long suffix[] = new long[n];
prefix[0]=arr[0];
for(int i=1; i<n; i++){
prefix[i]=prefix[i-1]+arr[i];
}
suffix[n-1]=arr[n-1];
for(int i= n-2; i>=0; i--){
suffix[i]=suffix[i+1]+arr[i];
}
for(int i=0; i<n; i++){
if(prefix[i]==suffix[i]){
return i+1;
}
}
return -1;
}
public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter the elements:");
    for(int i=0; i<n; i++) {
    arr[i] = sc.nextInt();
    }
    System.out.println("The equilibrium is: "+equilibrium(arr));
    sc.close();
    }
    }