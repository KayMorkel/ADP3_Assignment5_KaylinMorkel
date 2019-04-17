package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.Collection;

public class CollectionFactory {
    public static Collection getCollection(String collectId, double collectAmt) {
        return new Collection.Builder().collectId(collectId)
                .collectAmt(collectAmt)
                .build();
    }
}
