package patterns.design.patterns.behaviors.iterator;

import java.util.ArrayList;

public class Facebook extends Profile {

    private Profile profile;
    private ArrayList<Profile> friends;

    public Facebook() {
    }

    public Facebook(Profile profile, ArrayList<Profile> friends) {
        this.profile = profile;
        this.friends = friends;
    }

    public Facebook(Integer id, String username, String email, Profile profile, ArrayList<Profile> friends) {
        super(id, username, email);
        this.profile = profile;
        this.friends = friends;
    }

    public  void createFriends(Profile profile){
        friends.add(profile);
    }
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Profile> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Profile> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "profile=" + profile +
                ", friends=" + friends +
                '}';
    }
}
