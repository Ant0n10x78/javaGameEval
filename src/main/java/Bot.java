public class Bot {
    public Bot(){
        System.out.println("Call Bot.java.");
    }
    public String findNb(String solution,String mystere){
        int x;
        for(int i = 0;i<4;i++){
            if(mystere.substring(i,i+1)!="="){
                x = (int) (int)((Math.random()*(9-0))+0);
                solution=Str.replaceIntAt(mystere,i,x);;
            }
        }
        return solution;
    }
}