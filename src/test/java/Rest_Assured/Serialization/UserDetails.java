package Rest_Assured.Serialization;

public class UserDetails {
    private String name;
    private String Job,Company;
    private String[] skills;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    protected UserDetails(String name, String Job, String Company,String[] skills){
        this.name=name;
        this.Job=Job;
        this.Company=Company;
        this.skills=skills;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return Job;
    }

    public String getCompany() {
        return Company;
    }
}
