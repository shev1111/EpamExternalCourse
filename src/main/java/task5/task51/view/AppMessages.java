package task5.task51.view;

public interface AppMessages {
    String HELP = "COMMANDS:\n" +
                  "'print' - prints all records in curator journal if there are one or more records\n" +
                  "'add'   - start adding record process by patterns\n" +
                  "'help'  - print help menu\n" +
                  "'exit'  - quit the app";
    String WELCOME = "WELCOME TO CURATOR JOURNAL APP";
    String WRONG_COMMAND = "Read help, enter valid command!";
    String LEAVE = "GOOD BYE!";
    String SEPARATOR = "==================================================================";
    String STUDENT_TABLE_HEADER = String.format("%3s | %15s | %14s | %10s | %75s | %15s | ",
                                                "ID", "NAME", "SURNAME", "BIRTH", "ADDRESS", "PHONE");
    String ENTER_COMMAND = "ENTER COMMAND ==>";
    String ENTER_NAME = "Enter student name ==>";
    String ENTER_SURNAME = "Enter student surname ==>";
    String ENTER_BIRTH_DATE = "Enter student's birth date ==>";
    String ENTER_PHONE = "Enter student's phone number ==>";
    String ENTER_ADDRESS = "Enter student's address ==>";
    String NAME_EXAMPLE = "Student name/surname can consist of a-z A-Z а-я А-Я";
    String BIRTH_EXAMPLE = "Student birth pattern dd-MM-yyyy";
    String PHONE_EXAMPLE = "Student's phone pattern is 380975648297";
    String ADDRESS_EXAMPLE = "Student address pattern is " +
            "'30-richchya Peremohy Street," +
            " home 22, flat 10, Cherkasy," +
            " Cherkas'ka oblast'";
    String INVALID_PATTERN = "You entered invalid data";
}
