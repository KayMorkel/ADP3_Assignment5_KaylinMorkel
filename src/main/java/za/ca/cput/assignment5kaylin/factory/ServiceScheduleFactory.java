package za.ca.cput.assignment5kaylin.factory;

import za.ca.cput.assignment5kaylin.domain.ServiceSchedule;

public class ServiceScheduleFactory
{
    public static ServiceSchedule getSS(String id, String type)
    {
        return new ServiceSchedule.Builder().id(id)
                .type(type)
                .build();
    }
}
