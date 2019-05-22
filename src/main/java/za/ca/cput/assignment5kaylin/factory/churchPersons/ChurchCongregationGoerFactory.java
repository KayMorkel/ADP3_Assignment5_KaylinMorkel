package za.ca.cput.assignment5kaylin.factory.churchPersons;

import za.ca.cput.assignment5kaylin.domain.churchPersons.ChurchCongregationGoer;

public class ChurchCongregationGoerFactory {
    public static ChurchCongregationGoer getCongGoer(String goerId, String goerType) {
        return new ChurchCongregationGoer.Builder().goerId(goerId)
                .goerType(goerType)
                .build();
    }
}