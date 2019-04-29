package za.ca.cput.assignment5kaylin.repository.implementations;

import za.ca.cput.assignment5kaylin.domain.HallBooking;
import za.ca.cput.assignment5kaylin.repository.HallBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class HallBookingRepositoryImplementation implements HallBookingRepository
{
    private static HallBookingRepositoryImplementation classRepository = null;
    private Set<HallBooking> hall;

    private HallBookingRepositoryImplementation()
    {
        this.hall = new HashSet<>();
    }

    public static HallBookingRepository getRepository()
    {
        if(classRepository == null)

            classRepository = new HallBookingRepositoryImplementation();
        return classRepository;

    }

    @Override
    public Set<HallBooking> getAll() {
        return this.hall;
    }

    @Override
    public HallBooking create(HallBooking hallBooking) {
        this.hall.add(hallBooking);
        return hallBooking;
    }

    @Override
    public HallBooking read(String s) {
        HallBooking got = null;
        for (HallBooking cla: hall){
            if (cla.getHallBookId().equals(s)) {
                System.out.println(cla.getHallBookId() + cla.getEventType());
                got = new HallBooking.Builder().hallBookId(s).eventType(cla.getEventType()).build();
            }
        }

        return got;
    }

    @Override
    public HallBooking update(HallBooking hallBooking) {
        if (hall.contains(hallBooking))
        {
            hall.remove(hallBooking);
            hallBooking = new HallBooking.Builder().hallBookId(hallBooking.getHallBookId()).eventType(hallBooking.getEventType()).build();
            this.hall.add(hallBooking);
        }
        //}
        return hallBooking;
    }

    @Override
    public void delete(String s) {
        for (HallBooking cla: hall)
        {
            if (cla.getHallBookId().equals(s))
            {
                this.hall.remove(cla);
            }
        }
    }
}
