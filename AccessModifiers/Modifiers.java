package AccessModifiers;
class Account{
    public String Name;
    protected String email;
    private String password;
public String getPassword(){
    return this.password;
}
public void setPassword(String pass){
    this.password = pass;
}
}
public class Modifiers {
    public static void main(String[] args) {
        Account Account1 = new Account();
        Account1.Name = "Prathmesh";
        System.out.println(Account1.Name);
        Account1.email = "prathmkasbekar2340@gmail.com";
        System.out.println(Account1.email);
        Account1.setPassword("abcd");
        System.out.println(Account1.getPassword());
        
    }
}