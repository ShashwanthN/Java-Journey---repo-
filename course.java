import java.util.*;

class addNum {
    public int addTwo(int a, int b) {
        return a + b;

    }
}

class SubNum {
    public int subTwo(int a, int b) {
        return a - b;

    }
}

class DivNum {
    public int divTwo(int a, int b) {
        return a / b;

    }
}

class MulNum {
    public int mulTwo(int a, int b) {
        return a * b;

    }
}

class takeInputs {
    public int takeInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the First num:");
            int a = sc.nextInt();
            System.out.println("enter the Second num:");
            int b = sc.nextInt();
            System.out.println("enter what type of operation: \n 1-> add \n 2-> sub \n 3-> mul \n 4-> div");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    addNum num = new addNum();
                    int result = num.addTwo(a, b);
                    return result;
                }

                case 2: {
                    SubNum num = new SubNum();
                    int result = num.subTwo(a, b);
                    return result;
                }

                case 3: {
                    MulNum num = new MulNum();
                    int result = num.mulTwo(a, b);
                    return result;

                }

                case 4: {
                    DivNum num = new DivNum();
                    int result = num.divTwo(a, b);
                    return result;

                }

                default:
                    System.out.println("invalid input");
                    break;
            }
            return 0;
        }
    }
}

public class course {
    public static void main(String args[]) {
        takeInputs input = new takeInputs();
        System.out.println("the result is: " + input.takeInput());
    }
}