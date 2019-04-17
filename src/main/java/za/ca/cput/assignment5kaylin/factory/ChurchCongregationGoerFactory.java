package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.ChurchCongregationGoer;

public class ChurchCongregationGoerFactory {
    public static ChurchCongregationGoer getCongGoer(String goerId, String goerType) {
        return new ChurchCongregationGoer.Builder().goerId(goerId)
                .goerType(goerType)
                .build();
    }
}