package SoftwarEngAssignment1P2.softwareengA1P2;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import SoftwarEngAssignment1P2.softwareengA1P2.Module;
import SoftwarEngAssignment1P2.softwareengA1P2.Student;


public class Test {
    
    public Test(String string, ArrayList<Module> computerscienceandITModules, Date startDate, Date endDate) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String [ ] args)
{
    //creating students 
      Date date = new Date();
      Student sean = new Student("sean", 25, dob, 14419748 );
      Student niall = new Student("niall", 21, dob, 14468877);
      Student sara = new Student("sara", 23, dob, 14387654);
      Student ciaran = new Student("ciaran", 20, dob, 14419746);
	  Student kate = new Student("kate", 24, dob, 14734264);
      Date startDate = new Date(2017,9,5,0,0,0);
      Date endDate = new Date(201,6,14,0,0,0);
   //adding students to software engineering
      ArrayList<Student>softwareengStudents = new ArrayList<Student>();
      softwareengStudents.add(sean);
      softwareengStudents.add(sara);
      softwareengStudents.add(niall);
      softwareengStudents.add(ciaran);
	  
      //adding students to artificial intelligence
      ArrayList<Student> artificialIntelligenceStudents = new ArrayList<Student>();
      artificialIntelligenceStudents.add(sara);
      artificialIntelligenceStudents.add(niall);
      artificialIntelligenceStudents.add(kate);
      artificialIntelligenceStudents.add(ciaran);
      
      //adding students to real time systems
      ArrayList<Student> RealtimesystemsStudents = new ArrayList<Student>();
      RealtimesystemsStudents.add(sean);
      RealtimesystemsStudents.add(niall);
      RealtimesystemsStudents.add(sara);
      RealtimesystemsStudents.add(ciaran);
      RealtimesystemsStudents.add(kate);
	  
	  //adding students to modern information management
	  ArrayList<Student> moderninformationmanagmentStudents = new ArrayList<Student>();
	  moderninformationmanagmentStudents.add(sean);
	  moderninformationmanagmentStudents.add(niall);
	  moderninformationmanagmentStudents.add(sara);
	  moderninformationmanagmentStudents.add(ciaran);
	  
      //creating modules and module codes
      Module softwareeng = new Module("Softaware engineering ", "CT417", softwareengStudents);
      Module artificialIntelligence = new Module("Artificial Intelligence", "CT421", artificialIntelligenceStudents);
      Module Realtimesystems = new Module("Real Time Systems", "CT420", RealtimesystemsStudents);
	  Module moderninformationmanagment = new Module("Modern Infromation Managment", "CT422", moderninformationmanagmentStudents);
     
	 //adding the modules to computer science and IT 
      ArrayList<Module> computerscienceandITModules = new ArrayList<>();
      computerscienceandITModules.add(softwareeng);
      computerscienceandITModules.add(artificialIntelligence);
      computerscienceandITModules.add(Realtimesystems);
      computerscienceandITModules.add(moderninformationmanagment);
      
      //program start and end date
      Test computerscienceandIT = new Test("ComputerScience and IT ",computerscienceandITModules , startDate, endDate);
     
	 //adding students to computer science an IT 
      sean.setCourse(computerscienceandIT );
      niall.setCourse(computerscienceandIT );
      sara.setCourse(computerscienceandIT );      
      ciaran.setCourse(computerscienceandIT );
      kate.setCourse(computerscienceandIT );
      
    //using for loop and if statement to differentiate between modules
       for (Student seStudent : softwareeng)
       {
           ArrayList<Module> modules = new ArrayList<Module>();
           modules.add(softwareeng);
		   
           for (Student aStudent : artificialIntelligence)
           {
               if (seStudent.getName().equals(aStudent.getName()))
               {
                   modules.add(artificialIntelligence);
               }
           }
           for (Student rStudent : Realtimesystems)
           {
               if (aStudent.getName().equals(rStudent.getName()))
               {
                   modules.add(RealtimesystemsStudents);
               }
           }
		    for (Student mimStudent : moderninformationmanagment)
           {
               if (rStudent.getName().equals(mimStudent.getName()))
               {
                   modules.add(moderninformationmanagmentStudents);
               }
           }
		   
           //printing out students
           String studentModules = "";
           for (Module module : modules)
           {
              
                studentModules = studentModules + module.getModName() +", ";
              
           }
           Test course = seStudent.getCourse();
           System.out.println(seStudent.getName() + " is in " + ( course.getCourseName() + " taking the modules " + studentModules);
           Test course = aStudent.getCourse();
		   System.out.println(aStudent.getName() + " is in " + course.getCourseName() + " taking the modules " + studentModules);
		   Test course = reStudent.getCourse();
		   System.out.println(reStudent.getName() + " is in " + course.getCourseName() + " taking the modules " + studentModules);
		   Test course = mimStudent.getCourse();
		   System.out.println(mimStudent.getName() + " is in " + course.getCourseName() + " taking the modules " + studentModules);
		   
           
       }

    
}

	private String getCourseName() {
		// TODO Auto-generated method stub
		return null;
	}
    
}