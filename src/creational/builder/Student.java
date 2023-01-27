package creational.builder;

final public class Student {

    private  int id;
    private  String name;
    private  String address;

    public Student(StudentBuilder builder){
        this.id= builder.id;
        this.address=builder.address;
        this.name= builder.name;
    }


    public static class StudentBuilder{

        private  int id;
        private  String name;
        private  String address;

        public static StudentBuilder newInstance(){
            return new StudentBuilder();
        }
        private StudentBuilder(){

        }
        public StudentBuilder id(int id){
            this.id=id;
            return this;
        }

        public StudentBuilder name(String name){
            this.name=name;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}