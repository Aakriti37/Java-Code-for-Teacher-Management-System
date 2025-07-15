import java.util.*;

//Create a parent class Teacher.
class Teacher{
   //Declare Instance Variables
   private int TeacherId;
   private String TeacherName;
   private String Address;
   private String WorkingType;
   private String EmploymentStatus;
   private int WorkingHours;
   
   //Declare constructor with 5 parameters 
   public Teacher(int TeacherId, String TeacherName, String Address, String WorkingType, String EmploymentStatus){
       this.TeacherName = TeacherName;
       this.TeacherId = TeacherId;
       this.Address = Address;
       this.WorkingType = WorkingType;
       this.EmploymentStatus = EmploymentStatus;
   }
   
   //getter/accessor : convention
   //public return-type getXXX()
   //Accessor method are created for each attributes
   public int getTeacherid(){
       return this.TeacherId;
   }
   public String getTeachername(){
       return this.TeacherName;
   }
   public String getAddress(){
       return this.Address;
   }
   public String getWorkingtype(){
       return this.WorkingType;
   }
   public String getEmploymentstatus(){
       return this.EmploymentStatus;
   }
   public int getWorkinghours(){
       return this.WorkingHours;
   }
   
   //setter/mutator : convention
   //public void setXXX()
   //Setter method is created for WorkingHours
   public void setWorkinghours(int WorkingHours){
       this.WorkingHours = WorkingHours;
   }
   
   //Create Display method
   public void Display(){
     System.out.println("The ID of teacher is " +TeacherId+ "." );
     System.out.println("The name of teacher is " +TeacherName+ ".");
     System.out.println("The address of teacher is " +Address+ ".");
     System.out.println("The working type of teacher is " +WorkingType+ ".");
     System.out.println("The employment status of teacher is " +EmploymentStatus+ ".");
     
     //Condition for WorkingHours
     if(WorkingHours > 0){
         System.out.println("The weekly working hour of teacher is " +WorkingHours+ ".\n");
     }
     else{
         System.out.println("Working Hour is not assigned.\n");
     }
   }
}