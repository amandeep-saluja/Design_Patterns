package command;

public class MenuOptions {
    private IActionListnerCommand openCommand;
    private IActionListnerCommand saveCommand;

    public MenuOptions(IActionListnerCommand openCommand, IActionListnerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
