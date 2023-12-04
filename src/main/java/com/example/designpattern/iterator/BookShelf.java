package com.example.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    private List<Book> bookList = new ArrayList<>();
    private int idx;

    public  BookShelf (List<Book> bookList) {
        this.idx = 0;
        this.bookList = bookList;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
