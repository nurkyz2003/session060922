package Tapshyrma5;

import java.util.Comparator;

public class Country {
    private int id, gdp, population;
    private String name;

    public Country(int id, int gdp, int population, String name) {
        this.id = id;
        this.gdp = gdp;
        this.population = population;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Country> sortByName = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Country> sortById = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o2.id - o1.id;
        }
    };
    public static Comparator<Country> sortByPopulation = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.population - o2.population;
        }
    };
    public static Comparator<Country> sortByGdp = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.gdp - o2.gdp;
        }
    };

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", gdp=" + gdp +
                ", population=" + population +
                ", name='" + name + '\'' +
                '}';
    }
}
