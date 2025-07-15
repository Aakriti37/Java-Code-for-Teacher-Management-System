import java.util.*;

//Create a class Lecturer which is subclass of Teacher
public class Lecturer extends Teacher{
    //Declare Instance Variables
    private String Department;
    private int YearsOfExperience;
    private int GradedScore;
    private boolean HasGraded;
    
    //Declare constructor for Lecturer which accepts 8 parameter 
    public Lecturer(int TeacherId, String TeacherName, String Address, String WorkingType, String EmploymentStatus, int WorkingHours, String Department, int YearsOfExperience){
        //Call superclass constructor with 5 parameter
        super(TeacherId, TeacherName, Address, WorkingType, EmploymentStatus);
        //Calling setter method
        super.setWorkinghours(WorkingHours);
        
        this.Department = Department;
        
        //Assigning value 0(zero) to GradedScore
        this.GradedScore = 0;
        
        //Assigning YearOfExperience with the corresponding parameter values
        this.YearsOfExperience = YearsOfExperience;
        
        //Assigning false to HasGraded
        this.HasGraded = false;
    }
    
    
    //Accessor method are created for each attribute of class Lecturer
    public String getDepartment(){
        return this.Department;
    }
    public int getYearsOfExperience(){
        return this.YearsOfExperience;
    }
    public int getGradedScore(){
        return this.GradedScore;
    }
    public boolean getHasGraded(){
        return this.HasGraded;
    }
    
    
    //Setter/Mutator method is created for GradedScore
    public void setGradedScore(int GradedScore){
        this.GradedScore = GradedScore;
    }
    
    //Creating a method gradeAssignment which accepts 3 parameter GradedScore, Department and YearsOfExperience.
    public void gradeAssignment(int GradedScore, String Department, int YearsOfExperience){
        //Using nested if statement
        if(YearsOfExperience >= 5 && this.Department.equals(Department)){
            /*this.Department represents instance variable
             * equals(Department) represents the variable inside the method gradeAssignment
             */
            if(GradedScore >= 70){
                System.out.println("Graded score is 'A'.\n");
            }
            else if(GradedScore >= 60){
                System.out.println("Graded score is 'B'.\n");
            }
            else if(GradedScore >= 50){
                System.out.println("Graded Score is 'C'.\n");
            }
            else if(GradedScore >= 40){
                System.out.println("Graded score is 'D'.\n");
            }
            else{
                System.out.println("Graded score is 'E'.\n");
            }
            
            //Setting the attribute HasGraded to True
            HasGraded = true;
        }
        else{
            System.out.println("Assignment of student is not graded yet.\n");
        }
    }
    
    /*
     * Creating Display method for Lecturer class which has same signature as
     * the Display method in Teacher class.
     */
    public void Display(){
        //Calling Display method of Teacher class
        super.Display();
        
        //Display Department, YearsOfExperiemce and GradedScore.
        System.out.println("The teacher is from " +Department+ " Department.");
        System.out.println("The year of experience of a teacher is " +YearsOfExperience+ " years.");
        if(HasGraded){
            System.out.println("The score graded by a teacher to a student is " +GradedScore+ ".\n");
        }
        else{
            System.out.println("The teacher has not graded the score yet.\n");
        }
    }
}
   