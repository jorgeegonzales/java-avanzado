package patterns.design.patterns.behaviors.iterator;

import java.util.ArrayList;
import java.util.Objects;

public class Creator extends Profile {

    Facebook facebook;
    Profile profile;
    ProfileIterator profileIterator = new ProfileIterator(new ArrayList<>());
    FacebookIterator facebookIterator = new FacebookIterator( new ArrayList<>());

    public Integer createId(){
        return profileIterator.getProfiles().size() + 1;
    }
    public void createProfile(String username,String email){

       if(profileIterator.getProfiles() == null){
           profileIterator = new ProfileIterator(new ArrayList<>());
           profileIterator.saveProfile(new Profile(createId(),username,email));
       }

        profileIterator.saveProfile(new Profile(createId(),username,email));
        System.out.println("Perfiles de Usuario luego de la ultima creacion!: " +profileIterator.getProfiles());
    }

    public Profile findProfile(ProfileIterator profileIterator,String username){

        ArrayList<Profile> profiles = profileIterator.getProfiles();
        for (Profile value : profiles) {
            if (Objects.equals(username, value.getUsername())) {
                profile = value;
            }
        }
        return profile;
    }

    public Facebook findFacebook(FacebookIterator facebookIterator,String username){
        ArrayList<Facebook> facebookList= facebookIterator.getFacebooks();
        for (Facebook value : facebookList) {
            if (Objects.equals(username, value.getProfile().getUsername())) {
                facebook = value;
            }
        }
        return facebook;
    }



    public void createFacebook(ProfileIterator profileIterator,FacebookIterator facebookIterator,String username){

                Profile profileUser = findProfile(profileIterator,username);

                ArrayList<Profile> friends = new ArrayList<>();
                Facebook facebook = new Facebook(profileUser,friends);
                if(facebookIterator.getFacebooks()== null){
                    facebookIterator.setFacebooks(new ArrayList<>());
                    facebookIterator.saveFacebook(facebook);
                }
                facebookIterator.saveFacebook(facebook);

                System.out.println("Este es el perfil de usuario creado!: " + facebook.getProfile());
                System.out.println("Estos son los amigos del perfil de usuario creado!: " + facebook.getFriends());

            }

    public void createFriends(FacebookIterator facebookIterator,String username,String usernameFriend){

        Facebook facebookUser = findFacebook(facebookIterator,username);

        Facebook facebookFriend = findFacebook(facebookIterator,usernameFriend);
        if(facebookUser.getFriends()== null){
            facebookUser.setFriends(new ArrayList<>());
            facebookUser.createFriends(facebookFriend.getProfile());
        }

        facebookUser.createFriends(facebookFriend.getProfile());
        System.out.println("Este es el perfil de usuario de FacebookUser: " + facebookUser.getProfile());
        System.out.println("Estos son sus amigos: " + facebookUser.getFriends());



    }

    public Profile getProfile() {
        return profile;
    }

    public ProfileIterator getProfileIterator() {
        return profileIterator;
    }

    public FacebookIterator getFacebookIterator() {
        return facebookIterator;
    }

    public Facebook getFacebook() {
        return facebook;
    }
}



