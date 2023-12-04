package com.example.designpattern.iterator;

public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int idx;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        if(idx < bookShelf.getBookList().size()) return true;
        return false;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookList().get(idx);
        idx++;
        return book;

    }
}
