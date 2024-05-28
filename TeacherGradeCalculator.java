import java.util.Scanner;

public class TeacherGradeCalculator{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.print("Enter the number of Students in the class : ");
        int n = s.nextInt();
        float sum=0;
        float marks[] = new float[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter marks of  Student " + (i+1) +" : ");
            marks[i] = s.nextFloat();
            sum+=marks[i];
        }
        float min = marks[0];
        float max = marks[0];
        for (int i = 0; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        float avg = (sum/n);
        System.out.println("The sum of marks of all the Students : " + sum);
        System.out.println("The Average of marks of all the Students : " +avg);
        System.out.println("Highest Marks of all the Students : " +max);
        System.out.println("Least Marks of all the Students : " +min);



        s.close();
    }
}