package behavioural.command;

public class FileInvoker implements Command{

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
