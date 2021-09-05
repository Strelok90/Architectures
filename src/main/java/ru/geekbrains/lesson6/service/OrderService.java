package ru.geekbrains.lesson6.service;

import ru.geekbrains.lesson6.document.Document;
import ru.geekbrains.lesson6.factories.Manager;
import ru.geekbrains.lesson6.factories.ServiceManager;

import java.util.List;

public interface OrderService {
        Document getOrderById(Long id);
        ServiceManager GetServiceManagerByDocument(int id);
        List<Document> getOrderByManager(Manager manager);
}
