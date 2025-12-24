package Encapsulation;

final class User{
    String Username;
    String Email;
    double password;

    public User(String Username, String Email,double password){
        this.Username=Username;
        this.Email=Email;
        this.password=password;

    }
    public String getUsername(){
        return Username;
    }

    public String getEmail(){
        return Email;
    }

    public double getpassword(){
        return password;
    }
}
public class Immutable_Class {
    public static void main(String[] args) {
        User usr=new User("shaktiman","Shaktima123@gmail.com",9231674);

        System.out.println("Username of the user is : " + usr.getUsername());
        System.out.println("Email of the user is" + usr.getEmail());
        System.out.println("Password of the User is"+usr.getpassword());
    }
    
}
