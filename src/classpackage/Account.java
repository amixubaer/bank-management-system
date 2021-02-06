
package classpackage;
import java.io.*;
import interfacePackage.ITransactions;
import java.util.Scanner;
public class Account implements ITransactions {
	

    public int accountNumber;
    public double balance;
	
    File file = new File("History.txt");
	
    public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
    }

    public void setBalance(double balance) {
		this.balance=balance;
    }

    public int getAccountNumber() {
		return accountNumber;
		
    }
	double getBalance(){
                
		return balance;
	}

    public void showInfo() throws IOException {
		try
               {
               File FileObject=new File("History.txt");
               Scanner myReader =new Scanner(FileObject);
               while(myReader .hasNextLine()){
               String data=myReader .nextLine();
                   System.out.println(data);
               }
                myReader.close();
                }
                catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    @Override
    public void deposit(double amount) {
		 this.balance = this.balance + amount;
		try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Deposit ->"+amount+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			System.out.println("Added transaction To History");
		}
		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
			
		
		
    }

    @Override
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
		try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Withdraw ->"+amount+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			
			System.out.println("Added the transaction To History");
		}
		catch(IOException ioe)
		{
		}
    }

}
