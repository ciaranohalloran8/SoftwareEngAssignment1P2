package SoftwarEngAssignment1P2.softwareengA1P2;



import java.util.List;

import StudentRegistrationSystem.SoftwareEngAssignment1.Student;

public class Module {
    
    private String modName;
    private String ID;
    private List <Student> studList;

    public Module(String modName, String ID, List <Student> studList) {
        this.modName = modName;
        this.ID = ID;
        this.studList = studList;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List <Student> getStudList() {
        return studList;
    }

    public void setStudentList(List <Student> studList) {
        this.studList = studList;
    }
	  
}