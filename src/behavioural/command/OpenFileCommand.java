package behavioural.command;

public class OpenFileCommand implements Command{
    File file;

    public OpenFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.openFile();
    }
}
