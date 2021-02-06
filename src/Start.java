import java.util.ArrayList;
import java.util.Scanner;
import classpackage.*;
import interfacePackage.*; 
import java.io.IOException;
import java.util.Arrays;
public class Start{
	public static void main(String args[]) throws IOException{
		
            
            
		Scanner input=new Scanner(System.in);
		int option;
                ArrayList<Customer> c=new ArrayList<>();
                ArrayList<Employee> e=new ArrayList<>();
                Bank b=new Bank();
                Bank BankForEmp=new Bank();
                Account a=new Account();
		System.out.println("\n\n\n-------------------------Welcome to The Project----------------------");
		System.out.println("----------------Application is based on user as per the choice--------------");
		
		
		while(true)
		{
			System.out.println("1)Employee Management"+"\t"+"2)Customer Management \t 3)Account Transactions 4)Exit");
			System.out.print("Choose Option: ");
			option=input.nextInt();
                
			switch(option){
			case 1:
                            
				boolean GoForword=true;
				while(GoForword){
				System.out.println("1)Insert New Employee"+"\t"+"2)Remove Existing Employee\t 3)Show All Employee\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInEmployee,indexControlEmp=0;
				String name,empId;
				double salary;
				optionInEmployee=input.nextInt();
				switch(optionInEmployee){
				case 1:
					e.add(indexControlEmp,new Employee());
					System.out.print("Employee's Name: ");
					input.nextLine();
					name=input.nextLine();
					e.get(indexControlEmp).setName(name);
					
					System.out.print("Employee's ID: ");
					empId=input.nextLine();
					e.get(indexControlEmp).setEmpId(empId);
					
					System.out.print("Employee's Salary: ");
					salary=input.nextDouble();
					e.get(indexControlEmp).setSalary(salary);
					
					BankForEmp.insertEmployee(e.get(indexControlEmp));
					
					indexControlEmp++;										
					break;
				case 2:
					String ID;
                                        System.out.print("Enter Customer's NID to delete: ");
					input.nextLine();
					ID=input.nextLine();  
                                        BankForEmp.getEmployee(ID, e);
				
				
				
					break;
				case 3:
					System.out.println("\n\n--------Printing Avilable Employees in the DataBase---------\n");
					BankForEmp.showAllEmployees(e);
				
				
					break;
				case 4:
						GoForword=false;
						break;
				default:
					System.out.println("Invalid Input");
					
				}
			}
			break;
			case 2:
				boolean GoBackOrNot=true;
				while(GoBackOrNot){
				System.out.println("1)Insert New Customer"+"\t"+"2)Remove Existing Customer\t 3)Show All Customer\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInCustomer;
				String name;
				int Nid,idnexControl=0;
				optionInCustomer=input.nextInt();
				switch(optionInCustomer){
					case 1:	
						
						
                                         
                                                c.add(idnexControl,new Customer());
						System.out.print("Customer's Name: ");
						input.nextLine();
						name=input.nextLine();
						c.get(idnexControl).setName(name);
						System.out.print("Customer's NID: ");
						Nid=input.nextInt();
                                                c.get(idnexControl).setNid(Nid);
                                                b.insertCustomer(c.get(idnexControl));
						idnexControl++;
						break;
					
					case 2:
                                            int nid;
                                            System.out.print("Enter Customer's NID to delete: ");
                                            nid=input.nextInt();
                                            b.getCustomer(nid,c);
                                            
                                            
					break;
                                   
				case 3:
					System.out.println("\n\n--------Printing Avilable Customer's in the DataBase---------\n");
                                           
                                       
                                      b.showAllCustomers(c);
                                     
                                       
					
				
					break;
				case 4:
						GoBackOrNot=false;
				break;
				default:
						System.out.println("Invalid Input");
				}
			
			}
			break;
			
		case 3:
			
			boolean GoNext=true;
			while(GoNext){
				int OptionInAT;
				int AccNumber;
				double amount,Damount,Wamount;
				System.out.println("1.Deposit Money\t 2.Withdraw Money\t 3.Going Back");
				OptionInAT=input.nextInt();
				switch(OptionInAT){
					case 1:
                                                System.out.println("Account Number: ");
                                                AccNumber=input.nextInt();
                                                a.setAccountNumber(AccNumber);
                                                System.out.println("Current Balance: ");
                                                amount=input.nextDouble();
                                                a.setBalance(amount);
                                                
						System.out.println("Deposit Amount :");
						Damount=input.nextDouble();
						a.deposit(Damount);
                                                System.out.println("Printing Data From file History");
                                                a.showInfo();
						
						
					break;
					case 2:
						
						System.out.println("Withdraw Amount :");
						Wamount=input.nextDouble();
						a.withdraw(Wamount);
                                                System.out.println("Printing Data From file History");
                                                a.showInfo();
					break;
                                        
					case 3:
                                                
						GoNext=false;
					break;
					default:
					
				}
			}
			break;
		default:
			System.out.println("Invalid Input");
		}
	  }
	}
  }