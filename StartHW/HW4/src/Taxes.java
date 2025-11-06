public class Taxes {
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        return Math.max((earnings - spendings) * 15 / 100, 0);
    }

    public static int taxUSN(int earnings) {
        return earnings * 6 / 100;
    }

    public static void recommendTax(int earnings, int spendings) {
        int usnTax = taxUSN(earnings);
        int taxMinusSpendings = taxEarningsMinusSpendings(earnings, spendings);
        String resTax;
        int chosenTax;
        int economy;
        int altTax;
        if (taxMinusSpendings == 0 || usnTax <= taxMinusSpendings) {
            resTax = "УСН доходы";
            chosenTax = usnTax;
            economy = (taxMinusSpendings == 0) ? -1 : taxMinusSpendings - usnTax;
            altTax = taxMinusSpendings;
        } else {
            resTax = "УСН доходы минус расходы:";
            chosenTax = taxMinusSpendings;
            economy = usnTax - taxMinusSpendings;
            altTax = usnTax;
        }
        System.out.println("Мы советуем вам " + resTax);
        System.out.println("Ваш налог составит: " + chosenTax + " рублей");
        if (economy == -1) {
            System.out.println("Нет возможности использовать другой тип налогообложения");
        } else {
            System.out.println("Налог на другой системе: " + altTax + " рублей");
            System.out.println("Экономия: " + economy + " рублей");
        }
    }
}
