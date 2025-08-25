package repository;

import repository.Transaction;
import java.util.*;

public class ImplemencaodeDados implements TransactionRepository {

    public void save(Transaction transaction) {
        System.out.println("Salvando transação no banco: " + transaction.getDescription());
    }

    public void delete(String id) {
        System.out.println("Deletando transação ID: " + id);
    }

    public Transaction findById(String id) {
        System.out.println("Buscando transação ID: " + id);
        return null;
    }

    public List<Transaction> findAll() {
        System.out.println("Buscando todas transações no banco");
        return new ArrayList<>();
    }
}
