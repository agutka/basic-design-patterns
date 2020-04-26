package libraryExample;

import libraryExample.api.*;

public class Main {

    public static void main(String[] args) {

//        LibraryAPI api = new LibraryAPIImpl();
//        User user = new User("Paweł","Cwik","32131212");
//        BookConnector connector = new BookConnector(user,api);
//        connector.checkAvailable("Harry Potter i Zakon Feniksa");

        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(user, libraryAPIv2);
        BookConnector connector = new BookConnector(user,apiAdapter);
        System.out.println(connector.checkAvailable("Harry Potter i Zakon Feniksa"));

    }
}
