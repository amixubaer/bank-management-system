
package interfacePackage;
import classpackage.Customer;
import java.util.ArrayList;

public interface CustomerOperations {
        public void setCustomer(Customer c);
	public void getCustomer(int nid,ArrayList<Customer> c);
	public void insertCustomer(Customer c);
	public void removeCustomer(ArrayList<Customer> c,int pos);
	public void showAllCustomers(ArrayList<Customer> c);
}
