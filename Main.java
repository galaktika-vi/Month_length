import java.util.Scanner;

public class Main {

    enum Month {
        ЯНВАРЬ(31),
        ФЕВРАЛЬ(28),
        МАРТ(31),
        АПРЕЛЬ(30),
        МАЙ(31),
        ИЮНЬ(30),
        ИЮЛЬ(31),
        АВГУСТ(31),
        СЕНТЯБРЬ(30),
        ОКТЯБРЬ(31),
        НОЯБРЬ(30),
        ДЕКАБРЬ(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String userInput = scanner.nextLine().toUpperCase();

        try {
            Month month = Month.valueOf(userInput);
            String dayWord;
            switch (month.getDays()) {
                case 30:
                    dayWord = "дней";
                    break;
                case 31:
                    dayWord = "день";
                    break;
                default:
                    dayWord = "дней";
            }
            System.out.println("Длительность месяца " + month.getDays() + " " + dayWord + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Такого месяца нет. Проверьте ввод и попробуйте снова.");
        }
    }
}
