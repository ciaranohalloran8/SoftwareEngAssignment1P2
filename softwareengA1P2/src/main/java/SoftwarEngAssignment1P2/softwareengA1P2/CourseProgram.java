package SoftwarEngAssignment1P2.softwareengA1P2;


import java.sql.Date;
import java.util.List;

import StudentRegistrationSystem.SoftwareEngAssignment1.Module;

public class CourseProgram {
    
    private String courseName;
    private List<Module> moduleList;
    private Date startdate;
    private Date endDate;
    
    public CourseProgram(String courseName, List<Module> moduleList, Date startdate, Date endDate) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startdate = startdate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
}