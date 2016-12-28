public class exo5 {
    public static void main(String[] args) {
        String mot = "beweb";
        mot = mot.toLowerCase();
        int choix = 2;
        Boolean palindrome = true;
        char[] tab_mot = mot.toCharArray();

        if (choix == 1) {
            int deb_mot = 0;
            int fin_mot = mot.length()-1;
            while ( deb_mot < fin_mot & palindrome == true ) {
                tab_mot = mot.toCharArray();

                if (tab_mot[deb_mot] != tab_mot[fin_mot]) {
                    palindrome = false;
                }
                deb_mot ++;
                fin_mot --;
            }
            if (palindrome) {
                System.out.print("C'est un palindrome\n");
            } else { System.out.print("Ce n'est pas un palindrome\n"); }
        }

        if (choix == 2) {
            int nb_alpha=0;
            for (int i=0; i < tab_mot.length ; i++) {
                  String test = Character.toString(tab_mot[i]);
                if ( test.matches("^[a-z]+") ) {
                    nb_alpha++;
                }

            }
            System.out.print(nb_alpha + "\n");

        }
        if (choix == 3) {
    String remp = "z";
    String val = "w";
    for (int i=0; i < tab_mot.length; i++) {
        String lettre = Character.toString(tab_mot[i]);
        if ( lettre == val ) {
            System.out.print("test");
            String lettre2 = Character.toString(remp);
            tab_mot[i] = lettre2;
        }

    }

}
    }
}
