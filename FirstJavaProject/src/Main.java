public class Main {
    public static void main(String[] args) {
        ContactManager myContactManager = new ContactManager();
        Contact friendLily = new Contact();
        friendLily.phoneNumber = "312";
        friendLily.email = "@gmail";
        friendLily.name = "Lily";
        myContactManager.addContact(friendLily);
        Contact result = myContactManager.searchContact("Lily");
        System.out.println(result.phoneNumber);
    }
}