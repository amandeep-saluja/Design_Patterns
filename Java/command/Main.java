package command;

public class Main {
    public static void main(String[] args) {
        //Receiver - performing action
        Document document = new Document();

        //create concrete commands
        //receiver with command
        ActionOpen actionOpen = new ActionOpen(document);
        ActionSave actionSave = new ActionSave(document);

        //Invoker
        MenuOptions menuOptions = new MenuOptions(actionOpen, actionSave);

        menuOptions.clickOpen();
        menuOptions.clickSave();
    }
}
