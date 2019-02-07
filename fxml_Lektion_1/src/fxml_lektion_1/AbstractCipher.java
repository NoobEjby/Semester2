package fxml_lektion_1;

/**
 *
 * @author Noob
 */
public abstract class AbstractCipher implements ancient_encryption.CipherInterface {

    protected int findCharIndex(char ch) {
        for (int i = 0; i < ALPHABETH.length; i++) {
            if (ALPHABETH[i] == ch) {
                return i;
            }
        }
        return -1;

    }
}


