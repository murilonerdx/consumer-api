package application.dominio;

public class Endereco{
    String id;
    String abbreviation;
    String city;
    String conference;
    String division;
    String full_name;
    String name;

    public Endereco(String[] lista){
        this.id = lista[0];
        this.abbreviation = lista[1];
        this.city = lista[2];
        this.conference = lista[3];
        this.division = lista[4];
        this.full_name = lista[5];
        this.name = lista[6];
    }
    public Endereco(){}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +
                "," + abbreviation+
                "," + city +
                "," + conference +
                "," + division+
                "," + full_name +
                "," + name;
    }
}
