package task5.task51.model.commands;

import task5.task51.model.entity.CuratorJournal;
import task5.task51.model.utils.ConversionUtil;
import task5.task51.view.AppMessages;
import task5.task51.view.JournalView;

public class PrintCommand extends AbstractCommand {

    @Override
    public void execute(JournalView view, CuratorJournal journal) {
       view.printMessage(AppMessages.STUDENT_TABLE_HEADER);
       view.printMessage(ConversionUtil.ConvertJournalRecords(journal.getRecords()));

    }
}
