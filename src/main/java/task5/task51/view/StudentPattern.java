package task5.task51.view;

public interface StudentPattern {
    String NAME_PATTERN = "^[a-zA-Zа-яА-Я]{1,25}$";
    String BIRTH_PATTERN = "((0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-[12]\\d{3})";
    String PHONE_PATTERN = "\\d{12}";
    String ADDRESS_PATTERN = "(\\s|)([a-zA-Z\\s\\d-']+)(\\s|)," +
                             "(\\s|)home(\\s|)([a-zA-Z\\s\\d-']+)(\\s|)," +
                             "(\\s|)flat(\\s|)([a-zA-Z\\s\\d-']+)(\\s|)," +
                             "(\\s|)([a-zA-Z\\s\\d-']+)(\\s|)," +
                             "(\\s|)([a-zA-Z\\s\\d-']+)(\\s|)";

}
