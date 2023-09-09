/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author rhenz
 */
public class ClassChallenge {
    public static void main(String[] args) {
        
        bankAccount Customer1 = new bankAccount();
        Customer1.setAccountNumber(12345);
        Customer1.setBalance(15000);
        Customer1.setCustomerName("John Johnson");
        Customer1.setEmail("abcd@somewhat.com");
        Customer1.setPhoneNumber(123456789);
        
        Customer1.deposit(5000);
        System.out.println(Customer1.getBalance());
        Customer1.withdraw(50000);
        System.out.println(Customer1.getBalance());
        
    }
}
