package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.ConfirmationClass;
import za.ca.cput.assignment5kaylin.repository.ConfirmationClassRepository;

import java.util.HashSet;
import java.util.Set;

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
                System.out.println(cla.getClassNo() + cla.getClassTime());
                got = new ConfirmationClass.Builder().classNo(s).classTime(cla.getClassTime()).build();
            }
        }

        return got;
    }

    @Override
    public ConfirmationClass update(ConfirmationClass confirmationClass) {
        if (conf.contains(confirmationClass))
        {
            conf.remove(confirmationClass);
            confirmationClass = new ConfirmationClass.Builder().classNo(confirmationClass.getClassNo()).classTime(confirmationClass.getClassTime()).build();
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
            }
        }
    }

    @Override
    public Set<ConfirmationClass> getAll() {
        return this.conf;
    }
}
