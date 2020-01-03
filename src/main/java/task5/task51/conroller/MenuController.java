package task5.task51.conroller;

import static task5.task51.model.commands.MenuCommands.*;

import task5.task51.model.commands.MenuCommands;
import task5.task51.model.entity.CuratorJournal;
import task5.task51.view.AppMessages;
import task5.task51.view.InputData;
import task5.task51.view.JournalView;

class MenuController {
    private JournalView view;
    private CuratorJournal journal;

    MenuController(JournalView view, CuratorJournal journal) {
        this.view = view;
        this.journal = journal;
    }

    void startMenu(){

        while (true){
            view.printMessage(AppMessages.ENTER_COMMAND);
            String token = InputData.input().toUpperCase();
            MenuCommands command;
            try {
                command = MenuCommands.valueOf(token);
            } catch (IllegalArgumentException e) {
                view.printMessage(AppMessages.WRONG_COMMAND);
                continue;
            }
            command.getCommand().execute(view, journal);

        }
    }
}
