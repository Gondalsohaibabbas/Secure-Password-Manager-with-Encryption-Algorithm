import java.util.Scanner;

class hashing {

    // Generates index for storing and searching records
    public static int hashFunction(String name){
        int hash =0;

        for(int i=0; i<name.length();i++){
            hash+=(int) name.charAt(i)+(i+1);
        }

        return hash%100;
    }
}

public class Hash{
    int size= 100;
    AccountNode[] table = new AccountNode[size];

    // Insert new account into hash table
    public void insert(String name,String userName,String pass){
        AccountNode newNode = new AccountNode(name,userName,pass);

        int index= hashing.hashFunction(name);

        if(table[index]==null){
            table[index]=newNode;
            System.out.println("Inserted Successfully!");
        }
        else{
            // Collision handling using linked list chaining
            AccountNode current = table[index];

            while(current.next!=null){
                current= current.next;
            }

            current.next= newNode;
            System.out.println("Inserted Successfully!");
        }
    }

    // Search account using website name
    public String search(String name){
        int index= hashing.hashFunction(name);
        AccountNode current = table[index];

        while(current!=null){
            if(current.getWebName().equals(name)){
                return current.toString();
            }

            current=current.next;
        }

        return "Account not found!";
    }

    // Delete account from hash table
    public void delete(String name){
        int index= hashing.hashFunction(name);
        AccountNode current = table[index];
        AccountNode temp = table[index];
        AccountNode pre = null;

        if(table[index]==null){
            System.out.println("Account not found!");
        }

        if(temp.getWebName().equals(name)){
            table[index] = temp.getNext();
            System.out.println("Deleted successfully!");
            return;
        }

        while(temp!=null){
            if(temp.getWebName().equals(name)){
                assert pre != null;
                pre.setNext(temp.getNext());
                System.out.println("Deleted successfully!");
                return;
            }

            pre= temp;
            temp=temp.getNext();
        }

        System.out.println("Account not found!");
    }

    // Update password of an existing account
    public void update(String name){
        Scanner input = new Scanner(System.in);
        int index = hashing.hashFunction(name);
        AccountNode current = table[index];

        while(current != null){
            if(name.equals(current.getWebName())){
                System.out.println("Enter new Password:");
                String pass = input.nextLine();

                pass = AuthSecure.encrypt(pass);
                current.setPassword(pass);

                System.out.println("Password Updated");
                return;
            }

            current = current.getNext();
        }

        System.out.println("Website not found");
    }

    // Display all records in alphabetical order using BST
    public void displaySorted(){

        BST bst = new BST();

        for(int i=0;i<size;i++){

            AccountNode current = table[i];

            while(current!=null){

                bst.root = bst.insert(bst.root,current);

                current = current.getNext();
            }
        }

        bst.inOrder(bst.root);
    }
}