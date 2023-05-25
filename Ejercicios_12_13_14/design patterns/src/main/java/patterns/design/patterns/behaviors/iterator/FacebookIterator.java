package patterns.design.patterns.behaviors.iterator;

import java.util.ArrayList;
import java.util.Objects;

public class FacebookIterator implements Iterator {


    private Facebook facebook;


    private Integer currentPosition = 0 ;

    private ArrayList<Facebook> facebooks;



    public FacebookIterator(ArrayList<Facebook> facebooks) {
        this.facebooks = facebooks;
    }

    public  void saveFacebook(Facebook facebook){
        facebooks.add(facebook);
    }
    @Override
    public Profile getNext() {
        Facebook facebook = facebooks.get(currentPosition);
        currentPosition++;
        return facebook.getProfile();
    }

    public Facebook getNext(Profile profile){
        ArrayList<Facebook> facebookList =this.getFacebooks();
        for (Facebook value : facebookList) {
            if (Objects.equals(profile.getUsername(), value.getProfile().getUsername())) {
                facebook = value;
            }
        }
        return facebook;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < facebooks.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public ArrayList<Facebook> getFacebooks() {
        return facebooks;
    }

    public void setFacebooks(ArrayList<Facebook> facebooks) {
        this.facebooks = facebooks;
    }
}
