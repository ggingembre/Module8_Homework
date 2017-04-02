import java.util.*;

/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public class ManageSystemFood implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<>();

    @Override
    public Food save(Food food, double price){
        database.put(food,price);
        return food;
    }

    @Override
    public Food save(Food food){
        database.put(food,0.0);
        return food;
    }

    @Override
    public void delete(Food food){
        database.remove(food);
    }

    @Override
    public void deleteById(int id){
        Set<Food> set = database.keySet ( );
        set.removeIf ( t -> t.getId() == id );
    }

    @Override
     public Food get ( int id ) {
        Set <Food> set = database.keySet ( );
        for ( Food food : set ) {
            if (food.getId ( ) == id)
                return food;
        }
        return null;
    }

    @Override
    public Double getPrice ( Food food ) {
        return (food == null)? null : database.get ( food );
    }

    @Override
    public Set <Food> getProducts () {
        return database.keySet ( );
    }

    @Override
    public List<Double> getPrices () {
        return new ArrayList<>( database.values ( ) );
    }


}
