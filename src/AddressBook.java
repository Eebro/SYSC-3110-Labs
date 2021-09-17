import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> buddyList;

    public AddressBook(ArrayList<BuddyInfo> buddyList) {
        this.buddyList = buddyList;
    }


    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }


    public static void main(String[] args) {
        System.out.println("Address book");
    }

}