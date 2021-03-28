public class R {
    public int min=0;
    public int max=9;

    public R(){
        System.out.println("Call R.");
    }

    public String getRandomNumber(int min,int max){ //Input char in mystere and return String mystere
        int x;
        String mystere = "????";
        for(int i =0;i<mystere.length();i++){
            x = (int)((Math.random()*(this.max-this.min))+this.min);
            mystere = Str.replaceIntAt(mystere,i,x);
        }
        return mystere;
    }

    public String returnNumber(String x,String nbMystere){
        if (Integer.parseInt(x)>Integer.parseInt(nbMystere)) {
            System.out.println("Le nombre mystère et infèrieur à :"+x);
        }
        if(Integer.parseInt(x)>Integer.parseInt(nbMystere)){
            System.out.println("Le nombre mysrère et supérieur à :"+x);
        }
        return "Yala";
    }

}
