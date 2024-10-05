package spring.Expensetracking.repository;

import org.springframework.data.repository.CrudRepository;

import spring.Expensetracking.model.Category;

public interface Categoryrepository extends CrudRepository<Category, Integer>{

}
