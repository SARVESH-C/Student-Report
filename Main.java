import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name of Student : ");
        String name = sc.nextLine();

        System.out.println("Enter the Student's roll number : ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        Student s = new Student(name, rollNumber);

        int [] marks = new int[5];
        for(int i = 0;i<5; i++){
            System.out.println("Enter the marks : ");
            marks[i] = sc.nextInt();
        }
        s.setMarks(marks);
        s.totalMarks();
        s.calculatePercentage();
    }
}