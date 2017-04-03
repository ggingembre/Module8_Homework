/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public class Food {

    private long id;
    private String name;
    private Country country;
    private int expiration;

    /*
    Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.
    Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.
    */

    // constructor with all fields

    public Food(String name, Country country, int expiration) {
        setId();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }


    // hash and equal methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;

        Food food = (Food) o;

        return id == (food.id);
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    // get and set methods
    public long getId() {
        return id;
    }

    public void setId() {
        this.id = IdGenerator.createID();;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    // print method


    @Override
    public String toString() {
        return "ID: " + id + "; Product name: " + name + "; Country: " + country + "; Days to expiration: " + expiration
                + ".";
    }
}
