package za.ca.cput.assignment5kaylin.repository.churchAdmin.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;
import za.ca.cput.assignment5kaylin.factory.churchAdmin.YearEventFactory;
import za.ca.cput.assignment5kaylin.repository.churchAdmin.YearEventRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class YearEventRepositoryImplementation implements YearEventRepository
{
    private static YearEventRepositoryImplementation classRepository = null;
    private Set<YearEvent> year;

    private YearEventRepositoryImplementation()
    {
        this.year = new HashSet<>();
    }

    public static YearEventRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new YearEventRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<YearEvent> getAll() {
        return this.year;
    }

    @Override
    public YearEvent create(YearEvent yearEvent) {
        this.year.add(yearEvent);
        return yearEvent;
    }

    @Override
    public YearEvent read(String s) {
        YearEvent got = null;
        for (YearEvent cla: year){
            if (cla.getEventNum().equals(s)) {
                System.out.println(cla.getEventNum() + cla.getName());
                got = YearEventFactory.getYearEvent(s, cla.getName());
            }
        }

        return got;
    }

    @Override
    public YearEvent update(YearEvent yearEvent) {
        if (year.contains(yearEvent))
        {
            year.remove(yearEvent);
            yearEvent = YearEventFactory.getYearEvent(yearEvent.getEventNum(), yearEvent.getName());
            this.year.add(yearEvent);
        }
        //}
        return yearEvent;
    }

    @Override
    public void delete(String s) {
        for (YearEvent cla: year)
        {
            if (cla.getEventNum().equals(s))
            {
                this.year.remove(cla);
                break;
            }
        }
    }
}
