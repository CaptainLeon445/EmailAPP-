public class Driver{
    public static void main(String[] args){
       EmailApp obj = new EmailApp("Chris", "leon");
       obj.setAlternateMail("leon.chris@new.mail.com");
       obj.setMailBoxCapacity(200, "mb");
       obj.getProfile();


    }
}