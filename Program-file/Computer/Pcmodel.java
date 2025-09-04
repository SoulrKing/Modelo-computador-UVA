public class Pcmodel {
    

    // Attributes 
    private String model; // ex "acer"
    private String brand; // ex "nitro"
    private String cpu; // ex "Ryzen 5 5500X3D"
    private String gpu; // ex "RTX4060TI"
    private int rammemory; // ex "16GB"
    private String typememory; // ex "DDR5"
    private int storage; // ex ""926"
    private String psu; // ex ""750W"



    
        // Default contructor 
        public Pcmodel(){
            //Each type is reciving a void parameter (without declaring it).
            this.model = ""; 
            this.brand = "";
            this.cpu = "";
            this.gpu = "";
            this.rammemory = 0;
            this.typememory = "";
            this.storage = 0;
            this.psu = "";
            
        }

    
            public Pcmodel(String model, String brand, String cpu, String gpu, int rammemory, String typememory, int storage, String psu){
                
                // recive the parameters and atriubuate value to them
                this.model = model;
                this.brand = brand;
                this.cpu = cpu;
                this.gpu = gpu;
                this.rammemory = rammemory;
                this.typememory = typememory;
                this.storage = storage;
                this.psu = psu;
            }

            public String getmodel(){ return model;}
            public void setmodel(String model) {this.model = model;}

            public String getbrand(){return brand;}
            public void setbrand(String brand) {this.brand = brand;}

            public String getcpu(){return cpu;}
            public void setcpu(String cpu) {this.cpu = cpu;}

            public String getgpu(){return gpu;}
            public void setgpu(String gpu) {this.gpu = gpu;}

            public int getrammemory(){return rammemory;}
            public void setrammemory(int rammemory) {this.rammemory = rammemory;}

            public String gettypememory(){return typememory;}
            public void settypememory(String typememory) {this.typememory = typememory;}

            public int getstorage(){return storage;}
            public void setstorage(int storage) {this.storage = storage;}

            public String getpsu(){return psu;}
            public void setpsu(String psu) {this.psu = psu;}

                public void print1(){
                    System.out.println("Pc specifications!");
                    System.out.println("Model :"+model);
                    System.out.println("Brand :"+brand);
                    System.out.println("CPU :"+cpu);
                    System.out.println("GPU :"+gpu);
                    System.out.println("Quantity of mememory RAM  :"+rammemory);
                    System.out.println("Type of memory RAM :"+typememory);
                    System.out.println("Quantity of Storage :"+storage);
                    System.out.println("Power Suply :"+psu);

                }
}


