package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {
	private static ArrayList<Todo> lista = new ArrayList<>();

	public TodoCtrl() {
		super();
	}
	
	public static void addTodo(String description) {
		Todo temp = new Todo(description);
		lista.add(temp);
	}
	
//	public void printList() {
//		for (int i = 0; i < lista.size(); i++) {
//			if(lista.get(i) == null)
//				break;
//			if(lista.get(i).isCompleted()) {
//				System.out.print("[x]");
//			}
//			else {
//				System.out.print("[ ]");
//			}
//			System.out.println(lista.get(i).getDescription());
//		}
//	}
	
	
	public static void completeTodo(int id) {
		for (Todo todo : lista) {
			if(todo.getId() == id) {
				todo.setCompleted(!todo.isCompleted());
			}
		}
	}
	
	public static ArrayList<Todo> getLista() {
		return lista;
	}
	
	
}
