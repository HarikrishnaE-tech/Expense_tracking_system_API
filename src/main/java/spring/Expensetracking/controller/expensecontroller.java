package spring.Expensetracking.controller;

import java.time.YearMonth;
import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.Expensetracking.model.Budget;
import spring.Expensetracking.model.BudgetDTO;
import spring.Expensetracking.model.Category;
import spring.Expensetracking.model.Expense;
import spring.Expensetracking.model.ExpenseDTO;
import spring.Expensetracking.model.User;
import spring.Expensetracking.responsestructure.Expensestructure;
import spring.Expensetracking.responsestructure.Userresponsestructure;
import spring.Expensetracking.service.Expenseservice;

@RestController

public class expensecontroller {
@Autowired
Expenseservice service;	
	
	
	
	
	
	@RequestMapping("/")
	public String mainpage() {
		return "index";
		
	}
	@PostMapping("/newexp")
	public String newexpense(@RequestBody ExpenseDTO expensedto) {
	String message=	service.newexpense(expensedto);
		
		return message;
		
	}
	@PostMapping("/userregister")
	public String userregister(@RequestBody User user) {
	String message=service.useregister(user);
		return message;
		
	}
	@PostMapping("/catereg")
		public String cateregister(@RequestBody Category category) {
		String message=	service.categoryreg(category);
		return message;
		}
	
	@PostMapping("/budgreg")
	public String budgetreg(@RequestBody BudgetDTO budgetdto) {
		String message = service.Budgetreg(budgetdto);
		return message;
		
	}
	@GetMapping("/singleuserexpense/{userid}")
	public ResponseEntity<Userresponsestructure<List<Expense>>> singleuserexpense(@PathVariable int userid) { // show all the expense of the month of a single id
	ResponseEntity<Userresponsestructure<List<Expense>>> singleuserdetail = service.singleuserdetail(userid);
		return singleuserdetail;
		
	}
	@GetMapping("/totexp/{userid}")
	public ResponseEntity total_expdetof_ofid(@PathVariable int userid ) { //calculate all the expense of the month ,compare with budget
ResponseEntity<Expensestructure<Double>> result =service.tot_exp_month(userid);
		return result;
		
	}
	
	
	
	}
	
	
	
	
	
	

