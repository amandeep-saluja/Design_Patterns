package command;

public class ActionOpen implements IActionListnerCommand {
    private final Document document;

    public ActionOpen(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.open();
    }
}
