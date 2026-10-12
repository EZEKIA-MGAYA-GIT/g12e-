

public class mbeya {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            //  // if (num==2){
            //  System.out.println(2);}
            for (int a = 2; a > num; a++) {
                if (num % a == 0) {
                    isPrime = false;
                    break;
                }
                }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}