package June15;

import java.util.Scanner;

public class Driver {
	
	static double balance;
	
	 public static void validateEmail(String email) throws EmailException {
	        if (!email.contains("@") || 
	            !(email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".org") || email.endsWith(".edu"))) {
	            throw new EmailException("Invalid email format. ");
	        }
	    }

	
	 public static void validatePassword(String password) throws WeakPasswordException {
	        if (password.length() < 8) {
	            throw new WeakPasswordException("Password must be at least 8 characters long.");
	        }

	        if (!password.matches(".*[A-Z].*")) {
	            throw new WeakPasswordException("Password must contain at least one uppercase letter.");
	        }

	        if (!password.matches(".*[0-9].*")) {
	            throw new WeakPasswordException("Password must contain at least one number.");
	        }

	        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
	            throw new WeakPasswordException("Password must contain at least one special character.");
	        }
	        
	 }
	 
	 public static void withdraw(double amount) throws BalanceException {
	        if (amount > balance) {
	            throw new BalanceException("Withdrawal failed: Insufficient balance.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
	    }
	 
	 
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        
        try {
            int age = scanner.nextInt();

            if (age < 18) {
            
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Age is valid. You are eligible.");
            scanner.nextLine(); // consume newline
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            validatePassword(password);
            System.out.println("✅ Password is strong.");
            scanner.nextLine(); // consume newline
            
            balance=5000;
            System.out.print("Enter amount to withdraw: ₹");
            double amount = scanner.nextDouble();
            withdraw(amount);
            scanner.nextLine();
            
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();
            validateEmail(email);
            System.out.println("✅ Email is valid.");
            
            
     
       
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();


            System.out.print("Enter employee salary: ₹");
            double salary = scanner.nextDouble();
            
   
            
            if (salary < 0) {
                throw new SalaryException("Salary cannot be negative.");
            }

            if (age < 18 || age > 65) {
                throw new EmployeeAgeException("Employee age must be between23 18 and 65.");
            }
            
            
            
            System.out.println("✅ Employee added: " + name + ", Age: " + age + ", Salary: ₹" + salary);
            
        } 
        catch (SalaryException e) {
            System.out.println("❌ NegativeSalaryException: " + e.getMessage());
        } catch (EmployeeAgeException e) {
            System.out.println("❌ InvalidEmployeeAgeException: " + e.getMessage());
        }
        catch (EmailException e) {
            System.out.println("❌ InvalidEmailException: " + e.getMessage());
        }
        catch (BalanceException e) {
            System.out.println("❌ InsufficientBalanceException: " + e.getMessage());
        }
        catch (WeakPasswordException e) {
            System.out.println("❌ WeakPasswordException: " + e.getMessage());
        }catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}