package fxml_lektion_1;

/**
 *
 * @author Noob
 */
public class AtbashCipher extends AbstractCipher {

    @Override
    public String encrypt(String original) {
        
        return code(original);
    }

    @Override
    public String decrypt(String encrypted) {
        
        return code(encrypted);
    }
    private String code(String massage){
        String encryptetMasege = "";
        char[] charMassage = massage.toCharArray();
        for (int i = 0; i < charMassage.length; i++) {
            int charIndex = findCharIndex(charMassage[i]);
            if (charIndex != -1) {
                encryptetMasege += ALPHABETH[ALPHABETH.length - charIndex - 1];
            } else {
                encryptetMasege += charMassage[i];
            }
        }
        return encryptetMasege;
    }

}
