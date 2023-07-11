package NoticeMe;

class Decipherer {

    public static void main(String[] args) {
        String message = decipherer("0@sn9sirppa@#?ia'jgtvryko1");
        System.out.println(message);

    }

    public static String decipherer(String message) {
        String messageDecode = "";
        int length = message.length() / 2;
        messageDecode = messageDecode.substring(5, length + 5);
        messageDecode.replace('@', ' ');
        messageDecode.replace('#', ' ');
        messageDecode.replace('?', ' ');
        new StringBuilder(messageDecode).reverse().toString();
        // for(int i = 0; i < messageDecode.length(); i++) {
        // if((messageDecode.charAt(i)=='@') || (messageDecode.charAt(i)=='#') ||
        // (messageDecode.charAt(i)=='?')){
        // messageDecode.charAt(i) = ' ';
        // }
        // }
        return messageDecode;
    }

}
