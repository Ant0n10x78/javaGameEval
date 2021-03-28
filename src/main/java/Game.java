import java.util.Scanner;

public class Game {
    public int tentative;
    public int v =0;

    public Game(){ //constructeur
        System.out.println("Call Game");
        this.tentative = 10;
    }

    public String tentative(){//Annonce Victoire ou defaite /tentative restante
        if(this.tentative>0){
            this.tentative-=1;
            return "|Tentative(s) restante(s) :"+this.tentative+"|";
        }
        return "null";
    }

    public String returnValue(String nbStr,String x){ //Retourne si le nombre est =,> ou <
        String rstr = "????";
            for(int i =0;i<4;i++){
                if(nbStr.charAt(i) == x.charAt(i)){
                    rstr = Str.replaceCharAt(rstr,i,'=');
                }
                else if(nbStr.charAt(i) < x.charAt(i)){
                    rstr = Str.replaceCharAt(rstr,i,'+');
                }
                else {
                    rstr = Str.replaceCharAt(rstr,i,'-');
                }
                }
            if(Integer.parseInt(nbStr)==Integer.parseInt(x)){
                this.tentative = 0;
            }
        return rstr;
        }


}
