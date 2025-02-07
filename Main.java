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

        int income = 120_000; //створюємо змінну "уявний дохід"
        int incomeLev1 = 10_000;//макс рівень доходу для податків за ставкою 2,5%.
        int incomeLev2 = 25_000;//макс рівень доходу для податків за ставкою 4,3%.

        double tax;
        double taxP1 = 2.5;
        double taxP2 = 4.3;
        double taxP3 = 6.7;

        if (income <= incomeLev1) {
            tax = (income * taxP1) / 100;
            System.out.println("Tax = " + tax);

        } else if (income > incomeLev1 & income <= incomeLev2) {
            tax = (income * taxP2) / 100;
            System.out.println("Tax = " + tax);

        } else if (income >incomeLev2) {
            tax = (income * taxP3) / 100;
            System.out.println("Tax = " + tax);

        }

    }
}
