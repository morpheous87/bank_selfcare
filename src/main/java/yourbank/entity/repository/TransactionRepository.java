package yourbank.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yourbank.entity.Transaction;

/**
 * Created by Mario on 19.12.2016 г..
 */

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
}
