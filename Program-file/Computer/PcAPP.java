
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PcAPP {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //define the window size
        window.setBounds(665, 100, 600, 900);

        JButton button = new JButton("Click Here"); 
        button.setBounds(0,0,200,30);

        // Ad on the window the button
        window.add(button);

        window.setLayout(null);


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
                System.out.println("Write the Informations of the PC2:");
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
                while (true){
                if (sc.hasNextInt()){
                    o3.setrammemory(sc.nextInt());
                    sc.nextLine();
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Storage");
                    sc.nextLine();
                    o3.setrammemory(0);
                    
                }
            }

                    System.out.print("Memory Type: ");
                    o3.settypememory(sc.nextLine());

                System.out.print("Quantity of Storage: ");
                while(true){if (sc.hasNextInt()){
                    o3.setstorage(sc.nextInt());
                    sc.nextLine();  
                    break;
                }else{
                    System.out.println("Invalid Number! Please enter an number for the Storage");
                    sc.nextLine();
                    o3.setstorage(0);}
                }
                    

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
                        break;
                    }else{
                        System.out.println("Invalid Number! Please enter an number for the storege");
                        sc.nextLine();
                        System.out.print("Ram Memory: ");
                    }
                }

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

