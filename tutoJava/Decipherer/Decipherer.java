package Decipherer;

public class Decipherer {
    public static String decipherer(String message) {
        String messageDecode = "";
        int lengthMessage = message.length() / 2;

        messageDecode = message.substring(5, lengthMessage + 5);
        messageDecode = messageDecode.replace('@', ' ');
        messageDecode = messageDecode.replace('#', ' ');
        messageDecode = messageDecode.replace('?', ' ');
        messageDecode = new StringBuilder(messageDecode).reverse().toString();
        return messageDecode;
    }

    public static void main(String[] args) {
        String message = decipherer("0@sn9sirppa@#?ia'jgtvryko1");
        System.out.println(message);
        message = decipherer("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj");
        System.out.println(message);
        message = decipherer("aopi?sedohtém@#?sedhtmg+p9l!");
        System.out.println(message);
    }
}