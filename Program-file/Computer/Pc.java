


public class Pc {

    // Attributes 
    private String model; // ex "acer"
    private String brand; // ex "nitro"
    private String cpu; // ex "Ryzen 5 5500X3D"
    private String gpu; // ex "RTX4060TI"
    private int rammemory; // ex "16GB"
    private String typememory; // ex "DDR5"
    private int storage; // ex ""926"



    
        // Default contructor 
        public Pc(){
            //Each type is reciving a void parameter (without declaring it).
            this.model = ""; 
            this.brand = "";
            this.cpu = "";
            this.gpu = "";
            this.rammemory = 0;
            this.typememory = "";
            this.storage = 0;
            
        }

    
        public Pc(String model, String brand, String cpu, String Gpu, int rammemory, String typememory, int storage){
            

        }

}
