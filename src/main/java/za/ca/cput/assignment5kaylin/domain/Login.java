package za.ca.cput.assignment5kaylin.domain;

public class Login
{
    private String username, password;

    private Login(){}

    private Login(Builder builder)
    {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}

    public static class Builder
    {
        private String username, password;

        public Builder username(String username)
        {
            this.username = username;
            return this;
        }
        public Builder password(String password)
        {
            this.password = password;
            return this;
        }
        public Login build() {
            return new Login(this);
        }

        @Override
        public String toString()
        {
            return "Username: " + username + " Password: " + password;
        }
    }
}
