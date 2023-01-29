package io.oops.friend;

public class friend {
    public static int numofFriends;
    String name;
    static {
        numofFriends = 0;
    }

    public friend(String name) {
        this.name = name;
        ++numofFriends;
    }
    public static void displayFriends() {
        System.out.printf("you have %d number of friends!\n", numofFriends);
    }
}
