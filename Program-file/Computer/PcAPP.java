
import java.util.Scanner;



public class PcAPP {

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in); 

            // Creating objects With the model 

            Pcmodel o1 = new Pcmodel();
            Pcmodel o2 = new Pcmodel();

                //Entering with the  model informations
                System.out.println("\nWrite the Informations of the PC1:");
                System.out.print("Model: ");
                o1.setmodel(sc.nextLine());
                
                System.err.print("Brand: ");
                o1.setbrand(sc.nextLine());
                
                System.out.print("Processor: ");
                o1.setcpu(sc.nextLine());

                System.out.print("Graphics Card: ");
                o1.setgpu(sc.nextLine());

                System.out.print("Ram Memory: ");

                //Create a while loop control to when you send a string instead of a number, make if control with a break for the while until the Int became true
                while (true) {
                    if (sc.hasNextInt()) {
                        o1.setrammemory(sc.nextInt());
                        sc.nextLine();
                        break;
                    } else {
                        System.out.println("Invalid Number! Please enter a number for the Ram Memory");
                        sc.nextLine();
                        System.out.print("Ram Memory: ");
                    }
                }

                
                
            
                System.out.print("Memory Type: ");
                o1.settypememory(sc.nextLine());

            System.out.print("Quantity of Storage: ");
            //Here is the same as the line 36
            while (true) {
                if (sc.hasNextInt()) {
                    o1.setstorage(sc.nextInt());
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Invalid Number! Please enter a number for the Storage");
                    sc.nextLine();
                    System.out.print("Quantity of Storage: ");
                }
            }
            
            System.out.print("How much W has your power suply: ");
            o2.setpsu(sc.nextLine());


                //PC2 INFORMATIONS
                System.out.println("\nWrite the Informations of the PC2:");
                System.out.print("Model: ");
                o2.setmodel(sc.nextLine());
                
                System.err.print("Brand: ");
                o2.setbrand(sc.nextLine());
                
                System.out.print("Processor: ");
                o2.setcpu(sc.nextLine());

                System.out.print("Graphics Card: ");
                o2.setgpu(sc.nextLine());

                System.out.print("Ram Memory: ");
               while(true) {
               if (sc.hasNextInt()){
                    o2.setrammemory(sc.nextInt());
                    sc.nextLine();
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Storage");
                    sc.nextLine();
                    System.out.println("Ram Memory");
                    
                }}

                System.out.print("Memory Type: ");
                o2.settypememory(sc.nextLine());

                System.out.print("Quantity of Storage: ");

                while(true)
                if (sc.hasNextInt()){
                    o2.setstorage(sc.nextInt());
                    sc.nextLine();
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Storage");
                    sc.nextLine();
                    o2.setstorage(0);
                    
                }

                    System.out.print("How much W has your power suply: ");
                    o2.setpsu(sc.nextLine());

                //Creating objects with a parameter build, that recive the code and show it after being constructed 

                System.out.println("\nWrite the information of Computer 3: ");
                System.out.print("Model: ");
                String model3 = sc.nextLine();

                System.out.print("Brand: ");
                String brand3 = sc.nextLine();
                
                System.out.print("Processor: ");
                String cpu3 = sc.nextLine();

                System.out.print("Graphics Card: ");
                String gpu3 = sc.nextLine();

                System.out.print("Ram memory: ");
                int rammemory3 = 0;
                while(true){if (sc.hasNextInt()){
                    sc.nextInt();
                    sc.nextLine();
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Ram memory");
                    sc.nextLine();
                        System.out.print("Ram Memory: ");
                    
                }}
                    
                
                System.out.print("Memory Type: ");
                String typememory3 = sc.nextLine();

                System.out.print("Quantity of Storage: ");
                int storage3 = 0;
                while(true){
                    if(sc.hasNextInt()){
                        sc.nextInt();
                        sc.nextLine();
                        break;
                    }else{
                        System.out.println("Invalid Number! Please enter an number for the storege");
                        sc.nextLine();
                        System.out.print("Ram Memory: ");
                    }
                }

                System.out.print("How much W Has your power suply: ");
                String psu3 = sc.nextLine();
                
                 // Atribuation with a parameter build
                Pcmodel o3 = new Pcmodel(model3, brand3, cpu3, gpu3, rammemory3, typememory3, storage3, psu3);

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
                int rammemory4 = 0;
                while(true){if (sc.hasNextInt()){
                    sc.nextInt();
                    sc.nextLine();
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Ram memory");
                    sc.nextLine();
                        System.out.print("Ram Memory: ");
                    
                }}
                    
                
                System.out.print("Memory Type: ");
                String typememory4 = sc.nextLine();

                System.out.print("Quantity of Storage: ");
                int storage4 = 0;
                while(true){
                    if(sc.hasNextInt()){
                        sc.nextInt();
                        sc.nextLine();
                        break;
                    }else{
                        System.out.println("Invalid Number! Please enter an number for the storege");
                        sc.nextLine();
                        System.out.print("Ram Memory: ");
                    }
                }

                System.out.print("How much W Has your power suply: ");
                String psu4 = sc.nextLine();


                // Atribuation with a parameter build
                
                Pcmodel o4 = new Pcmodel(model4, brand4, cpu4, gpu4, rammemory4, typememory4, storage4, psu4);
                

                // Showing the list of pc's!

                System.out.println("\n-------PC'S LIST!--------");
                System.out.println("\n=====Here's the first PC!=====");
                o1.print1();
                System.out.println("\n=====Here's the Second PC!=====");
                o2.print1();
                System.out.println("\n=====Here's the third PC!=====");
                o3.print1();
                System.out.println("\n=====Here's the forth PC!=====");
                o4.print1();

                    sc.close();
    }
    }

