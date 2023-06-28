package School;

public class SchoolApplication {

    public static void main(String[] args) {
        Student junu= new Student();
        junu.setName("Junu Thapa");
        junu.setRollNum(7);
        junu.setSection("B");
        junu.setAge(16);
        junu.setAddress("Tinpaini");

        String data = junu.getAddress();
        System.out.println(data);



    }
}
