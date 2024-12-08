import config.Database;
import repositories.TodolistDbRepositoryImpl;
import repositories.TodolistRepository;
import repositories.TodolistRepositoryimpl;
import services.TodolistService;
import services.TodolistServiceimpl;
import views.TodolistTerminalView;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("root", "", "localhost", "3306", "handson_8");
        database.setup();
//        TodolistRepository todolistRepository =  new TodolistRepositoryimpl();
        TodolistRepository todolistRepository =  new TodolistDbRepositoryImpl(database);
        TodolistService todolistService = new TodolistServiceimpl(todolistRepository);
        TodolistTerminalView todolistTerminalView = new TodolistTerminalView(todolistService);
        todolistTerminalView.mainScreen();
    }
}