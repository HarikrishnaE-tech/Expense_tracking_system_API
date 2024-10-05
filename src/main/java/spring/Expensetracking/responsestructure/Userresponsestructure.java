package spring.Expensetracking.responsestructure;

import org.springframework.stereotype.Component;

@Component
public class Userresponsestructure<T> {

    private int status;
    private String message;
    private T data; // Use generic type T instead of hardcoding List<Expense>
    private Double budgamount;

    // Getter and Setter for status
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and Setter for data (Generic Type)
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }

    // Getter and Setter for budget amount
    public Double getBudgamount() {
        return budgamount;
    }
    
    public void setBudgamount(Double budgamount) {
        this.budgamount = budgamount;
    }

    // Constructor with parameters
    public Userresponsestructure(int status, String message, T data, Double budgamount) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
        this.budgamount = budgamount;
    }

    // Default constructor
    public Userresponsestructure() {
        super();
    }

    // toString method for debugging or logging
    @Override
    public String toString() {
        return "Userresponsestructure [status=" + status + ", message=" + message + ", data=" + data + ", budgamount="
                + budgamount + "]";
    }
}
