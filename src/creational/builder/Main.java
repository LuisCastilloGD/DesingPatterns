package creational.builder;

public class Main {

    public static void main(String[] args){

        Student.StudentBuilder builder = Student.StudentBuilder.newInstance();

        Student luis = builder.address("Provi").id(5).name("Luis").build();


        System.out.println(luis.toString());
        Student daniel = builder.address("Colinas").name("Daniel").build();


        System.out.println(daniel.toString());
    }

}
