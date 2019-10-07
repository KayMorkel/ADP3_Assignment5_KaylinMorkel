/*package za.ca.cput.assignment5kaylin.repository.churchClasses.implementations;

import org.springframework.stereotype.Repository;
import za.ca.cput.assignment5kaylin.domain.churchClasses.ConfirmationClass;
import za.ca.cput.assignment5kaylin.factory.churchClasses.ConfirmationClassFactory;
import za.ca.cput.assignment5kaylin.repository.churchClasses.ConfirmationClassRepository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class ConfirmationClassRepositoryImplementation  implements ConfirmationClassRepository
{
    private static ConfirmationClassRepositoryImplementation classRepository = null;
    private Set<ConfirmationClass> conf;

    private ConfirmationClassRepositoryImplementation()
    {
        this.conf = new HashSet<>();
    }

    public static ConfirmationClassRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new ConfirmationClassRepositoryImplementation();
        return classRepository;

    }

    @Override
    public ConfirmationClass create(ConfirmationClass confirmationClass) {
        this.conf.add(confirmationClass);
        return confirmationClass;
    }

    @Override
    public ConfirmationClass read(String s) {
        ConfirmationClass got = null;
        for (ConfirmationClass cla: conf){
            if (cla.getClassNo().equals(s)) {
                System.out.println(cla.getClassNo() + " " + cla.getClassTime());
                got = ConfirmationClassFactory.getBapClass(s, cla.getClassTime());
            }
        }

        return got;
    }

    @Override
    public ConfirmationClass update(ConfirmationClass confirmationClass) {
        if (conf.contains(confirmationClass))
        {
            conf.remove(confirmationClass);
            confirmationClass = ConfirmationClassFactory.getBapClass(confirmationClass.getClassNo(), confirmationClass.getClassTime());
            this.conf.add(confirmationClass);
        }
        //}
        return confirmationClass;
    }

    @Override
    public void delete(String s) {
        for (ConfirmationClass cla: conf)
        {
            if (cla.getClassNo().equals(s))
            {
                this.conf.remove(cla);
                break;
            }
        }
    }

    @Override
    public Set<ConfirmationClass> getAll() {
        return this.conf;
    }
}*/
