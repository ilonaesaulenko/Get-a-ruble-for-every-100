public class Main {
    public static void main(String[] args) {

        //Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int initialAccount = 1_230;
        int replenishment = 1_070;

        int bonus;
        if (replenishment > 1_000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;

        }

        int fin = initialAccount + replenishment + bonus;

        System.out.println("Итоговый счет:" + fin);
        System.out.println("Бонусные рубли:" + bonus);

    }
}
