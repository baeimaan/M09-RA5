public class Rot13 {
    
    static char[] majuscules = {
         'A','Á','À','B','C','Ç','D','E','É','È','F','G','H','I','Í','Ì','Ï',
        'J','K','L','M','N','Ñ','O','Ó','Ò','P','Q','R','S','T','U','Ú','Ù',
        'Ü','V','W','X','Y','Z'
    };

    static char[] minuscules = {
        'a','á','à','b','c','ç','d','e','é','è','f','g','h','i','í','ì','ï',
        'j','k','l','m','n','ñ','o','ó','ò','p','q','r','s','t','u','ú','ù',
        'ü','v','w','x','y','z'
    };
    public static String xifraRot13(String cadena) {
        return cadena;
    }

    public static String desxifraRot13(String cadena) {
        return cadena; 
    }

    public static void main(String[] args) {
        String msgs[] = {"ABC","XYZ","Hola, Mr. calçot","Perdó, per tu què és?"};
        String msgsXifrats[] = new String[msgs.length];

        System.out.println("\nXifrat\n---------");
        for (int i = 0; i < msgs.length; i++) {
            msgsXifrats[i] = xifraRot13(msgs[i]);
            System.out.printf("%-23s => %s%n", msgs[i], msgsXifrats[i]);
        }

        System.out.println("\nDesxifrat\n---------");
        for (String msg : msgsXifrats) {
            System.out.printf("%-23s => %s%n", msg, desxifraRot13(msg));
        }
    }
}

