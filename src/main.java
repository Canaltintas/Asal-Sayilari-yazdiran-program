public class main {
    public static void main(String[] args) {

        boolean isPrime = false;
        for (int i =2;i<=100;i++){
            isPrime=true;
            for (int k=2 ; k<i;k++){
                if (i % k ==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
