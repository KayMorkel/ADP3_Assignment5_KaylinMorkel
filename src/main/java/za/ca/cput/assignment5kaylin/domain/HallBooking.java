package za.ca.cput.assignment5kaylin.domain;

public class HallBooking
{
    private String hallBookId, eventType;

    private HallBooking(){}

    private HallBooking(Builder builder)
    {
        this.hallBookId = builder.hallBookId;
        this.eventType = builder.eventType;
    }

    public String getHallBookId() {return hallBookId;}
    public String getEventType() {return eventType;}

    public static class Builder
    {
        private String hallBookId, eventType;

        public Builder hallBookId(String hallBookId)
        {
            this.hallBookId = hallBookId;
            return this;
        }
        public Builder eventType(String eventType)
        {
            this.eventType = eventType;
            return this;
        }
        public HallBooking build() {
            return new HallBooking(this);
        }

        @Override
        public String toString()
        {
            return "bookingId" + hallBookId + " event type" + eventType;
        }
    }
}
