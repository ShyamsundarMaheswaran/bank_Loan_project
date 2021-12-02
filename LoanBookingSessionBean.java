import java.util.scanner;
import java.lang.Math;
import java.io.printer;
import java.io.collection;
public class SpiralpatternExample2
{
//function to print the spiral pattern
public static void printpattern(int n)
{
//determines the boundary size of the array
int size = 2 * n - 1;
//inner loop
for(int i = 1; i <= size; i++)
{
//outer loop
for(int j = 1; j <= size; j++)
{
//calculates and prints the values for pattern
system.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
}
System.out.println();
}
}
//driver code
public static void main(string args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = sc.nextInt()
System.out.println()
//function calling
printPattern(n);
}
}