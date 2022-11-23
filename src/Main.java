public class Main {
    public static void main(String[] args) {
        //first part
        //task 1
        int total = 0;
        int money = 15_000;
        int monthNumber = 1;

        while (total <= 2_459_000) {
            total = total + total / 100 + money;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
            monthNumber++;
        }

        //task 2
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println("");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //task 3
        int population = 12_000_000;
        int fertilityPerYear;
        int mortalityPerYear;
        for (int i = 1; i <= 10; i++) {
            fertilityPerYear = population / 1000 * 17;
            mortalityPerYear = population / 1000 * 8;
            population = population + fertilityPerYear - mortalityPerYear;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
}
