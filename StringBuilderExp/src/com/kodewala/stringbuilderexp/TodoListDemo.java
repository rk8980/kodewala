package com.kodewala.stringbuilderexp;

public class TodoListDemo {
	void getToDoList()
	{
		// creating string 
		StringBuffer todo = new StringBuffer() ;
		
		//add task using append
		todo.append("1. Buy groceries\n");
        todo.append("2. Finish homework\n");
        todo.append("3. Call the plumber\n");
        
        // print original list
        System.out.println("To - Do list");
        System.out.println(todo);
        
        // Update a task using insert()
        // (Adding "- Updated" after "Finish homework")
        int index = todo.indexOf("Finish homework") + "Finish homework".length();
        todo.insert(index, "-upddated");
        
       
        
        int start = todo.indexOf("3. Call the plumber");
        int end = start +"3. Call the plumber".length();
        todo.delete(start, end);
        System.out.println("After updated To-Do List");
        System.out.println(todo);
        
	}

	public static void main(String[] args) {
		TodoListDemo todoListDemo = new TodoListDemo();
		todoListDemo.getToDoList();

	}

}
