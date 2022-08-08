public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap = new Hesap("gorkemyelken","test",5000);

        atm.calis(hesap);
        System.out.println("Program Çıkılıyor... Güle Güle.");
    }
}