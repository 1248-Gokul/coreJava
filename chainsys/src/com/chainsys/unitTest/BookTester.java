package com.chainsys.unitTest;
import com.chainsys.ClassesMethods.Book;
/**
 * 
 * @author goku3159
 *
 */
public class BookTester {
        public static void BookTester1() {
                Book firstBook=new Book("2 Season");
                firstBook.setAuthorName1("sabatham");
                firstBook.setStory("action");
                firstBook.setYearOfRelease(2009);
                firstBook.setPlaceOfRelease("Delhi");
                System.out.println(firstBook.getBookName());
                System.out.println(firstBook.getAuthorName());
                System.out.println(firstBook.getStory());
                System.out.println(firstBook.getYearOfRelease());
                System.out.println(firstBook.getPlaceOfRelease());
        }

}


