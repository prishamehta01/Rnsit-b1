public class Patient {
    String patientName;
    int age;
    String doa;
    String disease;

    //Association
    Information info;
    Payment pay;

    public Patient(String name,int age,String doa,String dis,Information info,Payment pay){
        patientName = name;
        this.age = age;
        this.doa = doa;
        disease = dis;
        this.info = info;
        this.pay = pay;
    }
    void displayDetails(){
        System.out.println("Name: "+patientName);
        System.out.println("Age: "+age);
        System.out.println("Date: "+doa);
        System.out.println("Diesease: "+disease);
        System.out.println("Block no: "+info.blockNo);
        System.out.println("Floor no: "+info.floorNo);
        System.out.println("Room no: "+info.roomNo);
        System.out.println("Bed no: "+info.bedNo);
        System.out.println("Admission fee: "+pay.admFees);
        System.out.println("Registrationn fee: "+pay.regFees);
        System.out.println("Balance: "+pay.bal);
    }
    public static void main(String[] args) {
        Information info = new Information("A", 1, 102, 2);
        Payment pay = new Payment(10000, 20000, 10000);
        Patient p1 = new Patient("Abc", 20, "28/3/2025", "Malaria", info, pay);
        p1.displayDetails();
    }
}
