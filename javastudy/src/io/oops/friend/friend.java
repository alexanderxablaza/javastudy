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
}
