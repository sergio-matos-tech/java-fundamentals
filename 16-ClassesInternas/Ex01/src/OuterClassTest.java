public class OuterClassTest {
    private String name = "Monkey D. Luffy";

    class InnerClassTest {
        public void printOuterClassAtribute() {
            System.out.println(name);
        }
    }


    public static void main(String[] args) {

        OuterClassTest outerClassTest = new OuterClassTest();

        outerClassTest.new InnerClassTest();

        System.out.println(outerClassTest.name);


    }
}
