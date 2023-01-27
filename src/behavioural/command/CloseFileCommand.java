package behavioural.command;

public class CloseFileCommand implements Command{
    File file;

    public CloseFileCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        this.file.closeFile();
    }
}
