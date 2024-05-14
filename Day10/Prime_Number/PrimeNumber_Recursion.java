package Day10.Prime_Number;

public class PrimeNumber_Recursion {
    public static void main(String[] args) {
     
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.println("It is a prime number: "+i);
            }
        }
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
