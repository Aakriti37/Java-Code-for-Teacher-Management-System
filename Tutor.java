import java.util.*;

//Create a class Tutor which is subclass of Teacher
public class Tutor extends Teacher{
    //Declare Instance Variables
    private double Salary;
    private String Specialization;
    private String AcademicQualifications;
    private int PerformanceIndex;
    private boolean isCertified;
    
    //Declare constructor for Tutor which accepts 10 parameters
    public Tutor(int TeacherId, String TeacherName, String Address, String WorkingType, String EmploymentStatus, int WorkingHours, 
    double Salary, String Specialization, String AcademicQualifications, int PerformanceIndex){
        
        //Call superclass constructor with 5 parameter
        super(TeacherId, TeacherName, Address, WorkingType, EmploymentStatus);
        //Calling setter method
        super.setWorkinghours(WorkingHours);
        
        /*
         * Assigning Salary, Specialization, AcademicQualifications and PerformanceIndex
         * the corresponding parameter value.
         */
        this.Salary = Salary;
        this.Specialization = Specialization;
        this.AcademicQualifications = AcademicQualifications;
        this.PerformanceIndex = PerformanceIndex;
        
        //Assigning false value to isCertified 
        this.isCertified = false;
    }
    
    //Accessor method are created for each attributes of class Tutor
    public double getSalary(){
        return this.Salary;
    }
    public String getSpecialization(){
        return this.Specialization;
    }
    public String getAcademicQualifications(){
        return this.AcademicQualifications;
    }
    public int getPerformanceIndex(){
        return this.PerformanceIndex;
    }
    public boolean getisCertified(){
        return this.isCertified;
    }
    
    //Setter method is created for Salary which accepts two parameter newSalary and new PerformanceIndex.
    public void setSalary(double Salary, int PerformanceIndex){
        this.Salary = Salary;
        this.PerformanceIndex = PerformanceIndex;
        
        //Using nested if statement
        if(PerformanceIndex > 5 && getWorkinghours() > 20){
            double AppraisalPercentage;
            
            if(PerformanceIndex >= 5 && PerformanceIndex <= 7){
                AppraisalPercentage = 5;
            }
            else if(PerformanceIndex >= 8 && PerformanceIndex <= 9){
                AppraisalPercentage = 10;
            }
            else{
                AppraisalPercentage = 20;
            }
            
            //Calculating newSalary
            Salary = Salary + (AppraisalPercentage / 100) * Salary;
            
            //Assigning true value to isCertified
            this.isCertified = true;
        }
        else{
            System.out.println("Tutor has not been certified yet hence, salary cannot be approved.");
        }
    }
    
    //Creating a method RemoveTutor
    public void RemoveTutor(){
        if(!isCertified){
            /*
             * The attributes Salary, Specializaton, AcademicQualification, PerformanceIndex
             * is set to zero and isCertified is set to false.
             */
            this.Salary = 0;
            this.Specialization = "";
            this.AcademicQualifications = "";
            this.PerformanceIndex = 0;
            this.isCertified = false;
        }
        else{
            System.out.println("The tutor is certified so, he/she can not be removed.\n");
        }
    }
    
    /*
     * Creating Display method for Tutor class which has same signature as
     * the Display method in Teacher class.
     */
    public void Display(){
        if(!isCertified){
            /*
             * If isCertified is set to false, it will call method in the 
             * Teacher class to Display the details.
             */
            super.Display();
        }
        else{
            /*
            * If isCertified is set to true, it will display Salary, Specialization,
            * AcademicQualifications and PerformanceIndex along with the details of the parent class.
            */
            System.out.println("The monthly salary of a teacher is Rs." +Salary+ ".");
            System.out.println("The teacher is specialized in " +Specialization+ ".");
            System.out.println("The academic qualification of a teacher is " +AcademicQualifications+ ".");
            System.out.println("The performance index of a teacher is " +PerformanceIndex+ ".\n");
            //Call display method of parent class using super keyword
            super.Display();
        }
    }
}
