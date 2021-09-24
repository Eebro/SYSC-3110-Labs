//edit made in github editor

import java.util.ArrayList;

public class AddressBook {

    public ArrayList<BuddyInfo> myBuddies;

    public AddressBook(ArrayList<BuddyInfo> myBuddies) {
        this.myBuddies = myBuddies;
    }

    public AddressBook() {
        myBuddies = new ArrayList<BuddyInfo>();
    }


    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }
    public void removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()){
            myBuddies.remove(index);
        }
    }


    public static void main(String[] args) {
        System.out.println("Address book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }


}
