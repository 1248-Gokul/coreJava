package com.chainsys.ClassesMethods;
/**
 * 
 * @author goku3159
 *
 */
public class Book {
	
        private final String bookName;
        private int yearOfRelease;
        private String authorName;
        private String Story;
        private String placeOfRelease;
        public Book(String str) {
                this.bookName=str;
        }
        public String getBookName() {
                return bookName;
        }
        public int getYearOfRelease() {
                return yearOfRelease;
        }
        public void setYearOfRelease(int yearOfRelease) {
                this.yearOfRelease = yearOfRelease;
        }
        public String getAuthorName() {
                return authorName;
        }
        public void setAuthorName1(String authorName) {
                this.authorName = authorName;
        }
        public String getStory() {
                return Story;
        }
        public void setStory(String story) {
                Story = story;
        }
        public String getPlaceOfRelease() {
                return placeOfRelease;
        }
        public void setPlaceOfRelease(String placeOfRelease) {
                this.placeOfRelease = placeOfRelease;
        }



}


