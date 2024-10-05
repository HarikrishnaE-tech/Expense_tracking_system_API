package spring.Expensetracking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.Expensetracking.model.Budget;

@Repository
public interface Budgetrepository extends CrudRepository<Budget, Integer> {

}
