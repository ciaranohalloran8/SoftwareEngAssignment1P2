package SoftwarEngAssignment1P2.softwareengA1P2;

import java.util.Date;

import StudentRegistrationSystem.SoftwareEngAssignment1.Test;
public class Student 
{

    private String name;
	private Date dob;
    private int age;
    private String UName;
    private int ID;
   
     public Student(String name,Date dob, int age, int ID)
    {
        
        this.name = name;
		this.dob = dob;
        this.age = age;
        this.ID = ID;
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
	
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
  
    
    public String getUName()
    {
       
        this.UName = name + age;
        return UName;
    }

	public void setCourse(Test computerscienceandIT) {
		// TODO Auto-generated method stub
		
	}

	public Test getCourse() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
   
    
}