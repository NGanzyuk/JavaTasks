public class Checker {
    public static int checkYear(int year, int days) {
        int resDays = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            resDays = 366;
        } else {
            resDays = 365;
        }

        return resDays;
    }
}
