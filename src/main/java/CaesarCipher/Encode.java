package CaesarCipher;

public class Encode {
    private String mText;
    private int mShift;

    public Encode(String text, int key) {
        this.mText = text;
        this.mShift = key;
    }

    public String getText() {

        return mText;
    }

    public int getKey() {

        return mShift;
    }
    public String encrypt(){

        return getEncrypt(this.mText, this.mShift);
    }
    public static String getEncrypt(String mText, int mShift) {
        String cipherText = "";
        for(int i = 0; i < mText.length(); i++){
            char c = (char)(mText.charAt(i) + mShift);
            if(mText.charAt(i)  == ' '){
                cipherText += (char)(mText.charAt(i));
            }
            else if(mText.charAt(i) > 'z'){
                cipherText += (char)(mText.charAt(i)) - (26 - mShift);
            }
            else{
                cipherText += (char)(mText.charAt(i) + mShift);
            }
        }
        return cipherText;
    }
}
