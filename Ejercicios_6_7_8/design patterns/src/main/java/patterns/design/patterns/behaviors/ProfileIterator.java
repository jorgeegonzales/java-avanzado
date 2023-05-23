package patterns.design.patterns.behaviors;

import java.util.ArrayList;

public class ProfileIterator implements Iterator{

    private Profile profile;

    private Integer currentPosition = -1 ;

    private ArrayList<Profile> profiles;

    public ProfileIterator(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }
    public  void saveProfile(Profile profile){
        profiles.add(profile);
    }
    @Override
    public Profile getNext() {
        if (hasMore())
            currentPosition++;
        return profiles.get(currentPosition);
    }

    @Override
    public boolean hasMore() {
        return currentPosition < profiles.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }
}
