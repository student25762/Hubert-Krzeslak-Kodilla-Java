package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBook(){
        //Given
        Library library = new Library("Library no. 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(30)
                .forEach(n -> library.getBooks().add(new Book("Book no. " + n, "author", LocalDate.now())));

        Library cloneLibrary = null;
        try{
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try{
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("library 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When

        //Then
        Assert.assertEquals(30, library.getBooks().size());
        Assert.assertEquals(30, cloneLibrary.getBooks().size());
        Assert.assertEquals(30, deepCloneLibrary.getBooks().size());
    }
}
