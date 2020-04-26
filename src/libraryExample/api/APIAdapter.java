package libraryExample.api;

import libraryExample.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private final User user;
    private final LibraryAPIv2 libraryAPIv2;

    public APIAdapter(User user, LibraryAPIv2 libraryAPIv2) {
        this.user = user;
        this.libraryAPIv2 = libraryAPIv2;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return libraryAPIv2.numberOfCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle,user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
