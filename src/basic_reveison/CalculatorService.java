package basic_reveison;
interface Calculator {
    void Calculate(int a, int b);
}

class ADDCalculator implements Calculator {

    @Override
    public void Calculate(int a, int b) {
        System.out.print("ADD: ");
        System.out.println(a + b);
    }
}

class SUBSCalculator implements Calculator {

    @Override
    public void Calculate(int a, int b) {
        System.out.print("SUBS: ");
        System.out.println(a - b);
    }
}

class MULTIPLYCalculator implements Calculator {

    @Override
    public void Calculate(int a, int b) {
        System.out.print("MULTIPLY: ");
        System.out.println(a * b);
    }
}

class CalculatorFactory {

    public Calculator createCalculator(String channel) {
        if (channel == null || channel.isEmpty()) return null;
        if ("ADD".equals(channel)) {
            return new ADDCalculator();
        } else if ("SUBS".equals(channel)) {
            return new SUBSCalculator();
        } else if ("MULTIPLY".equals(channel)) {
            return new MULTIPLYCalculator();
        }
        return null;
    }
}

public class CalculatorService {
    public static void main(String[] args) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator Calculator1 = calculatorFactory.createCalculator("ADD");
        Calculator1.Calculate(4, 5);
        Calculator Calculator2 = calculatorFactory.createCalculator("SUBS");
        Calculator2.Calculate(4, 5);
        Calculator Calculator3 = calculatorFactory.createCalculator("MULTIPLY");
        Calculator3.Calculate(4, 5);
    }
}
