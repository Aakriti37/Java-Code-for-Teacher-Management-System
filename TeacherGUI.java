import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.EmptyBorder;


//Create a class name TeacherGUI
public class TeacherGUI{
    private JFrame frame;
    private JPanel headerPanel, headerPanel1, headerPanel2, headerPanel3, framePanel, formPanel, formPanel1, formPanel2, formPanel3, panel1,panel2, panel3, panel4, buttonPanel;
    private JLabel headerLabel, headerLabel1, headerLabel2, headerLabel3, teacherID, teacherName, address, workingType, employmentStatus, workingHours, department, yearsofExperience, gradedScore, salary, specialization, academicQualification, performanceIndex;
    private JTextField idTextField, nameTextField, addressTextField, workingTypeTextField, employmentStatusTextField, workingHoursTextField, departmentTextField, experienceTextField, gradedScoreTextField, salaryTextField, specializationTextField, qualificationTextField, performanceIndexTextField;
    private JButton addLecturer, addTutor, gradeAssignment, setSalary, removeTutor, display, clear, pageChange;
    private ArrayList<Teacher> teacher;
    
    

    //Create a constructor of class TeacherGUI
    public TeacherGUI(){
        //Call a method name function()
        function();
    }
    
    //Create a method name function()
    private void function(){
        //Create a new JFrame having size 1200 width and 700 height with BorderLayout
        JFrame frame = new JFrame("Teacher Management System");
        frame.setSize(1200, 700);    
        frame.setLayout(new BorderLayout()); 
        
        
        //Create a new JPanel with BorderLayout
        JPanel MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout());   
        Color lightBlue = new Color(23, 76, 115);  //Create a color name lightblue with RGB values
        MainPanel.setBackground(lightBlue);        // Set the background color of JPanel to lightblue
        frame.add(MainPanel);                      //Add the JPanel to the frame
        
        
        //Create an ImageIcon name image and load the image name Image.jpeg from folder Image
        ImageIcon image = new ImageIcon("Image/Image.jpeg");
        //Create a JLabel name background with the above image icon with center alignment
        JLabel background = new JLabel("",image, JLabel.CENTER);            
        background.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));   //Set an EmptyBorder around the JLabel for spacing
        MainPanel.add(background, BorderLayout.CENTER);        //Add the JLabel to the JPanel with BorderLayout.CENTER alignment
        
        
        //JButton for first page with text 'Go to Next Page'
        JButton Button = new JButton("Go to Next Page");
        Button.setPreferredSize(new Dimension( Button.getPreferredSize().width, 50));
        Button.setBackground(lightBlue);
        Button.setForeground(Color.WHITE);
        Button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        frame.add(Button, BorderLayout.SOUTH);
        
        //Adding ActionListener to the Button
        Button.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               infoPage(evt);    //Call the method name infoPage with event 'evt' as a parameter
               frame.setVisible(false);   //When the second frame opened then it will make the previous frame invisible
           }
        });
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //It helps to close the application when the JFrame is closed
        frame.setVisible(true);    //It makes the frame visible
    }
    
    
    
    //Create a method name info page with ActionEvent evt as a parameter using private access modifier
    private void infoPage(ActionEvent evt){
        //Create a new JFrame
        frame = new JFrame("Teacher Management System");
        frame.setSize(1200, 700);
        frame.setLayout(new BorderLayout());
        //ArrayList of class Teacher with ArrayList name teacher 
        teacher = new ArrayList<>();
        
        
        //Creating a new Jpanel with BorderLayout and EmptyBorder around it for spacing and setting the background color to Black
        framePanel = new JPanel();
        framePanel.setLayout(new BorderLayout());
        framePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        framePanel.setBackground(Color.BLACK);
        frame.add(framePanel, BorderLayout.CENTER);    //Adding JPanel to the JFrame with BorderLayout.CENTER alignment
        
    
        //Creating a new JPanel name HeaderPanel with background color lightBlue and setting the layout of JPanel to FlowLayout
        headerPanel = new JPanel();
        Color lightBlue = new Color(23, 76, 115);
        headerPanel.setBackground(lightBlue);
        headerPanel.setLayout(new FlowLayout());
        
        
        //Creating a JLabel name HeaderLabel with text 'Information about a Teacher' having font color white
        headerLabel = new JLabel("Information about a Teacher");
        headerLabel.setForeground(Color.WHITE);
        
        //Set font style and font size for HeaderLabel and add the headerLabel to the headerPanel
        headerLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
        headerPanel.add(headerLabel);
        frame.add(headerPanel, BorderLayout.NORTH);   //Add the headerPanel to the frame with BorderLayout.NORTH alignment
        
        
        
        
        //Creating a new Jpanel for JLabel, JTextField and Jbutton with GridLayout having background color black
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 1, 10, 10));
        formPanel.setBackground(Color.BLACK);
        framePanel.add(formPanel, BorderLayout.CENTER);  // Adding formPanel to the framePanel with BorderLayout.CENTER alignment
        
        
        //Creating a new JPanel with BorderLayout and EmptyBorder for spacing
        panel1 = new JPanel();
        Color PastelCyan = new Color(199, 251, 255);   //Create a color name PastelCyan with RGB values
        panel1.setBackground(PastelCyan);              //Background color is set to PastelCyan
        panel1.setLayout(new BorderLayout());
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10));  //top, left, bottom, right
        formPanel.add(panel1);
        
        
        
        //JPanel for header inside panel1 with background color PastelCyan and FlowLayout
        headerPanel1 = new JPanel();
        headerPanel1.setBackground(PastelCyan);
        headerPanel1.setLayout(new FlowLayout());
        
        //JLabel for headerPanel1 with text 'Personal Information of a Teacher' and font color Black
        headerLabel1 = new JLabel("Personal Information of a Teacher");
        headerLabel1.setForeground(Color.BLACK);
        
        //Set the font style and font size for HeaderLabel
        headerLabel1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        headerPanel1.add(headerLabel1);      //Add headerLabel1 to headerPanel1
        panel1.add(headerPanel1, BorderLayout.NORTH);    //Add headerPanel1 to panel1 with BorderLayout.NORTH alignment
        
        
        
        //JPanel for  insJLabel and JTextField inside panel1 with background color PastelCyan 
        formPanel1 = new JPanel();
        formPanel1.setBackground(PastelCyan);
        formPanel1.setLayout(new GridLayout(6, 2, 5, 5));          //GridLayout is set for formPanel1
        formPanel1.setBorder(new EmptyBorder(10, 10, 10, 10));     //EmptyBorder is set for spacing 
        panel1.add(formPanel1, BorderLayout.CENTER);               //formPanel1 is added to panel1 with BorderLayout.CENTER alignment
        
        
        
    
        //JLabel and JTextField for formPanel1
        teacherID = new JLabel("Teacher ID");
        teacherID.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(teacherID);
        
        idTextField = new JTextField();
        formPanel1.add(idTextField);
        
        teacherName = new JLabel("Teacher Name");
        teacherName.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(teacherName);
        
        nameTextField = new JTextField();
        formPanel1.add(nameTextField);
        
        address = new JLabel("Address");
        address.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(address);
        
        addressTextField = new JTextField();
        formPanel1.add(addressTextField);
        
        
        workingType = new JLabel("Working Type");
        workingType.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(workingType);
        
        
        workingTypeTextField = new JTextField();
        formPanel1.add(workingTypeTextField);
       
       
       
        employmentStatus = new JLabel("Employment Status");
        employmentStatus.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(employmentStatus);
        
        
        employmentStatusTextField = new JTextField();
        formPanel1.add(employmentStatusTextField);
        
               
        workingHours = new JLabel("Working Hours");
        workingHours.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel1.add(workingHours);
        
        workingHoursTextField = new JTextField();
        formPanel1.add(workingHoursTextField);
        
        
        
       
        //panel2 for Lecturer and Tutor with new GridLayout and background color Black
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 2, 5, 5));
        panel2.setBackground(Color.BLACK);
        formPanel.add(panel2);        //panel2 is added to formPanel
        
        
        //panel3 for lecturer with new BorderLayout and background color PastelCyan
        panel3 = new JPanel();
        panel3.setBackground(PastelCyan);
        panel3.setLayout(new BorderLayout());
        panel3.setBorder(new EmptyBorder(10, 10, 10, 10));  //top, left, bottom, right
        panel2.add(panel3);      //panel3 is added to panel2
        
        
        
        //JPanel for header inside panel3
        headerPanel2 = new JPanel();
        headerPanel2.setBackground(PastelCyan);
        headerPanel2.setBorder(new EmptyBorder(20, 10, 20, 10));   //top, left, bottom, right
        headerPanel2.setLayout(new FlowLayout());
        
        //JLabel for text inside headerPanel2
        headerLabel2 = new JLabel("Information of a Lecturer with personal details");
        headerLabel2.setForeground(Color.BLACK);
        headerLabel2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        headerPanel2.add(headerLabel2);
        panel3.add(headerPanel2, BorderLayout.NORTH);
        
        
        
        //JPanel for JLabel and JTextField inside panel3
        formPanel2 = new JPanel();
        formPanel2.setBackground(PastelCyan);
        formPanel2.setLayout(new GridLayout(3, 2, 5, 20));
        formPanel2.setBorder(new EmptyBorder(30, 10, 30, 10)); 
        panel3.add(formPanel2, BorderLayout.CENTER);
        
        
        
        
        
        
        //JLabel and JTextField for formPanel2
        department = new JLabel("Department");
        department.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel2.add(department);
        
        departmentTextField = new JTextField();
        formPanel2.add(departmentTextField);
        
        yearsofExperience = new JLabel("Years of Experience");
        yearsofExperience.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel2.add(yearsofExperience);
        
        experienceTextField = new JTextField();
        formPanel2.add(experienceTextField);
        
        gradedScore = new JLabel("Graded Score");
        gradedScore.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel2.add(gradedScore);
        
        gradedScoreTextField = new JTextField();
        formPanel2.add(gradedScoreTextField);
        
        
        
        
        
        
        //panel4 for Tutor with new BorderLayout and Background color PastelCyan
        panel4 = new JPanel();
        panel4.setBackground(PastelCyan);
        panel4.setLayout(new BorderLayout());
        panel4.setBorder(new EmptyBorder(10, 10, 10, 10));  //top, left, bottom, right
        panel2.add(panel4);
        
        
        //JPanel for header inside panel4
        headerPanel3 = new JPanel();
        headerPanel3.setBackground(PastelCyan);
        headerPanel3.setBorder(new EmptyBorder(20, 10, 20, 10));   //top, left, bottom, right
        headerPanel3.setLayout(new FlowLayout());
        
        //JLabel for text inside headerLabel3
        headerLabel3 = new JLabel("Information of a Tutor with personal details");
        headerLabel3.setForeground(Color.BLACK);
        headerLabel3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        headerPanel3.add(headerLabel3);
        panel4.add(headerPanel3, BorderLayout.NORTH);
        
        
        
        //JPanel for JLabel and JTextField inside panel4
        formPanel3 = new JPanel();
        formPanel3.setBackground(PastelCyan);
        formPanel3.setLayout(new GridLayout(4, 2, 5, 10));
        formPanel3.setBorder(new EmptyBorder(20, 10, 20, 10)); 
        panel4.add(formPanel3, BorderLayout.CENTER);
        
        
        
        
        //JLabel and JTextField for formPanel3
        salary = new JLabel("Salary");
        salary.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel3.add(salary);
        
        salaryTextField = new JTextField();
        formPanel3.add(salaryTextField);
        
        specialization = new JLabel("Specialization");
        specialization.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel3.add(specialization);
        
        specializationTextField = new JTextField();
        formPanel3.add(specializationTextField);
        
        academicQualification = new JLabel("Academic Qualification");
        academicQualification.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel3.add(academicQualification);
        
        qualificationTextField = new JTextField();
        formPanel3.add(qualificationTextField);
        
        performanceIndex = new JLabel("Performance Index");
        performanceIndex.setFont(new Font("Arial", Font.BOLD, 15));
        formPanel3.add(performanceIndex);
        
        performanceIndexTextField = new JTextField();
        formPanel3.add(performanceIndexTextField);
        
        
        
        
        
        //Panel for all the buttons with new GridLayout and EmptyBorder for spacing
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(8, 1, 5, 10));
        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));  //top, left, bottom, right
        Color myColor = new Color(255, 255, 255);
        buttonPanel.setBackground(myColor);
        framePanel.add(buttonPanel, BorderLayout.EAST);     //buttonPanel is added to the framePanel with BorderLayout.EAST alignment//
        
        
        
        
        //Creating button for adding Lecturer to the ArrayList
        
        addLecturer = new JButton("Add Lecturer");
        addLecturer.setPreferredSize(new Dimension(150, addLecturer.getPreferredSize().height));
        addLecturer.setBackground(lightBlue);
        addLecturer.setForeground(Color.WHITE);
        buttonPanel.add(addLecturer, BorderLayout.EAST);
        
        
        //Adding ActionListener to the button addLecturer
        addLecturer.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling AddLecturer method
               AddLecturer();
           }
        });
        
        
        //Creating button for adding Tutor to the ArrayList
        addTutor = new JButton("Add Tutor");
        addTutor.setPreferredSize(new Dimension(150, addTutor.getPreferredSize().height));
        addTutor.setBackground(lightBlue);
        addTutor.setForeground(Color.WHITE);
        buttonPanel.add(addTutor, BorderLayout.EAST);
        
        
        //Adding ActionListener to the button addTutor
        addTutor.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling AddTutor method
               AddTutor(); 
           }
        });
        
        
        
        //Creating button for grading assignment
        gradeAssignment = new JButton("Grade Assignment");
        gradeAssignment.setPreferredSize(new Dimension(150, gradeAssignment.getPreferredSize().height));
        gradeAssignment.setBackground(lightBlue);
        gradeAssignment.setForeground(Color.WHITE);
        buttonPanel.add(gradeAssignment, BorderLayout.EAST);
        
        //Adding ActionListener to the button gradeAssignment
        gradeAssignment.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling GradeAssignment method
               GradeAssignment();  
           }
        });
        
        
        //Creating button for assigning new salary
        setSalary = new JButton("Set Salary");
        setSalary.setPreferredSize(new Dimension(150, setSalary.getPreferredSize().height));
        setSalary.setBackground(lightBlue);
        setSalary.setForeground(Color.WHITE);
        buttonPanel.add(setSalary, BorderLayout.EAST);
        
        //Adding ActionListener to the button setSalary
        setSalary.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling SetSalary method
               SetSalary(); 
           }
        });
        
        
        //Creating a button for removing tutor from ArrayList
        removeTutor = new JButton("Remove Tutor");
        removeTutor.setPreferredSize(new Dimension(150, removeTutor.getPreferredSize().height));
        removeTutor.setBackground(lightBlue);
        removeTutor.setForeground(Color.WHITE);
        buttonPanel.add(removeTutor, BorderLayout.EAST);
        
        //Assing ActionListener to the button removeTutor
        removeTutor.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling RemoveTutor method
               RemoveTutor();
           }
        });
        
        
        //Creating button for displaying all the information
        display = new JButton("Display");
        display.setPreferredSize(new Dimension(150, display.getPreferredSize().height));
        display.setBackground(lightBlue);
        display.setForeground(Color.WHITE);
        buttonPanel.add(display, BorderLayout.EAST);
        
        //Adding ActionListener to the button display
        display.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling Display method
               Display();  
           }
        });
        
        
        //Creating button for clearing all the information from the JTextField
        clear = new JButton("Clear the TextField");
        clear.setPreferredSize(new Dimension(150, clear.getPreferredSize().height));
        clear.setBackground(lightBlue);
        clear.setForeground(Color.WHITE);
        buttonPanel.add(clear, BorderLayout.EAST);
        
        //Adding ActionListener to the button clear
        clear.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               //Calling Clear method
               Clear();
           }
        });
        
        
        //Creating a button for changing page
        pageChange = new JButton("Go to Previous Page");
        pageChange.setPreferredSize(new Dimension(150, pageChange.getPreferredSize().height));
        pageChange.setBackground(lightBlue);
        pageChange.setForeground(Color.WHITE);
        buttonPanel.add(pageChange, BorderLayout.EAST);
        
        //Adding ActionListener to the button pageChange
        pageChange.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
              //Calling function method
              function();
              frame.setVisible(false);
           }
        });
        
        
     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //It helps to close the application when the JFrame is closed
        frame.setVisible(true);        //It makes the frame visible
    }
    
    
    
    //method for checking empty fields and exception handling of addLecturer button
    private void AddLecturer(){
        //Checking if there is empty field or not
        if(idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || addressTextField.getText().isEmpty() || workingTypeTextField.getText().isEmpty() || employmentStatusTextField.getText().isEmpty() || workingHoursTextField.getText().isEmpty() ||departmentTextField.getText().isEmpty() || experienceTextField.getText().isEmpty() || gradedScoreTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Empty field is detected! Please input necessary details.", "Alert", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
               
        
        try{
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String workingType = workingTypeTextField.getText();
            String employmentStatus = employmentStatusTextField.getText();
            int workingHours = Integer.parseInt(workingHoursTextField.getText());
            String department = departmentTextField.getText();
            int yearsofExperience = Integer.parseInt(experienceTextField.getText());
            int gradedScore = Integer.parseInt(gradedScoreTextField.getText());
            double salary = Double.parseDouble(salaryTextField.getText());
            int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            
            
            
            if(id <= 0 || workingHours < 0 || yearsofExperience < 0 || gradedScore < 0 || salary < 0 || performanceIndex < 0){
                JOptionPane.showMessageDialog(frame, "Uh-oh!!! Invalid input. Please check the text field.", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            
               
            
            //Checking for duplicate ids'
            //for (Teacher reference variable : ArrayList name)
            for(Teacher teachers : teacher){
                /*if(reference variable.getTeacherid() (getter method of Teacher) == teacherID.getText() 
                * && reference variable is instance of Lecturer)
                */
                
                if(teachers instanceof Lecturer && teachers.getTeacherid() == id){
                    JOptionPane.showMessageDialog(frame, "The ID you have entered already exist. Please enter unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;   // Method is closed if any of the field is empty
                    
                }
            }
            
            
            //Creating object of Lecturer
            Lecturer lecturer = new Lecturer(id, name, address, workingType, employmentStatus, workingHours, department, yearsofExperience);
            //Gradedscore is set for the lecturer
            lecturer.setGradedScore(gradedScore);  
            //Lecturer object is added to the ArrayList
            teacher.add(lecturer);
            
            //It will generate the message in the dialog box when the lecturer is added to the ArrayList
            JOptionPane.showMessageDialog(frame, "Lecturer is successfully added to the ArrayList :).", "Information", JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        //When other values are entered in the JTextField except for numeric values then catch block will execute
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid details.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //method for checking empty fields and exception handling of addTutor button
    private void AddTutor(){
        //Checking for empty fields
        if(idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || addressTextField.getText().isEmpty() || workingTypeTextField.getText().isEmpty() || employmentStatusTextField.getText().isEmpty() || experienceTextField.getText().isEmpty() || salaryTextField.getText().isEmpty() || specializationTextField.getText().isEmpty() || qualificationTextField.getText().isEmpty() || performanceIndexTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Empty Field is detected! Please input necessary details.", "Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Exception handling
        try{
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String workingType = workingTypeTextField.getText();
            String employmentStatus = employmentStatusTextField.getText();
            int workingHours = Integer.parseInt(workingHoursTextField.getText());
            double salary = Double.parseDouble(salaryTextField.getText());
            String specialization = specializationTextField.getText();
            String qualification = qualificationTextField.getText();
            int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            int yearsofExperience = Integer.parseInt(experienceTextField.getText());
            int gradedScore = Integer.parseInt(gradedScoreTextField.getText());
        
            
            
            if(id <= 0 || workingHours < 0 || yearsofExperience < 0 || gradedScore < 0 || salary < 0 || performanceIndex < 0){
                JOptionPane.showMessageDialog(frame, "Uh-oh!!! Invalid input. Please check the text field.", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            
            
            
            for(Teacher teachers: teacher){
                if(teachers instanceof Tutor && teachers.getTeacherid() == id){
                    JOptionPane.showMessageDialog(frame, "The ID you have entered already exist! Please enter unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            
            Tutor tutor = new Tutor(id, name, address, workingType, employmentStatus, workingHours, salary, specialization, qualification, performanceIndex);
            teacher.add(tutor);
            
            JOptionPane.showMessageDialog(frame, "Tutor is successfully added to the ArrayList :).", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter valid details.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //method for checking empty fields and exception handling of gradeAssignment button
    private void GradeAssignment(){
         //checking for empty fields
        if(idTextField.getText().isEmpty() || gradedScoreTextField.getText().isEmpty() || departmentTextField.getText().isEmpty() || experienceTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame,"Empty field is detected! Please input necessary details.","Alert",JOptionPane.WARNING_MESSAGE);
            return; //exit method if any field is empty
        }
        
        //Exception handling
        try{
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String workingType = workingTypeTextField.getText();
            String employmentStatus = employmentStatusTextField.getText();
            int workingHours = Integer.parseInt(workingHoursTextField.getText());
            String department = departmentTextField.getText();
            int yearsofExperience = Integer.parseInt(experienceTextField.getText());
            int gradedScore = Integer.parseInt(gradedScoreTextField.getText());
            double salary = Double.parseDouble(salaryTextField.getText());
            int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            boolean lectureravailable = false;
               
            
            if(id <= 0 || workingHours < 0 || yearsofExperience < 0 || gradedScore < 0 || salary < 0 || performanceIndex < 0){
                JOptionPane.showMessageDialog(frame, "Uh-oh!!! Invalid input. Please check the text field.", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            
            
            for(Teacher teachers : teacher){
                
                if(teachers instanceof Lecturer && teachers.getTeacherid() == id ){
                
                    lectureravailable = true;
                    Lecturer lecturer = (Lecturer)teachers;
                    lecturer.gradeAssignment(gradedScore,department,yearsofExperience);
                       
                    //Displaying the score graded by lecturer in a dialog box
                    JOptionPane.showMessageDialog(frame, "Assignment is graded successfully by Lecturer :) " + "\nTeacher ID: " + idTextField.getText() + "\nDepartment: " + departmentTextField.getText() + "\nYears of experience: " + experienceTextField.getText() + " years \nGraded Score: " + lecturer.getGradedScore(), "Grade Assignment",JOptionPane.INFORMATION_MESSAGE);
                   
                       
                }
            }
               
            if(!lectureravailable){
                JOptionPane.showMessageDialog(frame,"Lecturer with ID: " + id + " not found" ,"Error",JOptionPane.ERROR_MESSAGE);
            } 
            
        }
           
        catch(NumberFormatException e){
           
            JOptionPane.showMessageDialog(frame,"Invalid input! Please enter valid details. ","ERROR",JOptionPane.ERROR_MESSAGE);
        
        }
    }
    
    
    //method for checking empty fields and exception handling of setSalary button
    private void SetSalary(){
        //check for empty fields
        if(idTextField.getText().isEmpty() || salaryTextField.getText().isEmpty() || performanceIndexTextField.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(frame,"Empty field is detected! Please input necessary details.","Alert",JOptionPane.WARNING_MESSAGE);
            return; //exit method if any field is empty
        
        }
         
        //Exception handling
        try{
            
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String workingType = workingTypeTextField.getText();
            String employmentStatus = employmentStatusTextField.getText();
            int workingHours = Integer.parseInt(workingHoursTextField.getText());
            double salary = Double.parseDouble(salaryTextField.getText());
            String specialization = specializationTextField.getText();
            String qualification = qualificationTextField.getText();
            int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            int yearsofExperience = Integer.parseInt(experienceTextField.getText());
            int gradedScore = Integer.parseInt(gradedScoreTextField.getText());
            boolean tutoravailable = false;
            
            
            
            if(id <= 0 || workingHours < 0 || yearsofExperience < 0 || gradedScore < 0 || salary < 0 || performanceIndex < 0){
                JOptionPane.showMessageDialog(frame, "Uh-oh!!! Invalid input. Please check the text field.", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            
            
            for(Teacher teachers : teacher){
                //Checking for duplicate ids'                
                if(teachers instanceof Tutor && id == Integer.parseInt(idTextField.getText())){
                    Tutor tutor = (Tutor)teachers;
                    String newsalary = JOptionPane.showInputDialog(frame,"Enter new salary for tutor: ","Input",JOptionPane.PLAIN_MESSAGE);
                    String newperformanceIndex = JOptionPane.showInputDialog(frame,"Enter new performance index for tutor: ","Input",JOptionPane.PLAIN_MESSAGE);
                    double Newsalary = Double.parseDouble(newsalary);
                    int Newperformanceindex = Integer.parseInt(newperformanceIndex);
                    tutor.setSalary(Newsalary,Newperformanceindex);
                    tutoravailable = true;
                       
                    
                    JOptionPane.showMessageDialog(frame, "Salary is successfully updated :) " + "\nTeacher ID: " + idTextField.getText() + "\nNew Salary: Rs. " + Newsalary + " per month \nNew Performance Index: " + Newperformanceindex, "Set salary",JOptionPane.INFORMATION_MESSAGE);
                       
                }
            }
               
            if(!tutoravailable){
               
                JOptionPane.showMessageDialog(frame,"Tutor with ID " + id + " is not available." ,"Error",JOptionPane.ERROR_MESSAGE);
            
            }
            
        }
           
        catch(NumberFormatException e){
           
            JOptionPane.showMessageDialog(frame,"Invalid input! Please enter valid details. ","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    //method for checking empty fields and exception handling of removeTutor button
    private void RemoveTutor(){
         //check for empty fields
        if(idTextField.getText().isEmpty() || salaryTextField.getText().isEmpty() || specializationTextField.getText().isEmpty() || performanceIndexTextField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(frame,"Empty field is detected! Please input necessary details.","Alert",JOptionPane.WARNING_MESSAGE);
            return; //exit method if any field is empty
        
        }
        
        //Exception handling
        try{
            
            int id = Integer.parseInt(idTextField.getText());
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String workingType = workingTypeTextField.getText();
            String employmentStatus = employmentStatusTextField.getText();
            int workingHours = Integer.parseInt(workingHoursTextField.getText());
            double salary = Double.parseDouble(salaryTextField.getText());
            String specialization = specializationTextField.getText();
            String qualification = qualificationTextField.getText();
            int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            int yearsofExperience = Integer.parseInt(experienceTextField.getText());
            int gradedScore = Integer.parseInt(gradedScoreTextField.getText());
            boolean tutoravailable = false;
            
            if(id <= 0 || workingHours < 0 || yearsofExperience < 0 || gradedScore < 0 || salary < 0 || performanceIndex < 0){
                JOptionPane.showMessageDialog(frame, "Uh-oh!!! Invalid input. Please check the text field.", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
                                         
            for(Teacher teachers : teacher){
                //Checking for duplicate ids'
                if(teachers instanceof Tutor && id == Integer.parseInt(idTextField.getText())){
                    Tutor tutor = (Tutor)teachers;
                    //if tutor is available then it will be removed from the ArrayList
                    
                    if(tutor.getisCertified()){
                        JOptionPane.showMessageDialog(frame, "The tutor is certified so, he/she cannot be removed.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;                    
                    }
                    else{ 
                        tutor.RemoveTutor();
                        teacher.remove(teachers);
                        tutoravailable = true;   
                        JOptionPane.showMessageDialog(frame,"Tutor with ID " + id + " is removed successfully." ,"Information",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }    
            }
               
            if(!tutoravailable){
            
                JOptionPane.showMessageDialog(frame,"Tutor with ID " + id + " is not available." ,"Error",JOptionPane.ERROR_MESSAGE);
            
            }          
        }
           
        catch(NumberFormatException e){
           
            JOptionPane.showMessageDialog(frame,"Invalid input! Please enter valid details. ","Alert",JOptionPane.WARNING_MESSAGE);
        
        }
    }
    
    
    //method for displaying all information in a JTextArea 
    private void Display(){
        if(idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || addressTextField.getText().isEmpty() || workingTypeTextField.getText().isEmpty() || employmentStatusTextField.getText().isEmpty() || workingHoursTextField.getText().isEmpty() ||departmentTextField.getText().isEmpty() || experienceTextField.getText().isEmpty() || gradedScoreTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Empty field is detected! Please input necessary details.", "Alert", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        //Creating a StringBuilder name displayInfo
        StringBuilder displayInfo = new StringBuilder();
        for(Teacher teachers : teacher){
            displayInfo.append("Teacher ID: ").append(teachers.getTeacherid()).append("\n");
            displayInfo.append("Teacher Name: ").append(teachers.getTeachername()).append("\n");
            displayInfo.append("Address: ").append(teachers.getAddress()).append("\n");
            displayInfo.append("Working Type:").append(teachers.getWorkingtype()).append("\n");
            displayInfo.append("Employment Status: ").append(teachers.getEmploymentstatus()).append("\n");
            displayInfo.append("Working Hours: ").append(teachers.getWorkinghours()).append(" hours/week \n");
            teachers.Display();
            
            /*If teachers is instance of Lecturer then displaying all the information of the Lecturer with personal details
             * otherwise displaying all the information of Tutor along with personal details
             */
            if(teachers instanceof Lecturer){
                Lecturer lecturer = (Lecturer) teachers;  //Teaacher class is downcast to Lecturer class
                
                displayInfo.append("Department: ").append(lecturer.getDepartment()).append("\n");
                displayInfo.append("Years of Experience: ").append(lecturer.getYearsOfExperience()).append(" years \n");
                displayInfo.append("Graded Score: ").append(lecturer.getGradedScore()).append("\n");
                ((Lecturer) teachers).Display();
                
            }
            
            else if(teachers instanceof Tutor){
                Tutor tutor = (Tutor) teachers;
                
                displayInfo.append("Salary: Rs. ").append(tutor.getSalary()).append(" per month\n");
                displayInfo.append("Specialization: ").append(tutor.getSpecialization()).append("\n");
                displayInfo.append("Academic Qualifications: ").append(tutor.getAcademicQualifications()).append("\n");
                ((Tutor) teachers).Display();
                
            }
            
            displayInfo.append("\n");
            
        }
        
        //Creating JTextArea for displaying all the information
        JTextArea displayArea = new JTextArea(displayInfo.toString());
        //Creating JScrollPane to add scroll functionality to JTextArea
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        framePanel.add(scrollPane, BorderLayout.CENTER);
        
        JOptionPane.showMessageDialog(frame, scrollPane, "Teacher Information", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    
    //Method for clearing all the JTextField
    private void Clear(){
        
        idTextField.setText("");
        nameTextField.setText("");
        addressTextField.setText("");
        workingTypeTextField.setText("");
        employmentStatusTextField.setText("");
        workingHoursTextField.setText("");
        departmentTextField.setText("");
        experienceTextField.setText("");
        gradedScoreTextField.setText("");
        salaryTextField.setText("");
        specializationTextField.setText("");
        qualificationTextField.setText("");
        performanceIndexTextField.setText("");
        
    }
    
    
    
    //Method for the execution of the program
    public static void main(String[] args){
        new TeacherGUI();
    }
}