package lesson_SHK.part1_basics.chap2_object_oriented.day11.InheritanceTest_1;

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(10);

        System.out.println(someKid.getSex());
        System.out.println(someKid.getSalary());
        System.out.println(someKid.getYeasOld());
    }
}
