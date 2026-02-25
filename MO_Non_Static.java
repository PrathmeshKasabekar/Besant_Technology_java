public class MO_Non_Static {
//  method overloading in the static methods 
    public void whatsapp(){
        System.out.println("simple chats feature");
    }
    public  void whatsapp(int ver){
        System.out.println("version of the Whatsapp" + ver);
    }
    public void whatsapp(String features){
        System.out.println("version of the Whatsapp" + features);
    }
    public void whatsapp(String features , int ver){
        System.out.println("features is "+features+"of"+ver);
    }
    public void whatsapp( int ver, String features ){
        System.out.println("version is "+ver+"and features "+features);
    }

    public static void main(String[] args) {
        MO_Static ref = new MO_Static();
        ref.whatsapp();
        ref.whatsapp(1);
        ref.whatsapp("calls");
        ref.whatsapp("calls", 2);
        ref.whatsapp(3,"status");
    }
}
