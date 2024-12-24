package practive.LuyenThi;

public interface EmployeeManager {
    public void addEmployee(Employee e);
    public void editEmployee(Employee e);
    public int searchEmployee(String fullString);
    public double getTotalSalary();
}
