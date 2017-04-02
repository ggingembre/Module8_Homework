/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public class Food {

    private String id;
    private String name;
    private Country country;
    private int expiration;

    /*
    Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.
    Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.
    */

    // hash and equal methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;

        Food food = (Food) o;

        return id.equals(food.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


    // get and set methods


    public String getId() {
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
}
