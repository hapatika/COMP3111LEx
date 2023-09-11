package Lab1;

public class myLibrary {

    public static int power(int b, int n){
        if (n==1)
            return b;
        else
            return b*power(b, n-1);
    }
    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
        }
}
