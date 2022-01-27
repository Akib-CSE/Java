package blood_donation;

import java.util.ArrayList;
import java.util.Scanner;

public class Blood_Donation {
    public static void main(String[] args) {
        int id;
        String name;
        int age;
        String contactNo;
        String professon;
        String bloodGroup;
        String lastDate;
        int totalDonate;
        
        Scanner scani = new Scanner(System.in);
        Scanner scans = new Scanner(System.in);
        ArrayList<Person> personArray = new ArrayList();
        personArray.add(new Person(181151947, "Masidul", 20, "01785555127", "Student", "A+", "12/01/2019", 4));
        personArray.add(new Person(181152000, "Akib", 20, "01620603013", "Student", "O+", "15/01/2019", 5));
        personArray.add(new Person(181151766, "Rasel", 19, "01787833335", "Student", "B+", "2/08/2018", 7));
        personArray.add(new Person(181152068, "Rimon", 21, "01621365951", "Student", "O+", "26/03/2019", 3));
        personArray.add(new Person(181151904, "Joynul", 21, "01832456739", "Student", "B+", "13/4/2017", 2));
        personArray.add(new Person(72000001, "Mahfujur Rahman Raju", 30, "01765846329", "Teacher", "B-", "0/0/00", 0));
        personArray.add(new Person(72000002, "Dr.S.M Aminul Haque", 39, "01987645395", "Teacher", "AB+", "11/12/2018", 9));
        personArray.add(new Person(72000003, "Zarin Tasnim Shejuti", 26, "01622672977", "Teacher", "A+", "3/03/2019", 200));
        personArray.add(new Person(72000004, "Nahid Sultana", 29, "01712985634", "Teacher", "A-", "22/09/2018", 11));
        personArray.add(new Person(72000005, "Asaduzzaman Asad", 24, "01856387293", "Teacher", "AB+", "16/07/2018", 6));
        personArray.add(new Person(32000001, "Abdul Motaleb", 32, "019234352653", "Staff", "AB-", "9/11/2018", 14));
        personArray.add(new Person(32000002, "Mofiz Mia", 52, "01639876453", "Staff", "O-", "3/4/2019", 21));
        int n;
        System.out.println("----------DIU BLOOD BANK----------");
        while(true){
        System.out.print("\nEnter 1. Create Account\nEnter 2. Search Blood\nEnter: ");
        n = scani.nextInt();     
        switch(n){
            case 1:
                System.out.print("\nID: ");
                id = scani.nextInt();
                System.out.print("Name: ");
                name = scans.nextLine();
                System.out.print("Age: ");
                age = scani.nextInt();
                System.out.print("Contact NO: ");
                contactNo = scans.nextLine();
                System.out.print("Professon: ");
                professon = scans.nextLine();
                System.out.print("Blood Group: ");
                bloodGroup = scans.nextLine();
                System.out.print("Last Donate Date: ");
                lastDate = scans.nextLine();
                System.out.print("Total Donate: ");
                totalDonate = scani.nextInt();
                personArray.add(new Person(id, name, age, contactNo, professon, bloodGroup, lastDate, totalDonate));
                System.out.println("--------ID Created-------");
                break;
            case 2:
                System.out.print("Enter Blood Group: ");
                bloodGroup = scans.nextLine();
                for(Person i: personArray){
                if(bloodGroup.equals(i.getBloodGroup()))System.out.println(i);
            }
                break;
            default :
                System.out.println("Wrong Input!!");
                break;
        }
        }
    }
    
}
