class Students{
    int rownum;
    String student_name;
    int marks;
}

public class array_obj {
    public static void main(String[] args) {
        Students student[] = new Students[3];

        Students s1 = new Students();
        s1.rownum = 1;
        s1.student_name = "wang";
        s1.marks = 33;

        Students s2 = new Students();
        s2.rownum = 2;
        s2.student_name = "alex";
        s2.marks = 77;

        Students s3 = new Students();
        s3.rownum = 3;
        s3.student_name = "abhi";
        s3.marks = 87;

//        System.out.println(s1);

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

//        for(int i =0; i< student.length; i++){
//            System.out.print(student[i].student_name + " ");
//            System.out.print(student[i].rownum + " ");
//            System.out.println(student[i].marks);
//
//        }
//        Enhanced for loop
        for(Students stud : student){
            System.out.println(stud.student_name + ":" + stud.marks);
        }

    }

}
