import java.util.Scanner;

public class EmailApp{
   private String firstname; 
   private String lastname; 
   private String email; 
   private String password; 
   private String department; 
   private String company="testing"; 
   private String alternateEmail; 
   private int mailCapacity; 
   private int defaultPasswordlength = 10;

   public EmailApp(String firstname, String lastname) {
    this.firstname=firstname;
    this.lastname = lastname;
    this.department = setDepartment();
    email = setEmail();
    // password = setPassword();
    




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

   public void getEmail(){
    System.out.println(email);
   }


}