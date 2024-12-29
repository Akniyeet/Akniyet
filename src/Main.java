public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ari", "Kim");

        person1.setAge(30);
        person1.setGender(true); // true for Male

        Person person2 = new Person("Carl", "Lei", 28, false); // false for Female

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        person2.setAge(29);
        person2.setName("Kia");

        System.out.println(person2.toString());
    }
}
