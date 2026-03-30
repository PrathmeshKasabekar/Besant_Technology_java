package ExtraFolder;
interface choosepayopt(){
    public void pay();
}
class creditcard implements choosepayopt{
    public void pay(){
        System.out.println("pay using the creditcard");
    }
}
class debitcard implements choosepayopt{
    public void pay(){
        System.out.println("pay using the debitcard");
    }
}
class makepayment{
    static void payment(choosepayopt P){
        P.pay();
    }
}
public class polymorphism {
    public static void main(String[] args) {
        choosepayopt c = new debitcard();
        choosepayopt d = new creditcard();
        makepayment.payment(c);
    }
    
}