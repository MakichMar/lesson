package classes;

public class Boxusage {
    public static void main(String[] args) {
        Box box1 = new Box(2, 4, 6);
        Box box2 = new Box(1, 5, 8);

        box1.printBox();
        box2.printBox();

        long velume1 = box1.calculateVolue();
        System.out.println("the volume for first box is :  " + velume1);
        long volume2 = box2.calculateVolue();
        System.out.println("the volume for first box is : " + volume2);
    }

}
