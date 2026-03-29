package oops;

public class Main {
    public static void main(String[] args) {
        //store 5 roll nos:
        int[] numbers = new int[5];
        //store 5 names:
        String[] name = new String[5];


        // data of 5 students:{rno, names, marks}
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] student = new Student[5]; // creating our own datatype;
        //declaring and initializing
        Student revanth = new Student(18,"Revanthkumar",84.3f);
        Student rahul = new Student();
//        revanth.rno = 44;
//        revanth.name = "Revanth";
//        revanth.marks = 87.9f;
//        revanth.changeName("Revanthkumar");
//        revanth.greeting();
        System.out.println(revanth.rno);
        System.out.println(revanth.name);
        System.out.println(revanth.marks);

        Student random = new Student(revanth);
        System.out.println(random.marks);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);

    }
}
//create a class
//for every single student- 3 properties!!!
    class Student{

          int rno;
          String name;
          float marks=90.0f;
          //we need a way to add values of the above
          // properties object by object
          // we need one word to access every object
           void greeting(){
              System.out.println("Hello! My name is "+this.name);
          }
          void changeName(String newName){
               name = newName;
          }
          Student (Student other){
               this.name = other.name;
               this.rno = other.rno;
               this.marks = other.marks;
          }
          Student(){
              //this is how you call a constructor from another constructor!!
              this(13,"Default person",100.0f);
          }
          Student(int rno, String name, float marks){
              this. rno = rno;
               this. name = name;
               this.marks = marks;
          }

    }
