package structure.proxy;

public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;

    @Override
    public String getName() {
        System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }
}
