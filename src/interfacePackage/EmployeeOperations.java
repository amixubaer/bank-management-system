
package interfacePackage;
import classpackage.Employee;
import java.util.ArrayList;

public interface EmployeeOperations {
        public void setEmployees(Employee e);
	public void getEmployee(String empId, ArrayList<Employee> e);
	public void insertEmployee(Employee e);
	public void removeEmplyee(ArrayList<Employee> e,int position);
	public void showAllEmployees(ArrayList<Employee> e);
}
