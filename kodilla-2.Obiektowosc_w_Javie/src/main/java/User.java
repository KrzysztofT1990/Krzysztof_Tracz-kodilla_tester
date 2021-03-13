public class User {

    String name;
    int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {

        User tomek = new User("Tomek", 20);
        User ela = new User("Ela", 25);
        User ania = new User("Ania", 19);
        User arek = new User("Arek", 35);
        User adam = new User("Adam", 17);
        User krzysiek = new User("Krzysiek", 27);
        User jola = new User("Jola", 16);
        User bartek = new User("Bartek", 13);
        User kasia = new User("Kasia", 29);
        User ida = new User("Ida", 32);

        User[] users = {tomek, ela, ania, arek, adam, kasia, krzysiek, jola, bartek, ida};

        int average = 0;
        for (User user : users) {
            average = average + user.year;
        }
        average = average / users.length;

        System.out.println("==========================");

        System.out.println("średnia wieku to: " + average + " lata, osoby poniżej średniej wieku to: ");
        for (User user : users) {
            if (user.year < average) {
                System.out.print(user.name + ", ");
            }
        }
        System.out.println("\n" + "==========================");
    }
}
