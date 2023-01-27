package behavioural.command;

public class MainCommand {



    public static void main(String[] args){
        File file = new File();

        Command openF = new OpenFileCommand(file);
        Command copyF = new CopFileCommand(file);
        Command closeF = new CloseFileCommand(file);

       FileInvoker openFileInvoker = new FileInvoker(openF);
       openFileInvoker.execute();

       FileInvoker copyFileInvoker =  new FileInvoker(copyF);
       copyFileInvoker.execute();

       FileInvoker closeFileInvoker = new FileInvoker(closeF);
       closeFileInvoker.execute();
    }
}
