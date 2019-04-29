package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Collection;
import za.ca.cput.assignment5kaylin.repository.CollectionRepository;

import java.util.HashSet;
import java.util.Set;

public class CollectionRepositoryImplementation implements CollectionRepository
{
    private static CollectionRepositoryImplementation classRepository = null;
    private Set<Collection> coll;

    private CollectionRepositoryImplementation()
    {
        this.coll = new HashSet<>();
    }

    public static CollectionRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new CollectionRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Collection create(Collection collection) {
        this.coll.add(collection);
        return collection;
    }

    @Override
    public Collection read(String s) {
        Collection got = null;
        for (Collection cla: coll){
            if (cla.getCollectId().equals(s)) {
                System.out.println(cla.getCollectId() + cla.getCollectAmt());
                got = new Collection.Builder().collectId(s).collectAmt(cla.getCollectAmt()).build();
            }
        }

        return got;
    }

    @Override
    public Collection update(Collection collection) {
        if (coll.contains(collection))
        {
            coll.remove(collection);
            collection = new Collection.Builder().collectId(collection.getCollectId()).collectAmt(collection.getCollectAmt()).build();
            this.coll.add(collection);
        }
        //}
        return collection;
    }

    @Override
    public void delete(String s)
    {
        for (Collection cla: coll)
        {
            if (cla.getCollectId().equals(s))
            {
                this.coll.remove(cla);
            }
        }
    }

    @Override
    public Set<Collection> getAll() {
        return this.coll;
    }
}
