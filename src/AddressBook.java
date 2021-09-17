import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> buddyList;

    public AddressBook(ArrayList<BuddyInfo> buddyList) {
        this.buddyList = buddyList;
    }

    public AddressBook() {
        buddyList = new ArrayList<BuddyInfo>();
    }


    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyList.remove(buddy);
    }


    public static void main(String[] args) {
        System.out.println("Address book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }


}