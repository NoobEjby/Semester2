package fxml_lektion_1;

/**
 *
 * @author Noob
 */
public class CeasarCipher extends AbstractCipher {

    private final int rotFactor;

    public CeasarCipher(int rot) {
        if (rot > ALPHABETH.length) {
            rot = ALPHABETH.length - 1;
        }
        if (rot < 0) {
            rot = 0;
        }
        rotFactor = rot;
    }

    @Override
    public String encrypt(String original) {
        String encryptetMasege = "";
        char[] charMassage = original.toCharArray();
        for (int i = 0; i < charMassage.length; i++) {
            int charIndex = findCharIndex(charMassage[i]);
            if (charIndex != -1) {
                int newIndex = charIndex + rotFactor;
                if (newIndex >= ALPHABETH.length) {
                    charIndex = newIndex - ALPHABETH.length;
                } else {
                    charIndex += rotFactor;
                }
                encryptetMasege += ALPHABETH[charIndex];
            } else {
                encryptetMasege += charMassage[i];
            }
        }
        return encryptetMasege;
    }

    @Override
    public String decrypt(String encrypted
    ) {
        String encryptetMasege = "";
        char[] charMassage = encrypted.toCharArray();
        for (int i = 0; i < charMassage.length; i++) {
            int charIndex = findCharIndex(charMassage[i]);
            if (charIndex != -1) {
                int newIndex = charIndex - rotFactor;
                if (newIndex < 0) {
                    charIndex = newIndex + ALPHABETH.length;
                } else {
                    charIndex -= rotFactor;
                }
                encryptetMasege += ALPHABETH[charIndex];
            } else {
                encryptetMasege += charMassage[i];
            }
        }
        return encryptetMasege;
    }

}
