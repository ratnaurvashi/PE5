import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class MainTest {

        public static void main(String []args) {

                List<Student> students = new ArrayList<>();

                Student ob1 = new Student(123, "Jack", 22);
                Student ob2 = new Student(184, "Paul", 23);
                Student ob3 = new Student(409, "Ria", 21);
                Student ob4 = new Student(116, "Rohan", 28);
                Student ob5 = new Student(234, "Sahil", 22);

                students.add(ob1);
                students.add(ob2);
                students.add(ob3);
                students.add(ob4);
                students.add(ob5);


                System.out.println("Unsorted array is");

                Iterator it = students.iterator();
                while (it.hasNext()) {
                        Student element = (Student) it.next();
                        System.out.print(element.getId() + " " + element.getName() + " " + element.getAge() + " ");
                        System.out.println();

                }

                System.out.println();
                System.out.println("Sorted according to their age is");

                MainTest obj = new MainTest();

                System.out.println(obj.SortStudents(students));

        }


        public List<Student> SortStudents(List<Student> s)
        {
                String str="";
                Collections.sort(s,new StudentSorter());
                Iterator it1 = s.iterator();
                while (it1.hasNext()) {
                        Student element = (Student) it1.next();
                        System.out.println(element.getId() + " " + element.getName() + " " + element.getAge()+" ");
                }
                return s;
        }
}