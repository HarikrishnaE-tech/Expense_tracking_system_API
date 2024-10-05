package spring.Expensetracking.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import spring.Expensetracking.model.Budget;
import spring.Expensetracking.model.BudgetDTO;
import spring.Expensetracking.model.Category;
import spring.Expensetracking.model.Expense;
import spring.Expensetracking.model.ExpenseDTO;
import spring.Expensetracking.model.User;
import spring.Expensetracking.repository.Budgetrepository;
import spring.Expensetracking.repository.Categoryrepository;
import spring.Expensetracking.repository.Expenserepository;
import spring.Expensetracking.repository.Userrepository;
import spring.Expensetracking.responsestructure.Expensestructure;
import spring.Expensetracking.responsestructure.Userresponsestructure;

@Service
public class Expenseservice {
	@Autowired
	Expenserepository erepo;
	@Autowired
	Userrepository urepo;
	@Autowired
	Categoryrepository crepo;
 
	@Autowired
	Budgetrepository budrepo;
	
	
	public String newexpense(ExpenseDTO expenseto) {
		Optional<User> usert = urepo.findById(expenseto.getUserid());
		Optional<Category> categoryt = crepo.findById(expenseto.getCateid());
		
		User user=usert.get();
		Category category = categoryt.get();
		
		Expense exp=new Expense();
		exp.setUser(user);
		exp.setCategory(category);
		exp.setAmount(expenseto.getAmount());
		exp.setDate(expenseto.getDate());
		exp.setDescription(expenseto.getDescription());
	
		erepo.save(exp);
		String message="the expense is registerd";
		
		
		
		return message;
		
	}
	
	public String useregister(User user) {
		urepo.save(user);
		String message="the user register successfully";
		return message;
		
	}
	
	public String categoryreg(Category category) {
		crepo.save(category);
		String message="category is registered";
		return message;
		
	}
	
	public String Budgetreg(BudgetDTO budgetdto) {
		Optional<User> userto = urepo.findById(budgetdto.getUserid());
		
		User user=userto.get();
		Budget budget=new Budget();
		budget.setUser(user);
		budget.setBudgamount(budgetdto.getBudgamount());
		budget.setMonthlybudget(budgetdto.getMonthlybudget());
		budrepo.save(budget);
		String message="Budget is registered";
		return message;
		
	}
	
	
	
	public ResponseEntity<Userresponsestructure<List<Expense>>> singleuserdetail(int userid) {

	    Optional<User> user = urepo.findById(userid);
	    Userresponsestructure<List<Expense>> resp = new Userresponsestructure<>();
	    if (user.isPresent()) {
	        User user2 = user.get();

	        // Set the response structure details
	        resp.setStatus(HttpStatus.OK.value());
	        resp.setMessage("The user details are recovered.");
	        
	        
	        resp.setData( user2.getExpense());
	        
	        
	        Budget budge=user2.getBudget();
	       Double amount= budge.getBudgamount();
            resp.setBudgamount(amount);
	        
	        
	        return new ResponseEntity<>(resp, HttpStatus.OK);
	    } else {
	        // Handle the case where user is not found
	        resp.setStatus(HttpStatus.NOT_FOUND.value());
	        resp.setMessage("User not found.");
	        
	        // Return a response entity with NOT_FOUND status
	        return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
	    }
	}

	
	
	public ResponseEntity<Expensestructure<Double>> tot_exp_month( int userid) {
		
		Optional<User> use = urepo.findById(userid);
		
		double totamt=0;
	
		
		if(use.isPresent()) {
			User user=use.get();
			Budget budget = user.getBudget();
			Double budgamount = budget.getBudgamount();
			
			
			
			List<Expense> expense = user.getExpense();
		
			
			Expensestructure exprepo=new Expensestructure();
			for(Expense expp:expense) {
				totamt += expp.getAmount();
				
			}
			
			exprepo.setStatus(HttpStatus.OK);
			exprepo.setMessage("the expense tottal is found");
			exprepo.setAmount(totamt);
			exprepo.setBudget(budgamount);
			
		
			
			return new ResponseEntity<>(exprepo,HttpStatus.OK);
		}
		else {
			Expensestructure exprepo=new Expensestructure();
			exprepo.setStatus(HttpStatus.OK);
			exprepo.setMessage("error");
			return new ResponseEntity<>(exprepo, HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	
	
	
	
}



