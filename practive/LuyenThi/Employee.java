package practive.LuyenThi;

import java.util.Scanner;

public class Employee extends User{
    protected int employee_basic_salary;
    protected String employee_department;
    public  Employee(String user_id, String user_name, String user_fullname, double user_cosalary,int employee_basic_salary, String employee_department) {
        super(user_id, user_name, user_fullname, user_cosalary);
        this.employee_basic_salary = employee_basic_salary;
        this.employee_department = employee_department;
    }
    public  Employee()
    {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap luong co ban: ");
        this.employee_basic_salary = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap phong ban lam viec: ");
        this.employee_department = sc.nextLine();
    }
    public int getEmployee_basic_salary() {
        return employee_basic_salary;
    }
    public void setEmployee_basic_salary(int employee_basic_salary) {
        this.employee_basic_salary = employee_basic_salary;
    }
    public String getEmployee_department() {
        return employee_department;
    }
    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }
    @Override
    public double getSalary() {
        if(this.employee_department == "nhan su") return this.user_cosalary * this.employee_basic_salary * 1.0;
        if(this.employee_department == "kinh doanh") return this.user_cosalary * this.employee_basic_salary * 1.1;
        if(this.employee_department == "cong nghe") return this.user_cosalary * this.employee_basic_salary * 1.15;
        return this.user_cosalary * this.employee_basic_salary * 1.2;
    }
    public String toString() {
        return " Employee [employee_basic_salary=" + employee_basic_salary + "\n employee_department="
                + employee_department + "\n toString()=" + super.toString() + "]";
    }
}
