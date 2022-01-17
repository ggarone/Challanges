package model;

public class Todo {
	private static int counter = 0;
	private String description;
	private boolean completed;
	private int id;
	
	
	public Todo(String description) {
		super();
		this.description = description;
		this.completed = false;
		this.id = counter++;
		
	}
	
	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Todo [description=" + description + ", completed=" + completed + "]";
	}
	
}
