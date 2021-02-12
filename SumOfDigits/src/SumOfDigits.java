public class SumOfDigits {


    public static void main(String[] args){

        SumOfDigits sum = new SumOfDigits();
        System.out.println(sum.sumOfDigits(10));
    }

    int sumOfDigits(int a ){

        int sum = 0;
        while (a>0){
            sum += a%10;
            a /= 10;
        }
        return sum;
    }
}
