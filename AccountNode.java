public class AccountNode{
    private String webName;
    private String userName;
    private String password;
    AccountNode next =null;

    public AccountNode(String webName,String userName,String password){
        this.webName=webName;
        this.userName=userName;

        // Password is stored in encrypted form
        this.password=AuthSecure.encrypt(password);
    }

    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

    public void setNext(AccountNode next) {
        this.next = next;
    }

    // Getters
    public String getWebName() { return webName; }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public AccountNode getNext() { return next; }

    // Show both encrypted and decrypted password
    public String toString() {
        return "Encrypted form:\nWeb-> "+webName + " |  Username-> " + userName + " | Password-> " + password+"\n" +
                "Decrypted form:\nWeb-> "+webName + " |  Username-> " + userName + " | Password-> " + AuthSecure.decrypt(password);

    }
}