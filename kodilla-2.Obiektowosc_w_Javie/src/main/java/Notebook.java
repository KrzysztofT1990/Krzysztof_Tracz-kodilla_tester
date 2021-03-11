public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        switch (this.weight) {
            case "900g":
                System.out.println("Dane urządzenie jest lekkie");
                break;
            case "1500g":
                System.out.println("Niezbyt ciężkie");
                break;
            case "3000g":
                System.out.println("Bardzo ciężkie");
                break;
            default:
                System.out.println("Brak danych o wadze");
                break;
        }
    }

    public void checkYearPrice() {
        if (this.price < 1000 && this.year >= 2000) {
            System.out.println("Dobra oferta !!");
        } else if (this.price >= 1000 && this.year < 2000) {
            System.out.println("Zła oferta");
        } else {
            System.out.println("Brak komunikatu");
        }
    }

}