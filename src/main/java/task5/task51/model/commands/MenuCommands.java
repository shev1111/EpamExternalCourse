package task5.task51.model.commands;

public enum MenuCommands {

    PRINT("Print", new PrintCommand()),
    ADD("Add records", new AddCommand()),
    EXIT("Leave the app", new ExitCommand()),
    HELP("Help message", new HelpCommand());

    String definition;
    AbstractCommand command;

    MenuCommands(String definition, AbstractCommand command) {
        this.definition = definition;
        this.command = command;
    }

    public String getDefinition() {
        return definition;
    }

    public AbstractCommand getCommand() {
        return command;
    }
}
