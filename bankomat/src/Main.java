abstract class Bank{
    private String wyplataprzyjecie;
    private String sprawdzenieStanuKonta;
    private String potwierdzenieMozliwosciWyplaty;

    public Bank(String wyplataProsba, String wyplataprzyjecie, String sprawdzenieStanuKonta, String potwierdzenieMozliwosciWyplaty ) {

        this.wyplataprzyjecie = wyplataprzyjecie;
        this.sprawdzenieStanuKonta = sprawdzenieStanuKonta;
        this.potwierdzenieMozliwosciWyplaty = potwierdzenieMozliwosciWyplaty;
        }

    public String getWyplataprzyjecie() {
        System.out.println("info o przyjeciu prosby wyplaty");
        return wyplataprzyjecie;
    }
    public String getSprawdzenieStanuKonta() {
        System.out.println("sprawdzenie stanu konta");
        return sprawdzenieStanuKonta;
    }
    public String getPotwierdzenieMozliwosciWyplaty() {
        System.out.println("potwierdzenie mozliwosci wyplaty");
        return potwierdzenieMozliwosciWyplaty;
    }


}

class Bankomat extends Bank{

    public Bankomat(String wyplataProsba, String wyplataprzyjecie, String sprawdzenieStanuKonta, String potwierdzenieMozliwosciWyplaty) {
        super(wyplataProsba, wyplataprzyjecie, sprawdzenieStanuKonta, potwierdzenieMozliwosciWyplaty);
    }
    private String wprowadzenieKarty;
    private String prosbaOPIN;
    private String kwotaWyplaty;
    private String wyplacenieGotowki;
    private String podziekowanie;

    public String getWprowadzenieKarty(){
        System.out.println("wprowadzenie karty");
        return wprowadzenieKarty;
    }
    public String getProsbaOPIN(){
        System.out.println("prosba o PIN");
        return prosbaOPIN;
    }
    public String getKwotaWyplaty(){
        System.out.println("kwota wyplaty ");
        return kwotaWyplaty;
    }
    public String getWyplacenieGotowki(){
        System.out.println("wyplacenie gotowki");
        return wyplacenieGotowki;
    }
    public String getPodziekowanie(){
        System.out.println("podziekowanie ");
        return podziekowanie;
    }
}


public class Main {
    public static void main(String[] args) {

        Bankomat bankomat =  new Bankomat("nw", "nw", "nw", "nw");
        bankomat.getWyplataprzyjecie();
        bankomat.getSprawdzenieStanuKonta();
        bankomat.getPotwierdzenieMozliwosciWyplaty();

        bankomat.getWprowadzenieKarty();
        bankomat.getProsbaOPIN();
        bankomat.getKwotaWyplaty();
        bankomat.getWyplacenieGotowki();
        bankomat.getPodziekowanie();


    }
}