package classes;

public class Box {

    int hight;
    int lenght;
    int width;

    public Box(int hight, int lenght, int width) {

        this.lenght = hight;

        this.lenght = lenght;

        this.lenght = width;

    }

    public long calculateVolue() {
        return (long) this.hight * this.lenght * this.width;

    }

    public void printBox() {

        System.out.println("Box is " + this.hight + this.lenght + this.width);


    }
}
