public class Bot {
    public String reponse = "????";//=,-,+
    public String nb = "????";//int -> str

    public Bot(){
        System.out.println("Call Bot.java.");
    }

    public String findNb(String solution,String mystere){ //solution --> "====" ||mystere --> "3323"
        int x;
        for(int i = 0;i<4;i++){
            System.out.println(mystere.substring(i,i+1));
            if(solution.charAt(i)!='='){
                x = (int) (int)((Math.random()*(9-0))+0);
                mystere =Str.replaceIntAt(mystere,i,x);;
            }
        }
        return mystere;
    }
}