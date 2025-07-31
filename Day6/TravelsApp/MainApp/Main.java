import MainApp.Main;
import MainApp.DataBace;
import Travel.User;
public class Main {
    public static void main(String[] args) {
        User u = new User();

        u.bookTicket("esakki",21,"esakki@gmial.com","123456789","madurai");
        DataBace d = new DataBace();
        //System.out.println(d.data.size());
    }
    
    
}
