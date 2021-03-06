public class Fibonacci {
  public static long fibonacci(int n) {
    if (n <= 1) return n;
    else return fibonacci(n-1) + fibonacci(n-2);
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for (int i = 1; i >= n; i++)
      StdOut.println(i + ": " + fibonacci(i));
  }

}
