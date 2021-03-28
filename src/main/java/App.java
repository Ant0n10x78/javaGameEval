import java.util.Scanner;
//erreur dans le programme si le nombre est inferieur a 4 chiffres
public class App {
    public static void main(String[] args) {
        Game.title();
        //declaration variable
        while (true) { //Loop for the menu
        String testValue,Value,menu,mystere;
        //Declaration objet
        Scanner saisieUtilisateur = new Scanner(System.in);
        R random = new R();
        Bot bot = new Bot();
        Game game = new Game();
        Str str = new Str();
        //Begin of the game
            System.out.println("MODE 1 || IA VS USER -----> TAPER 1.\nMODE 2 || USER VS IA -----> TAPER 2.\nPour quitter taper 0.");
            menu = game.inputMenu();
            if(Integer.parseInt(menu) == 0){ //exit the game / stop the programm
                System.out.println("Vous quittez le jeu.");
                break;
            }
            else if(Integer.parseInt(menu) == 1){ //Ia vs User,User define mystery number
                System.out.println("Donner un nombre à l'Ia pour qu'il devine:");
                mystere = game.input();
                while(true){
                    System.out.println("Le BOT va deviner le nombre mystere !!!");
                    bot.nb = bot.findNb(bot.reponse,bot.nb);
                    bot.reponse = game.returnValue(mystere,bot.nb);
                    System.out.println("Le bot à deviner :"+bot.nb);
                    System.out.println(game.tentative());
                    if (game.endgame()) {
                        break;
                    }
                }
            }
            else if(Integer.parseInt(menu) == 2) {
                mystere = random.getRandomNumber(0, 9);
                while (true) {
                    System.out.println("Entrez un nombre à 4 valeurs (max):\n");
                    Value = game.input();
                    System.out.println(game.tentative());
                    testValue = game.returnValue(Value, String.valueOf(mystere));
                    System.out.println(testValue);
                    if (game.endgame()) {
                        break;
                    }
                }
            }
        }
    }
}
