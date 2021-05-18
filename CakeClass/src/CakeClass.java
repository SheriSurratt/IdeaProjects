public class CakeClass {
    private static final int Max_numOfCakes = 10;
    private static final int Min_numOfCake =1;

    private String cakeDesign;
    private String flavor;

    public CakeClass(){
        cakeDesign = "wedding";
        flavor =  "vanilla";
       int numOfCakes = 1;
    }
    public <cakeDesign> CakeClass (String flavor, cakeDesign, int numOfCakes){
        this.cakeDesign = cakeDesign;
        this.flavor = flavor;
        this.numOfCakes = numOfCakes;

    }
    public String getCakeDesign(){return cakeDesign;}
    public String getFlavor(){return flavor;}
    public int getNumOfCakes(){ return numOfCakes;}

    public void setCakeDesign(String cakeDesign){this.cakeDesign = cakeDesign;}
    public void setFlavor(String flavor){this.flavor = flavor;}
    public void setNumOfCakes(String numOfCakes){int numOfCakes){
    if (Min_numOfCakes >=1 && numOfCakes<= Max_numOfCakes) {
        if (Min_numOfCake >= 1 && getNumOfCakes <= Max_numOfCakes) {
            this.getNumOfCakes = getNumOfCakes;

        }else  {
            this.getNumOfCakes = 1;
        }
    }
        public void start(){System.out.println("Cake Has been ordered!");}
        public void start(){System.out.println();{"Your cake is in preparation!");}

    }

    }


}
