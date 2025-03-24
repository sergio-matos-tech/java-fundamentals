package services;

import java.security.InvalidParameterException;

public class USAInterestService implements InterestService {
    private final Double interestRate;

    public USAInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }

}
