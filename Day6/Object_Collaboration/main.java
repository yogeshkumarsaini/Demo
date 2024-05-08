package Day6.Object_Collaboration;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        st.setName(sc.nextLine());
        st.setAge(sc.nextInt());
        st.setSchool(new School("SRGC","Muzaffarnagar"));
        st.setSubject(new Subject("Coding"));

        System.out.println(st);
    }
}
