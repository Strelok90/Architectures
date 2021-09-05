package ru.geekbrains.lesson6.document.impl;

import ru.geekbrains.lesson6.document.Document;

public class OtherDocumentImpl implements Document {
    @Override
    public Document copy() {
        return new OtherDocumentImpl();
    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }
}
