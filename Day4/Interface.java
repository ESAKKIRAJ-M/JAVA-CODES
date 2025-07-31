interface BankDatabase {
    void connectDB();
}

interface ATMHardware {
    void startATM();
}

class ATMSystem implements BankDatabase, ATMHardware {

    public void connectDB() {
        System.out.println("*** Connected to Bank Database ***");
    }

    public void startATM() {
        System.out.println(" *** ATM Hardware Started ***");
    }

    public void startService() {
        System.out.println(" *** ATM System is ready to use");
    }
}

public class Interface{
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        atm.connectDB();
        atm.startATM();
        atm.startService();
    }
}

