import java.util.Random;

public class RandomNumbers {

    public int random() {
        Random los = new Random();
        int number;
        number = los.nextInt(31);
        return number;
    }

    public void req() {
        int pula = 0;
        int a;
        int min = 30;
        int max = 0;

        while (pula < 5000) {
            a = this.random();

            if (min > a) {
                min = a;
            } else if (max < a) {
                max = a;
            }
            pula = pula + a;
            System.out.println(pula + " do poprzedniej wartosći dodano: " + a);
        }
        System.out.println("========================MAX-MIN===========================");
        System.out.println("Najmniejsza liczba z wylosowwanych to: " + min);
        System.out.println("Największa liczba z wylosowanych to: " + max);
    }


    public static void main(String[] args) {
        RandomNumbers suma = new RandomNumbers();
        suma.req();

    }
}


