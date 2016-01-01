import java.util.*;

public class Fibonacci{

  public static void main(String[] args){
 
  long start = System.nanoTime();
  System.out.println("answer: " + fibDP(45));
  long end = System.nanoTime();
  long total = end - start;
  System.out.println(total + "ms");

  }
	public static int fibRecursion(int n){

      if(n==0) return 0;
      if(n==1) return 1;

      return fibRecursion(n-1) + fibRecursion(n-2);
  }

  private static final Map<Integer,Integer> f = new HashMap<Integer,Integer>();
  public static int fibMemoized(int n){

    if(n==0) return 0;
    if(n==1) return 1;

    if(f.containsKey(n)){
      return f.get(n);
    } else{
      f.put(n,fibMemoized(n-1) + fibMemoized(n-2));
      return fibMemoized(n-1) + fibMemoized(n-2);
    }
  }

  public static int fibMemoized2(int n){

    if(n==0) return 0;
    if(n==1) return 1;

    int[] f = new int[n+1];

    if(f[n] == n){
      return f[n];
    } else{
      return f[n] = fibMemoized(n-1) + fibMemoized(n-2);
    }
  }

  public static int fibDP(int n){

    int[] f = new int[n+1];

    f[0] = 0;
    f[1] = 1;
    for(int i=2; i<=n; i++)f[i] = f[i-1] + f[i-2]; 

    System.out.println(Arrays.toString(f));

    return f[n];
  }

  public static int fibIterative(int n){

    int back2 = 0;
    int back1 = 1;
    int next;

    if(n==0) return 0;

    for(int i=0; i<n; i++){
       next = back2 + back1;
       back2 = back2;
       back1 = next;
    }

    return (back2+back2);
  }
}