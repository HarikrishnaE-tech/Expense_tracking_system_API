package spring.Expensetracking.repository;

import org.springframework.data.repository.CrudRepository;

import spring.Expensetracking.model.User;

public interface Userrepository extends CrudRepository<User, Integer> {

}
