package za.ca.cput.assignment5kaylin.domain;

public class LoginStatus
{
    private String statNum, status;

    private LoginStatus(){}

    private LoginStatus(Builder builder)
    {
        this.statNum = builder.statNum;
        this.status = builder.status;
    }

    public String getStatNum() {return statNum;}
    public String getStatus() {return status;}

    public static class Builder
    {
        private String statNum, status;

        public Builder statNum(String statNum)
        {
            this.statNum = statNum;
            return this;
        }
        public Builder status(String status)
        {
            this.status = status;
            return this;
        }
        public LoginStatus build() {
            return new LoginStatus(this);
        }

        @Override
        public String toString()
        {
            return "Status Number: " + statNum + " Status: " + status;
        }
    }
}

