package rowColumn;

public class Driver {

    public static void main(String[] args) {

        rowColumnEncrytion Bitt = new rowColumnEncrytion();
        String test= Bitt.encrypt("Welcome to the club",6);
       String testB= Bitt.decrypt(test,6);
        System.out.println(test);
        System.out.println(testB);
    }
}
