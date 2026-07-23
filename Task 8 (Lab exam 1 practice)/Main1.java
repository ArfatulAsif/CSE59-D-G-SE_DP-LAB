
import java.util.Scanner;

class Course {

    String[] names = new String[100];
    double[] marks = new double[100];
    int i = 0;

    public void addStudent(String name, double marks) {
        names[i] = name;
        this.marks[i] = marks;
        i++;
    }

    public void getHighestScorer() {
        double hmark=marks[0];
        String topper=names[0];
        
        for(int k=0;k<i;k++){
            if(marks[k]>hmark){
                hmark=marks[k];
                topper=names[k];
            }
        }

        System.out.print("Highest Scorer: " + topper + " (" + (int) hmark + ")");
    }

    public int countTopGrades(double threshold) {
        int total = 0;

        for (int k = 0; k < i; k++) {
            if (marks[k] >= threshold) {
                total++;
            }
        }

        return total;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course c = new Course();

        sc.next();
       
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            double marks = sc.nextDouble();
            c.addStudent(name, marks);
        }

        double threshold = sc.nextDouble();

        c.getHighestScorer();
        System.out.print(", Number of A+ (" + (int) threshold + "+): ");
        System.out.println(c.countTopGrades(threshold));

        sc.close();
    }
}
