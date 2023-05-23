package patterns.design.patterns.behaviors;

import java.util.ArrayList;

public class FacebookIterator implements Iterator {


    private Facebook facebook;


    private Integer currentPosition = -1 ;

    private ArrayList<Facebook> facebooks;

    public FacebookIterator(Facebook facebook) {
        this.facebook = facebook;
    }

    public  void saveProfile(Facebook facebook){
        facebooks.add(facebook);
    }
    @Override
    public Profile getNext() {
        if (hasMore())
            currentPosition++;
        return facebooks.get(currentPosition);
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

}
