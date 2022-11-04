public class Programme_13_SharedDigit {

    public static boolean hasSharedDigit(int firstNumner, int secondNumber) {
        if ((firstNumner >= 10 && firstNumner <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            int firstNumberLastDigit = firstNumner % 10;
            int secondNumberLastDigit = secondNumber % 10;
            firstNumner /= 10;
            secondNumber /= 10;
            int firstNumberFirstDigit = firstNumner;
            int secondNumberFirstDigit = secondNumber;

            return ((firstNumberFirstDigit == secondNumberFirstDigit)) ||
                    (firstNumberFirstDigit == secondNumberLastDigit) ||
                    (firstNumberLastDigit == secondNumberFirstDigit) ||
                    (firstNumberLastDigit == secondNumberLastDigit);
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
}
