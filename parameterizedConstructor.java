public class parameterizedConstructor {
    int number;

    public parameterizedConstructor(int num) {
        number = num;
        System.out.println("This is a parameterized constructor.");
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
       
        parameterizedConstructor obj = new parameterizedConstructor(25);
    }
}
