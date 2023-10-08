package command;

public class ActionSave implements IActionListnerCommand {

    private final Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.save();
    }
}
