/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10477745;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class ST10477745 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       String firstname =  JOptionPane.showInputDialog(null,"Enter First Name:" ,  "Registraion" , JOptionPane.QUESTION_MESSAGE);
       String lastname =  JOptionPane.showInputDialog(null,"Enter Last Name" ,  "Registraion" , JOptionPane.QUESTION_MESSAGE);
       String username =  JOptionPane.showInputDialog(null,  "Enter Username" ,  "Registraion" , JOptionPane.QUESTION_MESSAGE);
       String password =  JOptionPane.showInputDialog(null, "Enter Password" ,  "Registraion" , JOptionPane.QUESTION_MESSAGE);
       String phone =  JOptionPane.showInputDialog(null,"Enter Phone" ,  "Registraion" , JOptionPane.QUESTION_MESSAGE);
       
     
       /* JOptionPane.showInputDialog("Enter Last Name");
        lastname = input.nextLine();
        JOptionPane.showInputDialog("Enter Username");
        username = input.nextLine();
       JOptionPane.showInputDialog("Enter Password");
        password = input.nextLine();
        JOptionPane.showInputDialog("Enter Phone Number (starting with South African international code (+27) :");
        phone = input.nextLine();
        */
       
        Login login = new Login(); //create and instantiate Login object
       
        boolean validatePhone = login.checksCellPhoneNumber(phone);
        boolean validateUsername =login.checkUserName(username);
        boolean validatePassword = login.checkPasswordComplexity(password);
       
        //checks and validates username
        if (validateUsername ==true) {
            JOptionPane.showMessageDialog(null ,"username succefully captured");
        }else{
            JOptionPane.showMessageDialog(null ,"Username is not correctly formatted, please ensure that your username contains an undersore and is no more than five characters in length", "Error", JOptionPane.ERROR_MESSAGE );
        }
       
        //checks and validates password
        if  (validatePassword ==true) {
            JOptionPane.showMessageDialog(null,"Password successfully captured.");
        }else{
            JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure contains at least eight characters, a capital and small letter, a number and a specialcharater", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        //checks and validates phone number
        if (validatePhone ==true) {
            JOptionPane.showMessageDialog(null,"Cellphone number successfully added");
        }else{
            JOptionPane.showMessageDialog(null,"Cellphone number incorrectly formatted or does not contain international code");
        }
         
        if (validateUsername ==true && validatePassword ==true && validatePhone ==true) {
            JOptionPane.showMessageDialog(null,"You have successfully registered");
           
           
            String loginUsername = JOptionPane.showInputDialog(null, "Enter Username" ,  "Login" , JOptionPane.QUESTION_MESSAGE);
            String loginPassword = JOptionPane.showInputDialog(null, "Enter Password" ,  "Login" , JOptionPane.QUESTION_MESSAGE);
           
         
             
           
             
              if (loginUsername.equals(username) && loginPassword.equals(password)) {
                  JOptionPane.showMessageDialog(null,"Welcome " +firstname +  "," + lastname + "it is great to see you again.");
              }else{
                 JOptionPane.showMessageDialog(null ,"Login failed!, wrong username or password","Error", JOptionPane.ERROR_MESSAGE);
               }
              }else{
            JOptionPane.showMessageDialog( null, "Failed to register");
            main(null);
     
       
       
        }
    }
    
}
