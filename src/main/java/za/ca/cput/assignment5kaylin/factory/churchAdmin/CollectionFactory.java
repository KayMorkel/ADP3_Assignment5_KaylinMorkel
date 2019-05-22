package za.ca.cput.assignment5kaylin.factory.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;

public class CollectionFactory {
    public static Collection getCollection(String collectId, double collectAmt) {
        return new Collection.Builder().collectId(collectId)
                .collectAmt(collectAmt)
                .build();
    }
}
