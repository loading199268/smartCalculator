package smartCalculator.operation;

import smartCalculator.CalculationCommand;

import java.math.BigInteger;

public class Multiplication implements CalculationCommand {

    @Override
    public String calculation(BigInteger result, BigInteger e) {
        return result.multiply(e).toString();
    }
}
