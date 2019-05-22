package za.ca.cput.assignment5kaylin.factory.churchAdmin;

import za.ca.cput.assignment5kaylin.domain.churchAdmin.YearEvent;

public class YearEventFactory
{
    public static YearEvent getYearEvent(String eventNum, String name)
    {
        return new YearEvent.Builder().eventNum(eventNum)
                .name(name)
                .build();
    }
}
