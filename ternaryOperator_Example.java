public class ternaryOperator_Example {
    // find the second largest number 
    public static void main(String[] args) {
      
        
        int a = 8, b = 4, c = -3;
    
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        int second_largest = (largest ==a) ? (b>c ? b:c):((largest==b) ? (a>c ? a:c):(a>b ? a:b));
        
        System.out.println("Largest Number: " + second_largest);
      }
}
