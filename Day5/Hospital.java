// 1. Design a Java program to maintain hospital medical records.
// Create a base class named MedicalRecord that includes common attributes:
// --- recordId, patientName, dateOfVisit, and diagnosis.
// --- inputRecordDetails() – to input common record information.
// --- override displayRecord() – to display the common record details.
// ‌
// Create a subclass InPatientRecord that extends MedicalRecord and adds:
// --- roomNumber, numberOfDaysAdmitted, roomCharges.
// --- calculateTotalCharges() – to compute and return total inpatient cost.
// --- displayRecord() – to include all details, including total charges.
// ‌
// Create another subclass OutPatientRecord that extends MedicalRecord and adds:
// --- doctorName, consultationFee.
// --- override displayRecord() – to include all outpatient-specific details.
// Include all the necessary classes if its needed.

import java.util.ArrayList;
import java.util.Scanner;
class MedicalRecord{
    String recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;


   
    public MedicalRecord(String recordId, String patientName, String dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }



    void displayRecord(){
        System.out.println( "The Patient Name               : "+ patientName );
        System.out.println( "The Patient Id                 : " + recordId);
        System.out.println( "The Date of Visit              : " + dateOfVisit);
        System.out.println( "The Patient Diagnosis          : " + diagnosis);
    }

}

class InPatientRecord extends MedicalRecord{
    int roomNO ;
    int noOfDays;
    int roomCharge;

    ArrayList<InPatientRecord> inpatient = new ArrayList<>();

    public InPatientRecord(int roomNO, int noOfDays, int roomCharge , String id , String name, String date , String dia) {

        super(id,name,date,dia);

        this.roomNO = roomNO;
        this.noOfDays = noOfDays;
        this.roomCharge = roomCharge;
       

        
        
    }


    Scanner scan = new Scanner(System.in);
    private String calculateTotalCharges;

    void calculateTotalCharges(){
        System.out.println(noOfDays * roomCharge);
    }
    void imputPatient(){

        System.out.print("Enter a Patient Room No         : ");
        roomNO = scan.nextInt();
        System.out.println();

        System.out.print("Enter a No of Days in           : ");
        noOfDays = scan.nextInt();
        System.out.println();

        System.out.print("Enter a Room Charges            : ");
        roomCharge = scan.nextInt();
        System.out.println();

        System.out.print("Enter a Patient Name              : ");
        patientName = scan.nextLine();
        System.out.println();

        System.out.print("Enter a Patient Record ID          : ");
        recordId = scan.nextLine();
        System.out.println();

        System.out.print("Enter a Date Of Visit (DD-MM-YYYY) : ");
        dateOfVisit = scan.nextLine();
        System.out.println();

        System.out.print("Enter a Patient Diagnosis          : ");
        dateOfVisit = scan.nextLine();
        System.out.println();

        InPatientRecord in = new InPatientRecord( roomNO,  noOfDays,roomCharge , recordId , patientName, dateOfVisit , diagnosis)
        in.calculateTotalCharges();
        inpatient.add(in);

    }
    

    void displayRecord(){
        
        System.out.println("++++++++++++++ IN Patients Details +++++++++++++");
        for(InPatientRecord obj : inpatient){
            InPatientRecord p = (InPatientRecord)obj;
            System.out.println("The Patient Name                           :  " + obj.patientName);
            System.out.println("The Patient Recored Id                     :  " + obj.recordId);
            System.out.println("The Patient Date of Visit                  :  " + obj.dateOfVisit);
            System.out.println("The Patient Diagnosist                     :  " + obj.diagnosis);
            System.out.println("The Patient Room NO                        :  " + obj.patientName);
            System.out.println("The Patient No OF Days Atmitted            :  " + obj.patientName);
            System.out.println("The Patient No OF Days Atmitted            :  " + p.calculateTotalCharges);
            

        }
    }
}


