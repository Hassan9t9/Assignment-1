package question_1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;

public class SoftwareManagementRoom {
    public final String INTERNEE = "Intern";
    public final String DEVELOPER = "Software Developer";
    public final String MANAGER = "Project Manager";

    public ArrayList<EmployeeModel> employees = new ArrayList();
    public ArrayList<BenefitModel> beneﬁts = new ArrayList();


    public SoftwareManagementRoom() {
        setEmployeesData();
        setBenefitsData();
    }

    public void setEmployeesData(){
        employees.add(new EmployeeModel(1, "Waqas Ahmad", INTERNEE, 10000,  LocalDate.of(2020, Month.JANUARY, 19)));
        employees.add(new EmployeeModel(2, "Mohsin Ali Raiz", INTERNEE, 20000,  LocalDate.of(2019, Month.MAY, 1)));
        employees.add(new EmployeeModel(3, "Farukh Tariq", INTERNEE, 15000,  LocalDate.of(2019, Month.DECEMBER, 5)));
        employees.add(new EmployeeModel(4, "Ali Raza", INTERNEE, 16000,  LocalDate.of(2019, Month.OCTOBER, 15)));
        employees.add(new EmployeeModel(5, "Haris Mahmood", INTERNEE, 8000,  LocalDate.of(2020, Month.MARCH, 2)));
        employees.add(new EmployeeModel(6, "Haroon Munir", DEVELOPER, 60000,  LocalDate.of(2017, Month.JUNE, 21)));
        employees.add(new EmployeeModel(7, "Abdullah Tahir", DEVELOPER, 50000,  LocalDate.of(2018, Month.FEBRUARY, 16)));
        employees.add(new EmployeeModel(8, "Hassan Ijaz", MANAGER, 200000,  LocalDate.of(2015, Month.APRIL, 4)));
    }

    public void setBenefitsData(){
        beneﬁts.add(new BenefitModel(1, "Gain valuable coding skill", INTERNEE));
        beneﬁts.add(new BenefitModel(2, "We are offering Financial compensation", INTERNEE));
        beneﬁts.add(new BenefitModel(3, "Work five days a week ", INTERNEE));
        beneﬁts.add(new BenefitModel(4, "Increments after every 6 months", INTERNEE));
        beneﬁts.add(new BenefitModel(5, "The rate of pay salary is high", DEVELOPER));
        beneﬁts.add(new BenefitModel(6, "You can be as creative as you want", DEVELOPER));
        beneﬁts.add(new BenefitModel(7, "You can use your leadership skills", DEVELOPER));
        beneﬁts.add(new BenefitModel(8, "Job security with a minimum 5 year contract", MANAGER));
        beneﬁts.add(new BenefitModel(9, "10% increment every year on the basis of your current salary", MANAGER));
    }

    public int getWorkingMonths(LocalDate joiningDate){
        LocalDate jDate = joiningDate;
        LocalDate today = LocalDate.now();
        Period workingOPeriod = Period.between(jDate, today);
        int years = workingOPeriod.getYears();
        int months = workingOPeriod.getMonths();
        return ((years*12) + months);
    }

    public long getEmpSalaryFormJoining(EmployeeModel employee){
        int empTotalWorkingMonths = getWorkingMonths(employee.getJoiningDate());
        long wholeSalaryRecord = empTotalWorkingMonths * employee.getSalary();
        return wholeSalaryRecord;
    }

    public long getTotalEmpSalaries(){
        long totalSalaries = 0;
        for (EmployeeModel employee: employees) {
            totalSalaries = totalSalaries + employee.getSalary();
        }
        return totalSalaries;
    }

    public long getTotalEmpSalariesFromJoinings(){
        long totalSalariesFromJoinings = 0;
        for (EmployeeModel employee: employees) {
            totalSalariesFromJoinings = totalSalariesFromJoinings + getEmpSalaryFormJoining(employee);
        }
        return totalSalariesFromJoinings;
    }

    public ArrayList<BenefitModel> getInternBeneﬁts() {
        ArrayList<BenefitModel> mBeneﬁts = new ArrayList();
        for(BenefitModel benefit: beneﬁts){
            if(benefit.getTag().equals(INTERNEE))
                mBeneﬁts.add(benefit);
        }
        return mBeneﬁts;
    }

    public ArrayList<BenefitModel> getDevBeneﬁts() {
        ArrayList<BenefitModel> mBeneﬁts = new ArrayList();
        for(BenefitModel benefit: beneﬁts){
            if(benefit.getTag().equals(INTERNEE) || benefit.getTag().equals(DEVELOPER))
                mBeneﬁts.add(benefit);
        }
        return mBeneﬁts;
    }

    public ArrayList<BenefitModel> getManagerBeneﬁts() {
        return beneﬁts;
    }
}
