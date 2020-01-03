package task5.task51.conroller;

import task5.task51.model.entity.CuratorJournal;
import task5.task51.view.AppMessages;
import task5.task51.view.JournalView;

public class Controller {
    private JournalView view = new JournalView();
    private CuratorJournal journal = new CuratorJournal();

    public void startApp(){
        view.printMessage(AppMessages.WELCOME);
        view.printMessage(AppMessages.SEPARATOR);
        view.printMessage(AppMessages.HELP);
        view.printMessage(AppMessages.SEPARATOR);
        new MenuController(view, journal).startMenu();
    }
}
