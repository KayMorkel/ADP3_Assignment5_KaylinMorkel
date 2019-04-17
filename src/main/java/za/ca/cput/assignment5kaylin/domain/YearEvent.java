package za.ca.cput.assignment5kaylin.domain;

public class YearEvent
{
    private String eventNum, name;

    private YearEvent(){}

    private YearEvent(Builder builder)
    {
        this.eventNum = builder.eventNum;
        this.name = builder.name;
    }

    public String getEventNum() {return eventNum;}
    public String getName() {return name;}

    public static class Builder
    {
        private String eventNum, name;

        public Builder eventNum(String eventNum)
        {
            this.eventNum = eventNum;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public YearEvent build() {
            return new YearEvent(this);
        }

        @Override
        public String toString()
        {
            return "event num" + eventNum + " event name" + name;
        }
    }
}
