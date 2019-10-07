/*package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Collection;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.CollectionFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.CollectionRepository;

import java.util.HashSet;
import java.util.Set;

@Repository*/
/*public class CollectionRepositoryImplementation implements CollectionRepository
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
                System.out.println(cla.getCollectId() + " " + cla.getCollectAmt());
                got = CollectionFactory.getCollection(s, cla.getCollectAmt());
            }
        }

        return got;
    }

    @Override
    public Collection update(Collection collection) {
        if (coll.contains(collection))
        {
            coll.remove(collection);
            collection = CollectionFactory.getCollection(collection.getCollectId(), collection.getCollectAmt());
            this.coll.add(collection);
        }
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
                break;
            }
        }
    }

    @Override
    public Set<Collection> getAll() {
        return this.coll;
    }
}*/
