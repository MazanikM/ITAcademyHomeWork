package home_work_1;

public class Test {
    public static void main(String[] args) {
        Test c = new Test();
        c.process("asd");
        c.process("asd","asd");
        c.process("asd","asd","asd");
    }
    private void process(String... s){
        System.out.println("*");
    }
    private void process(String s){
        System.out.println("1");
    }
    private void process(String s, String a){
        System.out.println("2");
    }

}
