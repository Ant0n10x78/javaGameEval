import java.util.Scanner;

public class Game {
    public int tentative;
    public int v =0;
    public Scanner scan = new Scanner(System.in);

    public Game(){ //constructeur
        this.tentative = 10;
    }

    public String input() {
        String str = this.scan.next();
        while (true){
            try {
                Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("Vous n'avez pas saisie des chiffres !Essayer de nouveau :");
                str = this.scan.next();
            }
        }
        while(str.length()!=4 ){
            System.out.println("Vous n'avez pas saisie le bon nombre de chiffre ,essayer de nouveau :\n");
            str = this.scan.next();
        }
        return str;
    }

    public String inputMenu(){
        String str = this.scan.next();
        return str;
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
                this.tentative = -1;
            }
        return rstr;
        }

    public Boolean endgame(){ //Annonce la fin de la partie
        if (this.tentative == 0) {
            System.out.println("Vous avez perdu ... \n Rejouez donc une partie ! ");
            return true;
        }
        else if(this.tentative == -1){
            System.out.println("Vous avez gagné!!! \nFélicitation !!!!! \n Rejouez donc une partie ! \n\n");
            return true;
        }
        return false;
    }
    public static void title(){
        System.out.println("███╗░░██╗░█████╗░███╗░░░███╗██████╗░██████╗░███████╗  ███╗░░░███╗██╗░░░██╗░██████╗████████╗███████╗██████╗░███████╗");
        System.out.println("████╗░██║██╔══██╗████╗░████║██╔══██╗██╔══██╗██╔════╝  ████╗░████║╚██╗░██╔╝██╔════╝╚══██╔══╝██╔════╝██╔══██╗██╔════╝");
        System.out.println("██╔██╗██║██║░░██║██╔████╔██║██████╦╝██████╔╝█████╗░░  ██╔████╔██║░╚████╔╝░╚█████╗░░░░██║░░░█████╗░░██████╔╝█████╗░░");
        System.out.println("██║╚████║██║░░██║██║╚██╔╝██║██╔══██╗██╔══██╗██╔══╝░░  ██║╚██╔╝██║░░╚██╔╝░░░╚═══██╗░░░██║░░░██╔══╝░░██╔══██╗██╔══╝░░");
        System.out.println("██║░╚███║╚█████╔╝██║░╚═╝░██║██████╦╝██║░░██║███████╗  ██║░╚═╝░██║░░░██║░░░██████╔╝░░░██║░░░███████╗██║░░██║███████╗");
        System.out.println("╚═╝░░╚══╝░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═╝░░╚═╝╚══════╝  ╚═╝░░░░░╚═╝░░░╚═╝░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚═╝╚══════╝\n");
    }
}
