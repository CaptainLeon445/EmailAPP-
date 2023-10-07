import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;


public class EmailApp{
   private String firstname; 
   private String lastname; 
   private String email; 
   private String password; 
   private String department; 
   private String company="testing"; 
   private String alternateEmail; 
   private String mailCapacity; 
   private int defaultPasswordlength = 10;

   public EmailApp(String firstname, String lastname) {
    this.firstname=firstname;
    this.lastname = lastname;
    this.department = setDepartment();
    email = setEmail();
    password = setRandomPassword(defaultPasswordlength);
    

   }

   public String setDepartment(){
     System.out.println("Options for department:\n1 for sales \n2 for development \n3 for accounting");
     Scanner sc=new Scanner(System.in);
     System.out.println("Department: ");

     int choice=sc.nextInt();
     switch (choice){
        case 1:
            return "sales";
        case 2:
            return "dev";
        case 3:
            return "acc";
        default:
            return "";
            // break;
     }
   }

   public String setEmail(){
    return firstname.toLowerCase() +"."+ lastname.toLowerCase() + "@"+this.department+"."+company+".com";
   }

   private String setRandomPassword (int length){
     String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_";
     char[] password = new char[length];
     for (int i=0; i<length; i++){
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
     }
     return new String(password);
   }

    public void setMailBoxCapacity(int capacity, String type){
    this.mailCapacity = capacity+type;
   }

    public void setAlternateMail(String email){
    this.alternateEmail = email;
   }

    public String getEmail(){
    return email;
   }

   public String getAlternateMail(){
    return alternateEmail;
   }


   public String getPassword(){
    return password;
   }

   public String getMailCapacity(){
    return mailCapacity;
   }

   public String getFullname(){
    return firstname +" "+ lastname;
   }

   public void getProfile(){
    Dictionary data = new Hashtable();
    data.put("Full Name", getFullname());
    data.put("Password", getPassword());
    data.put("Email", getEmail());
    data.put("Email Capacity", getMailCapacity());
    data.put("Alternate Email", getAlternateMail());
    System.out.println(data);
   }
}