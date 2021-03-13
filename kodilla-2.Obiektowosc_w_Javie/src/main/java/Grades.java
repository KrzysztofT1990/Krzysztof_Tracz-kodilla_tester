import java.util.Random;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        int checkLastGrade = (this.grades[this.size - 1]);
        return checkLastGrade;
    }

    public double average() {
        double score = 0.00;
        for (int i = 0; i <= this.size; i++) {
            score = this.grades[i] + score;
        }
        score = score / this.size;
        score = Math.round(score * 100) / 100.0d;
        return score;
    }

    public void addGrades() {
        Random los = new Random();
        for (int i = 0; i <= (los.nextInt(10) + 1); i++) {
            this.add(los.nextInt(6) + 1);
            System.out.print(this.grades[i] + ", ");
        }
    }

    public static void main(String[] args) {

        Grades notes = new Grades();
        System.out.println("======Add_New_Grades======");
        notes.addGrades();
        System.out.println("Check your grades");
        System.out.println("Ilość ocen w dzienniku to:" + notes.size);
        System.out.println("========Last_Grade========");
        System.out.println(notes.lastGrade());
        System.out.println("==========Average=========");
        System.out.println(notes.average());
    }
}
