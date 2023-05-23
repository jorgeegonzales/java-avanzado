package patterns.design.patterns.behaviors.iterator;

/**
 * Iterator es un patrón de diseño de comportamiento que te permite recorrer elementos de una colección
 * sin exponer su representación subyacente.
 */
public class AppIterator {
    public static void main(String[] args) {

        // CREANDO LOS PERFILES DE FACEBOOK
        System.out.println("CREANDO LOS PERFILES DE FACEBOOK");
        Creator creator = new Creator();
        creator.createProfile("jorge","jorgee@gmail.com");
        creator.createProfile("jose","jose@gmail.com");
        creator.createProfile("lionel","lionel@gmail.com");
        creator.createProfile("william","william@gmail.com");

        creator.createFacebook(creator.getProfileIterator(),creator.getFacebookIterator(),"jorge");
        creator.createFacebook(creator.getProfileIterator(),creator.getFacebookIterator(),"lionel");
        creator.createFacebook(creator.getProfileIterator(),creator.getFacebookIterator(),"jose");
        creator.createFacebook(creator.getProfileIterator(),creator.getFacebookIterator(),"william");


        creator.createFriends(creator.getFacebookIterator(),"jorge","lionel");
        creator.createFriends(creator.getFacebookIterator(),"jorge","jose");
        creator.createFriends(creator.getFacebookIterator(),"jorge","william");

        creator.createFriends(creator.getFacebookIterator(),"lionel","jorge");
        creator.createFriends(creator.getFacebookIterator(),"lionel","jose");
        creator.createFriends(creator.getFacebookIterator(),"lionel","william");

        creator.createFriends(creator.getFacebookIterator(),"jose","lionel");
        creator.createFriends(creator.getFacebookIterator(),"jose","jorge");
        creator.createFriends(creator.getFacebookIterator(),"jose","william");

        creator.createFriends(creator.getFacebookIterator(),"william","lionel");
        creator.createFriends(creator.getFacebookIterator(),"william","jorge");
        creator.createFriends(creator.getFacebookIterator(),"william","jose");

        // REALIZANDO LA ITERACION A TRAVES DE LOS PERFILES
        System.out.println("REALIZANDO LA ITERACION A TRAVES DE LOS PERFILES");
        ProfileIterator profileIterator = creator.getProfileIterator();

        while(profileIterator.hasMore()){
            Profile profile = profileIterator.getNext();
            System.out.println("Perfil de usuario!: " + profile);
        }

        // REALIZANDO LA ITERACION A TRAVES DE LOS FACEBOOKS
        System.out.println("REALIZANDO LA ITERACION A TRAVES DE LOS FACEBOOKS");
        FacebookIterator facebookIterator = creator.getFacebookIterator();

        while(facebookIterator.hasMore()){
            Profile profile = facebookIterator.getNext();
            Facebook facebook = facebookIterator.getNext(profile);
            System.out.println("Facebook de usuario!: " + facebook);
        }

    }
}
