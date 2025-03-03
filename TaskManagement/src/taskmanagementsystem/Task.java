package taskmanagementsystem;

import java.time.LocalDate;

public class Task {

	
	private String title;
	private String description;
	private  LocalDate dueDate;
	private  Priority priority;
	private  boolean isComplete;
	  
	  public Task(String title, String description, LocalDate dueDate, Priority priority, boolean isComplete) {
		super();
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.isComplete = false;
	}
	
	  public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	public String toString() {
		return "Task title=" + title + "\nDescription=" + description + "\nDueDate=" + dueDate + "\nPriority="
				+ priority + "\nisComplete=" + isComplete+"\n" ;
	}  
	

}
