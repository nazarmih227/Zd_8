package d2;

public class TransactionValidator {
    static final double MIN_AMOUNT = 1.0;
    static final double MAX_AMOUNT = 5000.0;
    // объявите константы
    public static boolean isValidAmount(double Amount){
        if(Amount < MIN_AMOUNT){
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        else if(Amount > MAX_AMOUNT){
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода


}