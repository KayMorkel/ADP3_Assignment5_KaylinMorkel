package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.Church;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.ChurchFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.ChurchRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class ChurchRepositoryImplementation  implements ChurchRepository
{
    private static ChurchRepositoryImplementation classRepository = null;
    private Set<Church> chu;

    private ChurchRepositoryImplementation()
    {
        this.chu = new HashSet<>();
    }

    public static ChurchRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new ChurchRepositoryImplementation();
        return classRepository;
    }


    @Override
    public Church create(Church church) {
        this.chu.add(church);
        return church;
    }

    @Override
    public Church read(String s) {
        Church got = null;
        for (Church cla: chu){
            if (cla.getChurchId().equals(s)) {
                System.out.println(cla.getChurchId() + " " + cla.getAddress());
                //got = new Church.Builder().churchId(s).address(cla.getAddress()).build();
                got = ChurchFactory.getChurch(s, cla.getAddress());
            }
        }

        return got;
    }

    @Override
    public Church update(Church church) {
        //Church chur = null;

       // for(Church churchy:chu)
        //{
       // coll.contains(collection)
            if (chu.contains(church))
            {
                chu.remove(church);
    //          church = new Church.Builder().churchId(church.getChurchId()).address(church.getAddress()).build();
                church = ChurchFactory.getChurch(church.getChurchId(), church.getAddress());
                this.chu.add(church);
            }

        return church;
    }

    @Override
    public void delete(String s)
    {
        for (Church cla: chu)
        {
            if (cla.getChurchId().equals(s))
            {
                this.chu.remove(cla);
                break;
            }
        }
    }

    @Override
    public Set<Church> getAll()
    {
        return this.chu;
    }
}
