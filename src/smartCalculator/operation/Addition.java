package smartCalculator.operation;

import smartCalculator.CalculationCommand;

import java.math.BigInteger;

public class Addition implements CalculationCommand {

    @Override
    public String calculation(BigInteger result, BigInteger e) {
        return result.add(e).toString();
    }
}
