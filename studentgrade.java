import java.util.Scanner;

public class studentgrade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS:: ");
        int subject=sc.nextInt();
        int total_marks=0;
        for(int i=1;i<=subject;i++){
            System.out.println("Marks In Subject:: " + i + " :: ");
            int Marks = sc.nextInt();
            total_marks += Marks;
        }
        float avgerage_percent=(total_marks/subject);
        char grade;
        if(avgerage_percent>=90)
        {
            grade = 'A';    
        }
        else if(avgerage_percent>=75)
        {
            grade = 'B';
        }
        else if(avgerage_percent>=50)
        {
            grade = 'C';
        }
        else if(avgerage_percent>=33)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F'; 
        }
        System.out.println("TOTAL MARKS:; "+total_marks);
        System.out.println("AVERAGE PERCENT:: "+ avgerage_percent +"%");
        System.out.println("GRADE:: "+grade);
        
    }
}