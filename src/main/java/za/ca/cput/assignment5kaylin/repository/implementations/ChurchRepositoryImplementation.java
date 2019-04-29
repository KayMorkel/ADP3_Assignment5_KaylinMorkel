package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.Church;
import za.ca.cput.assignment5kaylin.repository.ChurchRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getChurchId() + cla.getAddress());
                got = new Church.Builder().churchId(s).address(cla.getAddress()).build();
            }
        }

        return got;
    }

    @Override
    public Church update(Church church) {
        //for (Class cla: classes){
        if (chu.contains(church))
        {
            chu.remove(church);
            church = new Church.Builder().churchId(church.getChurchId()).address(church.getAddress()).build();
            this.chu.add(church);
        }
        //}
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
            }
        }
    }

    @Override
    public Set<Church> getAll() {
        return this.chu;
    }
}
