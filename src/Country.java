public class Country {
    private String name;
    private String cityName;

    public Country(String name, String cityName){
        this.name = name;
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public String getCityName() {
        return cityName;
    }
}
