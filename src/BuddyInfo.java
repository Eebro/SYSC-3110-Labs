//Ibrahim Almalki
//sept 23, 2021
//test

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Homer";
        this.address = "1st Street";
        this.phoneNumber = "1800-267-2001";
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println("Hello " + buddy.getName());
    }
}
