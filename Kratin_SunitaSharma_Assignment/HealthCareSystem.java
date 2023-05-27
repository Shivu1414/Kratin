import java.util.Scanner;

public class healthCareSystem {
	public static void main(String[] args) {
    System.out.println("User: Sunita Sharma");
    Scanner sc = new Scanner(System.in);
    int x = 0;
    
    while(true){
        System.out.println("Select from the options below: ");
        System.out.println("1. Appointments");
        System.out.println("2. Medicine");
        System.out.println("3. Emergency Info");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Choose an Option: ");
        x = sc.nextInt();
        System.out.println();
        
        	switch (x) {
            case 1:
                System.out.println("Which type of health related issue you have?: ");
                System.out.println("1. Dental");
                System.out.println("2. Eye");
                System.out.println("3. Backbone");
                System.out.println("4. Full body");
                System.out.println();
                System.out.print("Choose an Option: ");
                int y=sc.nextInt();
                System.out.println();
                
                System.out.println("Your Appointments :");
                if(y==1) {
                	System.out.println("27th May 2023 : Dental Checkup at Shivam Hospital");
                }
                else if(y==2) {
                	System.out.println("27th May 2023 : Eye Checkup at Shivam Hospital");
                }
                else if(y==3) {
                	System.out.println("27th May 2023 : Backbone Checkup at Shivam Hospital");
                }
                else if(y==4) {
                	System.out.println("27th May 2023 : Fullbody Checkup at Shivam Hospital");
                }
                else {
                	System.out.println("Input is invalid, Enter valid Input!");
                }                
                break;
            case 2:
            	System.out.println("For which problem you want medicine: ");
                System.out.println("1. Fever");
                System.out.println("2. Cold");
                System.out.println("3. Pain");
                System.out.println("4. Fungal Infection");
                System.out.println();
                System.out.print("Choose an Option: ");
                int z=sc.nextInt();
                System.out.println();
                
                if(z==1) {
                	 System.out.println("Morning : Paracetamol - 1 Tablet");
                     System.out.println("Night : Paracetamol - 1 Tablet");
                }
                else if(z==2) {
                	System.out.println("Morning : NoseCold - 1 Tablet");
                    System.out.println("Night : NoseCold - 1 Tablet");
                }
                else if(z==3) {
                	System.out.println("In a Day : Dylotop - 1 Tablet");
                }
                else if(z==4) {
                	System.out.println("Three Tablet in a Week :");
                    System.out.println("Monday : Zocon - 1 Tablet of 200mg");
                    System.out.println("Wednesday : Zocon - 1 Tablet of 200mg");
                    System.out.println("Saturday : Zocon - 1 Tablet of 200mg");
                }
                else {
                	System.out.println("Input is invalid, Enter valid Input!");
                } 
                break;
            case 3:
                System.out.println("Emergency Info: ");
                System.out.println("Name : Sunita Sharma");
                System.out.println("Blood Group : O +ve");
                System.out.println("Ailment : Psychiatric");
                System.out.println("Guardian Contact Info : 6394254578");
                System.out.println("In case of Emergency provide : TabletX - 1 dosage");
                System.out.println("Doctor Contact Info : Dr. Raveesh; Mobile Number : 6318452598");
                break;
            case 4:
                break;
            default:
                System.out.println("Enter valid Input");
            }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
	

}