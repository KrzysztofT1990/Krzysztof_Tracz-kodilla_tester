import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;

    public int random() {
        Random los = new Random();
        int number;
        number = los.nextInt(31);
        return number;
    }

    public int min(int a) {
        if (a < min) {
            min = a;
        }
        return min;
    }

    public int max(int a) {
        if (a > max) {
            max = a;
        }
        return max;
    }

    public void req() {
        int pula = 0;
        int a;
        int numberMax = 0;
        int numberMin = 0;

        while (pula < 5000) {
            a = this.random();
            numberMin = this.min(a);
            numberMax = this.max(a);

            pula = pula + a;
            System.out.println("Do puli: " + (pula - a) + " dodano losową liczbę: " + a + " obecny wynik to: " + pula);
        }
        System.out.println("========================MAX-MIN===========================");
        System.out.println("Najmniejsza liczba z wylosowwanych to: " + numberMin);
        System.out.println("Największa liczba z wylosowanych to: " + numberMax);
    }

    public static void main(String[] args) {
        RandomNumbers suma = new RandomNumbers();
        suma.req();
    }
}


