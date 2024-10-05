package spring.Expensetracking.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.Expensetracking.model.Expense;

@Repository
public interface Expenserepository extends CrudRepository<Expense, Integer> {

}
