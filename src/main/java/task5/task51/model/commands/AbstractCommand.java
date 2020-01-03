package task5.task51.model.commands;

import task5.task51.model.entity.CuratorJournal;
import task5.task51.view.JournalView;

public abstract class AbstractCommand {

    public abstract void execute(JournalView view, CuratorJournal journal);
}
