public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("900g", 499, 2021);
        System.out.println(notebook.weight + " " + notebook.price + "złoty" + " " + notebook.year + "r.");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();
        System.out.println("=========================");

        Notebook hevyNotebook = new Notebook("3000g", 850, 1999);
        System.out.println(hevyNotebook.weight + " " + hevyNotebook.price + "złoty" + " " + hevyNotebook.year + "r.");
        hevyNotebook.checkPrice();
        hevyNotebook.checkWeight();
        hevyNotebook.checkYearPrice();
        System.out.println("=========================");

        Notebook oldNotebook = new Notebook("1500g", 1500, 1995);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + "złoty" + " " + oldNotebook.year + "r.");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();
    }
}