package task5.task51.model.commands;


import task5.task51.model.entity.CuratorJournal;
import task5.task51.model.entity.Student;
import task5.task51.model.utils.DataValidator;
import task5.task51.view.AppMessages;
import task5.task51.view.InputData;
import task5.task51.view.JournalView;
import task5.task51.view.StudentPattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddCommand extends AbstractCommand {
    private JournalView view;


    @Override
    public void execute(JournalView view, CuratorJournal journal) {
        this.view = view;

        view.printMessage(AppMessages.ENTER_NAME);
        String name = getName();

        view.printMessage(AppMessages.ENTER_SURNAME);
        String surname = getName();

        view.printMessage(AppMessages.ENTER_BIRTH_DATE);
        Date birth = getBirth();

        view.printMessage(AppMessages.ENTER_PHONE);
        long phone = getPhone();

        view.printMessage(AppMessages.ENTER_ADDRESS);
        String address = getAddress();

        journal.addRecord(new Student(name,surname,birth,phone,address));

    }



    private String getName(){
        String input = "";
        boolean validMarker = false;
        while (!validMarker){

            view.printMessage(AppMessages.NAME_EXAMPLE);
            input = InputData.input();
            validMarker = DataValidator.validate(input, StudentPattern.NAME_PATTERN);
            if(!validMarker)view.printErrorMessage(AppMessages.INVALID_PATTERN);
        }
        return input;
    }

    private Date getBirth() {
        try {
            while (true){
                view.printMessage(AppMessages.BIRTH_EXAMPLE);
                String input = InputData.input();
                if(DataValidator.validate(input, StudentPattern.BIRTH_PATTERN)){
                    return new SimpleDateFormat("dd-MM-yyyy").parse(input);
                }else {
                    view.printErrorMessage(AppMessages.INVALID_PATTERN);
                }

            }
        } catch (ParseException e) {
            view.printErrorMessage(e.getMessage()+" - "+AppMessages.INVALID_PATTERN);
        }
        return new Date(0);
    }

    private long getPhone() {
        while (true){
            view.printMessage(AppMessages.PHONE_EXAMPLE);
            String input = InputData.input();
            if(DataValidator.validate(input, StudentPattern.PHONE_PATTERN)){
                return Long.parseLong(input);
            }else {
                view.printErrorMessage(AppMessages.INVALID_PATTERN);
            }
        }
    }

    private String getAddress() {
        String input = "";
        boolean validMarker = false;
        while (!validMarker){

            view.printMessage(AppMessages.ADDRESS_EXAMPLE);
            input = InputData.input();
            validMarker = DataValidator.validate(input, StudentPattern.ADDRESS_PATTERN);
            if(!validMarker)view.printErrorMessage(AppMessages.INVALID_PATTERN);
        }
        return input;
    }

}