package behavioural.command;

public class CopFileCommand implements Command{
    File file;
    public CopFileCommand(File file) {
        this.file = file;
    }
    @Override
    public void execute() {
        System.out.println("File copied");
    }
}
