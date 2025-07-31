package Day6.TravelsApp.TravelBooking;
import Day6.TravelsApp.TravelBooking.Ticket;

public class User {
    private String name;
    private int age;
    private String eMail;
    private String phone;
    static int id =10000;
    
     public User(String name, int age, String eMail, String phone,String id,String destination,double fare) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
        this.phone = phone;

        new Ticket(id, destination, fare);
    }

    public User(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

        

    void bookTicket(String name ,int age,String mail,String phone,String destination){
        
        int fareTol =0;

        if(destination.toLowerCase().equals("chennai")){
                fareTol =1000;

        }

        else if(destination.toLowerCase().equals("trichy")){
            fareTol = 600;
        }
        else if(destination.toLowerCase().equals("madurai")){
            fareTol = 300;
        }
        else if(destination.toLowerCase().equals("coimbatore")){
            fareTol = 800;
        }

        User user = new User(name, age, mail, phone, "TC"+(++id), destination,fareTol);
        DataBace db = new DataBace();
        db.data.add(user);

        }

    

}
