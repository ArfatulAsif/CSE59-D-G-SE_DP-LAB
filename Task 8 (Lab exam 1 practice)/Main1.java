import java.util.Scanner;

class course{
    String highest="";
    double highestMarks =-1;
    int topCount =0;

    void addStudent(String name,double marks){
        if(marks > highestMarks){
            highestMarks = marks;
            highest = name;

        }
    }
    String getHighestScorer() {
        return highest;
    }
    int countTopGrades(double[] marks, double threshold, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (marks[i] >= threshold) {
                count++;
            }
        }
        return count;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        course c = new course();

        int n = sc.nextInt();
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            marks[i] = sc.nextDouble();
            c.addStudent(name, marks[i]);
        }

        double threshold = sc.nextDouble();

        System.out.println(c.getHighestScorer());
        System.out.println(c.countTopGrades(marks, threshold, n));
    }
}


