public class Non_Static_MO {
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
        Static_MO ref = new Static_MO();
        ref.whatsapp();
        ref.whatsapp(1);
        ref.whatsapp("calls");
        ref.whatsapp("calls", 2);
        ref.whatsapp(3,"status");
    }
}
