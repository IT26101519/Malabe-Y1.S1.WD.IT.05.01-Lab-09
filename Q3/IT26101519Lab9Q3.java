public class IT26101519Lab9Q3 {
 public static int add(int x, int y) {
        return x + y;
    }
 public static int multiply(int x, int y) {
        return x * y;
    }
 public static int square(int x) {
        return x * x; // multiply(x, x) nu kooda eluthalam
    }
 public static void main(String[] args) {
         int step1 = multiply(3, 4);     
        int step2 = multiply(5, 7);      
        int step3 = add(step1, step2);   
        int result1 = square(step3);     

        int a1 = add(4, 7);              
        int sq1 = square(a1);            
        
        int a2 = add(8, 3);              
        int sq2 = square(a2);           
        
        int result2 = add(sq1, sq2);    

        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
    }
}