public class Command {

    String commandAction;

    public Command(String commandAction) {
        this.commandAction = commandAction;
    }

    public boolean executeCommand(TaskList tasks, String fullCommand){
        switch(commandAction.toLowerCase()){
            case "bye":
                return true;
            case "list":
                //print the task list
                tasks.printList();
                break;
            case "todo":
                //add todo to task list, no date
                tasks.addTodo(commandAction, fullCommand);
                break;
            case "deadline":
                //add deadline to task list, got date
                tasks.addDeadline(commandAction, fullCommand);
                break;
            case "event":
                //add event to task list, got date
                tasks.addEvent(commandAction, fullCommand);
                break;
            case "mark":
                tasks.markDone(fullCommand);
                break;
            case "unmark":
                tasks.markUndone(fullCommand);
                break;
        }
        return false;
    }
}