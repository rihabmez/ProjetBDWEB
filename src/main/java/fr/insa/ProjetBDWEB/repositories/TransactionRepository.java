package fr.insa.ProjetBDWEB.repositories;

import fr.insa.ProjetBDWEB.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    public Transaction findByIdTransaction(Integer idTransaction);

}