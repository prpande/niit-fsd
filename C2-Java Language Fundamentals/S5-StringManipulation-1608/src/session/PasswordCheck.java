package session;

/*
 * String Manipulation
 * Write a program that accepts the username and password and
 * performs the following tasks:
 * Task l : Create a password Of less than 15 characters.
 * Task 2: Ensure that the username is "James" and the password
 * entered is "password@123".
 * Task3: Display the welcome message with the username in upper
 */
public class PasswordCheck 
{
    public void checkPassword(String password) 
    {
        if (password.length() < 15) 
        {
            System.out.println("Password is less than 15 Characters");
        } else 
        {
            System.out.println("Password is more than 15 Characters");
        }

    }

    public void checkEqualityForUserNameAndPassword(String username, String password) 
    {
        if (username.equals("James") && password.equals("password@123")) 
        {
            System.out.println("Username and Password are correct ");
        } else 
        {
            System.out.println("Username and Password are incorrect");
        }

    }

    public String changeUserName(String username) 
    {
        String newUserName = username.toUpperCase();
        return newUserName;
    }

    public static void main(String[] args) 
    {
        PasswordCheck stringManipulation = new PasswordCheck();
        String password = "password@12345";
        stringManipulation.checkPassword(password);
        String username = "John";
        stringManipulation.checkEqualityForUserNameAndPassword(username, password);
        String newUserName = stringManipulation.changeUserName(username);
        System.out.println("Welcome " + newUserName);
    }
}
