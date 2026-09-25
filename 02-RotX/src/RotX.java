public class RotX {
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
    
     private static char desplacaLletra(char lletra, int desplacament) {

        
        for (int i = 0; i < majuscules.length; i++) {

            if (lletra == majuscules[i]) {

                int novaPosicio = (i + desplacament) % majuscules.length;

                if (novaPosicio < 0) {
                    novaPosicio += majuscules.length;
                }

                return majuscules[novaPosicio];
            }
        }
        for (int i = 0; i < minuscules.length; i++) {

            if (lletra == minuscules[i]) {

                int novaPosicio = (i + desplacament) % minuscules.length;

                if (novaPosicio < 0) {
                    novaPosicio += minuscules.length;
                }

                return minuscules[novaPosicio];
            }
        }
           return lletra;
    }

    public static String xifraRotX(String cadena, int desplacament) {

        char[] resultat = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {

            resultat[i] =
                desplacaLletra(cadena.charAt(i), desplacament);
        }

        return new String(resultat);
    }

    public static String desxifraRotX(String cadena, int desplacament) {

        return xifraRotX(cadena, -desplacament);
    }

    public static void forcaBrutaRotX(String cadenaXifrada) {

        System.out.println("Missatge xifrat: " + cadenaXifrada);
        System.out.println("----------------");

        for (int desplacament = 0;
             desplacament < majuscules.length;
             desplacament++) {

            System.out.println(
                "(" + desplacament + ")->" +
                desxifraRotX(cadenaXifrada, desplacament)
            );
        }
    }

    public static void main(String[] args) {

        int[] desplacaments = {0, 2, 4, 6};

        String[] missatges = {
            "ABC",
            "XYZ",
            "Hola, Mr. calçot",
            "Perdó, per tu què és?"
        };

        String[] xifrats = new String[missatges.length];


        System.out.println("Xifrat");
        System.out.println("------");

        for (int i = 0; i < missatges.length; i++) {

            xifrats[i] =
                xifraRotX(missatges[i], desplacaments[i]);

            System.out.printf(
                "(%d)-%-22s => %s%n",
                desplacaments[i],
                missatges[i],
                xifrats[i]
            );
        }


        System.out.println("\nDesxifrat");
        System.out.println("---------");

        for (int i = 0; i < missatges.length; i++) {

            System.out.printf(
                "(%d)%-22s => %s%n",
                desplacaments[i],
                xifrats[i],
                desxifraRotX(
                    xifrats[i],
                    desplacaments[i]
                )
            );
        }


        System.out.println();

        forcaBrutaRotX(xifrats[3]);
    }
}
