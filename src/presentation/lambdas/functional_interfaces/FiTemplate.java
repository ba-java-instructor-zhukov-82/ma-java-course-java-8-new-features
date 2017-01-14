package presentation.lambdas.functional_interfaces;

@FunctionalInterface
public interface FiTemplate {

    static final float PI = 3.14f;

    void test(String data);

    default FiTemplate decorate(String data) {
        test(data.toUpperCase());
        return this;
    }


    static void main(String[] args) {
        FiTemplate tester = (data) -> System.out.println(data + "[tester]");
        FiTemplate decorator = tester.decorate("data");
        tester.test("data");
    }
}
