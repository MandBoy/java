
public class Kap4Ex18{

    public static void main(String[] args){

        String streng = " hej med dig du er sej ";
        System.out.println(wordCount(streng)); //returnere 6.

    }
    public static int wordCount(String str){
        str = str.trim();
        String[] strrr = str.split(" ");
        return strrr.length;

    }

}
