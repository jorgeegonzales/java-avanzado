package patterns.design.patterns.behaviors;

import java.util.ArrayList;

public class AppIterator {
    public static void main(String[] args) {
        Profile profile1 = new Profile(1,"jorge","jorgee@gmail.com");
        Profile profile2 = new Profile(2,"jose","jose@gmail.com");
        Profile profile3 = new Profile(3,"lionel","lionel@gmail.com");
        Profile profile4 = new Profile(4,"william","william@gmail.com");

        ProfileIterator profileIterator = new ProfileIterator(new ArrayList<>());
        profileIterator.saveProfile(profile1);
        profileIterator.saveProfile(profile2);
        profileIterator.saveProfile(profile3);
        profileIterator.saveProfile(profile4);
        System.out.println(profileIterator.getProfiles());
        while(profileIterator.hasMore()){
            Profile profile = profileIterator.getNext();
            System.out.println("perfil: " + profile.getUsername());
        }

        Facebook facebook1 = new Facebook(profile1,new ArrayList<>());

        facebook1.createFriends(profile2);
        facebook1.createFriends(profile4);
        System.out.println(facebook1.getFriends());



    }
}
