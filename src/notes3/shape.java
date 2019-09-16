package notes3;

public class shape {

    public int length;
    public int width;


    public shape(int length, int width){

        this.length = length;
        this.width = width;


    }

        public void calculateArea(){


            System.out.println(length * width);
        }

    int area = length*width;


    @Override
    public String toString() {
        return "shape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
