
import java.util.Scanner;

public class PcAPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Creating objects With the model

            Pcmodel o1 = new Pcmodel();
            Pcmodel o2 = new Pcmodel();
            Pcmodel o3 = new Pcmodel();

                //Entering with the informations 
                System.out.println("Write the Informations of the PC1:");
                System.out.print("Model: ");
                o1.setmodel(sc.nextLine());
                
                System.err.print("Brand: ");
                o1.setbrand(sc.nextLine());
                
                System.out.print("Processor: ");
                o1.setcpu(sc.nextLine());

                System.out.print("Graphics Card: ");
                o1.setgpu(sc.nextLine());

                System.out.print("Ram Memory: ");
                if (sc.hasNextInt()) {
                    o1.setrammemory(sc.nextInt());
                    sc.nextLine(); 
                } else {
                    System.out.println("Invalid input! Please enter an number for Ram Memory.");
                    sc.nextLine(); // consume the invalid input
                    o1.setrammemory(0); 
                }
                
                

                System.out.print("Memory Type: ");
                o1.settypememory(sc.nextLine());

                System.out.print("Quantity of Storage: ");
                o1.setstorage(sc.nextInt());
                
                System.out.print("How much W has your power suply: ");
                o2.setpsu(sc.nextLine());


                //PC2 INFORMATIONS
                System.out.println("Write the Informations of the PC1:");
                System.out.print("Model: ");
                o2.setmodel(sc.nextLine());
                
                System.err.print("Brand: ");
                o2.setbrand(sc.nextLine());
                
                System.out.print("Processor: ");
                o2.setcpu(sc.nextLine());

                System.out.print("Graphics Card: ");
                o2.setgpu(sc.nextLine());

                System.out.print("Ram Memory: ");
                o2.setrammemory(sc.nextInt());

                System.out.print("Memory Type: ");
                o2.settypememory(sc.nextLine());

                System.out.print("Quantity of Storage: ");
                o2.setstorage(sc.nextInt());

                System.out.print("How much W has your power suply: ");
                o2.setpsu(sc.nextLine());


                //PC3 INFORMATIONS
                System.out.println("Write the Informations of the PC3:");
                System.out.print("Model: ");
                o3.setmodel(sc.nextLine());
                
                System.err.print("Brand: ");
                o3.setbrand(sc.nextLine());
                
                System.out.print("Processor: ");
                o3.setcpu(sc.nextLine());

                System.out.print("Graphics Card: ");
                o3.setgpu(sc.nextLine());

                System.out.print("Ram Memory: ");
                o3.setrammemory(sc.nextInt());

                System.out.print("Memory Type: ");
                o3.settypememory(sc.nextLine());

                System.out.print("Quantity of Storage: ");
                o3.setstorage(sc.nextInt());

                System.out.print("How much W has your power suply: ");
                o3.setpsu(sc.nextLine());


                //Creating objects with a parameter build

                
                System.out.println("\nWrite the information of Computer 4: ");
                System.out.print("Model: ");
                String model4 = sc.nextLine();

                System.out.print("Brand: ");
                String brand4 = sc.nextLine();
                
                System.out.print("Processor: ");
                String cpu4 = sc.nextLine();

                System.out.print("Graphics Card: ");
                String gpu4 = sc.nextLine();

                System.out.print("Ram memory: ");
                int rammemory4 = sc.nextInt();
                
                System.out.print("Memory Type: ");
                String typememory4 = sc.nextLine();

                System.out.print("Quantity of Storage: ");
                int storage4 = sc.nextInt();

                System.out.print("How much W Has your power suply: ");
                String psu4 = sc.nextLine();

                Pcmodel o4 = new Pcmodel(model4, brand4, cpu4, gpu4, rammemory4, typememory4, storage4, psu4);

                // Showing the list of pc's!

                System.out.println("\nPC'S LIST!");
                o1.print1();
                o2.print1();
                o3.print1();
                o4.print1();

                    sc.close();
    }
}
