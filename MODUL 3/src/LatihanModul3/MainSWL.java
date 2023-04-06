package LatihanModul3;

public class MainSWL {
    public static void main(String[] args) {
        StackWithoutLib swl = new StackWithoutLib(3);
        swl.push(5);
        swl.push(9);

        while (!swl.isEmpty()){
            long value = swl.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
