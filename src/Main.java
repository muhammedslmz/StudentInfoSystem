public class Main {
    public static void main(String []args){
        Teacher t1=new Teacher("Muhammed","PHY","911");
        Teacher t2=new Teacher("Furkan","MAT","112");
        Teacher t3=new Teacher("İkbal","BIO","773");

        Course physics =new Course("Physics","1001","PHY");
        physics.addTeacher(t1);

        Course math =new Course("Mathematics","1005","MAT");
        math.addTeacher(t2);

        Course biology=new Course("Biology","2003","BIO");
        biology.addTeacher(t3);



        Student s1=new Student("Hümeyra","234","4",physics,math,biology);
        s1.addBulkExamNote(100,62,60,100);
        s1.isPass();

        Student s2 =new Student("Can", "283","1",physics,math,biology);
        Student s3=new Student ("Tuğba","668","3",physics,math,biology);
        s2.addBulkExamNote(19,25,45,18);
        s2.isPass();

        s3.addBulkExamNote(45,85,89,100);
        s3.isPass();
    }
}
