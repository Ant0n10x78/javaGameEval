public class Str {
    public Str(){
    }

    public static String replaceCharAt(String s,int pos,char c){ //Remplace un caractere dans un str
        return s.substring(0,pos) + c + s.substring(pos+1);
    }

    public static String replaceIntAt(String s,int pos,int c){ //Remplace un caractere dans un str
        return s.substring(0,pos) + c + s.substring(pos+1);
    }

    public Boolean verifLen(String nbStr){ // Test the length of nbStr
        if(nbStr.length()==(4)) {
            return true;
        }
        return false;
    }

    public int strToInt(String nbStr){
        System.out.println("Conversion str en int");
        int nb = 0;
        nb = Integer.parseInt(nbStr);
        return nb;
    }

}
