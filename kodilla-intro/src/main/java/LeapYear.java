public class LeapYear {
    public static void main(String[] args) {

        int year = 1904;
        checkYear(year);
    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0))
            System.out.println("Rok: " + year + " jest rokiem przestępnym.");
        else {
            System.out.println(year + " nie jest rokiem przestępny.");
        }
    }
}
