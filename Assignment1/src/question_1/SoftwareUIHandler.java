package question_1;

import java.util.Scanner;

public class SoftwareUIHandler {
    private SoftwareManagementRoom softwareManagementRoom;
    Scanner sc = new Scanner(System.in);

    public SoftwareUIHandler(){
        this.softwareManagementRoom = new SoftwareManagementRoom();
    }

    public void showMainMenu(){
        System.out.println("\n\nSELECT THE FOLLOWING INSTRUCTIONS:-");
        System.out.println("1- Get All Employees");
        System.out.println("2- Check Employee Salary By ID");
        System.out.println("3- Check Employee Total Salary Form Joining By ID");
        System.out.println("4- Get All Employees Monthly Salaries");
        System.out.println("5- Get All Employees Monthly Salaries Form Joining");
        System.out.println("6- Get Internee Benefits");
        System.out.println("7- Get Software Developer Benefits");
        System.out.println("8- Get Project Manger Benefits");

        mainMenuHandler();
    }

    public void mainMenuHandler(){
        System.out.print("\nSelect Instruction: ");
        String instruction= sc.next();

        switch (instruction){
            case "1":
                getAllEmployees();
                break;
            case "2":
                checkEmpSalaryByID();
                break;
            case "3":
                checkEmpSalaryFormJoiningByID();
                break;
            case "4":
                getAllEmpMonthlySalaries();
                break;
            case "5":
                getAllEmpMonthlySalariesFromJoining();
                break;
            case "6":
                displayInterneeBanefits();
                break;
            case "7":
                displayDeveloperBanefits();
                break;
            case "8":
                displayProjectManagerBanefits();
                break;
            default:
                System.out.print("You Select Invalid Instruction\n");
                mainMenuHandler();
        }
    }

    public void getAllEmployees(){
        System.out.println("All Employees Record:");

        for(EmployeeModel employee: softwareManagementRoom.employees) {
            System.out.println("ID: "+ employee.getId() + "  Name: "+ employee.getName() + "  Designation: "+ employee.getDesignation());
        }
        backMenu();
    }

    public void checkEmpSalaryByID(){
        System.out.println("\nEnter Employee ID: ");
        String id = sc.next();
        int empPos = -1;
        for(int i = 0; i<softwareManagementRoom.employees.size(); i++){
            if(id.equals(String.valueOf(softwareManagementRoom.employees.get(i).getId()))){
                empPos = i;
                break;
            }
        }
        if(empPos != -1){
            System.out.print(softwareManagementRoom.employees.get(empPos).getName() +" current salary is " +
                    softwareManagementRoom.employees.get(empPos).getSalary()+".");
        }else {
            System.out.print("\nNo Record Find");
        }
        backMenu();
    }

    public void checkEmpSalaryFormJoiningByID(){
        System.out.println("\nEnter Employee ID: ");
        String id = sc.next();
        int empPos = -1;
        for(int i = 0; i<softwareManagementRoom.employees.size(); i++){
            if(id.equals(String.valueOf(softwareManagementRoom.employees.get(i).getId()))){
                empPos = i;
                break;
            }
        }
        if(empPos != -1){
            System.out.print(softwareManagementRoom.employees.get(empPos).getName()+" "+
                    softwareManagementRoom.getWorkingMonths(softwareManagementRoom.employees.get(empPos).getJoiningDate())+
                    " months" +" total salary is " + softwareManagementRoom.getEmpSalaryFormJoining(softwareManagementRoom.employees.get(empPos))+".");
        }else {
            System.out.print("\nNo Record Find");
        }
        backMenu();
    }

    public void displayInterneeBanefits(){
        System.out.print("\nIntern Benefits:");
        for(BenefitModel benefit: softwareManagementRoom.getInternBeneﬁts()){
            System.out.print("\n"+benefit.getBenefit());
        }
        backMenu();
    }

    public void displayDeveloperBanefits(){
        System.out.print("\nSoftware Developer Benefits:");
        for(BenefitModel benefit: softwareManagementRoom.getDevBeneﬁts()){
            System.out.print("\n"+benefit.getBenefit());
        }
        backMenu();
    }

    public void displayProjectManagerBanefits(){
        System.out.print("\nProject Manager Benefits:");
        for(BenefitModel benefit: softwareManagementRoom.getManagerBeneﬁts()){
            System.out.print("\n"+benefit.getBenefit());
        }
        backMenu();
    }

    public void getAllEmpMonthlySalaries(){
        System.out.print("\nAll Employees Per Month Salaries are "+ softwareManagementRoom.getTotalEmpSalaries()+".");
        backMenu();
    }

    public void getAllEmpMonthlySalariesFromJoining(){
        System.out.print("\nAll Employees Total Salaries From Joinings are :"+ softwareManagementRoom.getTotalEmpSalariesFromJoinings()+".");
        backMenu();
    }

    public void backMenu(){
        System.out.print("\n\nPress any key to menu: ");
        String x = sc.next();
        showMainMenu();
    }
}
