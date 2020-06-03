package question_1;

import java.time.LocalDate;

public class EmployeeModel {
    private int id;
    private String name;
    private String designation;
    private long salary;
    private LocalDate joiningDate;

    public EmployeeModel(int id, String name, String designation, long salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
