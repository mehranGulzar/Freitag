public class Main {

    public static void main(String[] args) {
        System.out.println(password("sfgbhrelkfgbsrkb.alam"));
    }


    public static boolean password(String pass){
        boolean erg;

        if(pass.length() >= 18  && pass.contains(".") ){
            erg = true;
        }else{ erg = false;}

        return erg;
    }
}
