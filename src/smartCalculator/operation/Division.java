package smartCalculator.operation;

import smartCalculator.CalculationCommand;

import java.math.BigInteger;

public class Division implements CalculationCommand {

    @Override
    public String calculation(BigInteger result, BigInteger e) {
        return result.divide(e).toString();
    }
}
