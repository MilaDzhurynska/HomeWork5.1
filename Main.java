public class Main {
    public static void main(String[] args) {
        /*
        Необхідно розрахувати суму податку від певної суми доходу.
        Сума податку дорівнює відсотку від суми доходу.
         Доходи оподатковуются за прогресивною шкалою оподаткування:
        - від 0 до 10000, включно, за ставкою 2,5%.
        - від 10000, виключно, до 25000, включно, за ставкою 4,3%.
        - більше 25000, за ставкою 6,7%.
         */

        int income = 1000_000; //мріяти ніхто не забороняв ;)
        double tax;

        if (income <= 10000) {
            tax = (income * 2.5) / 100;
            System.out.println("Tax = " + tax);

        } else if (income > 10000 & income <= 25000) {
            tax = (income * 4.3) / 100;
            System.out.println("Tax = " + tax);

        } else if (income >25000) {
            tax = (income * 6.7) / 100;
            System.out.println("Tax = " + tax);

        }

    }
}
