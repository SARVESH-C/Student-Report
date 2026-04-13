// import java.util.ArrayList;
public class Student {
    String name ;
    int rollNumber;
    int[] marks;
    
    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[5];
    
    } 

    public void setMarks(int[] marks){
        this.marks = marks;
    }

    public void totalMarks(){
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total += marks[i];
        }
        System.out.println("Total marks of " + name + " is " + total);
    }
    public void calculatePercentage(){
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total += marks[i];
        }
        double percentage = total/500.0*100;
        System.out.println("Percentage of " + name + " is " + percentage);
        
        if(percentage >= 90){
            System.out.println("Grade of " + name + " is A");
        } else if(percentage >= 80){
            System.out.println("Grade of " + name + " is B");
        } else if(percentage >= 70){
            System.out.println("Grade of " + name + " is C");
        } else if(percentage >= 60){
            System.out.println("Grade of " + name + " is D");
        } else {
            System.out.println("Grade of " + name + " is F");
        }
    }

    
    
}

