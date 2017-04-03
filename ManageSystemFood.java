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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "The database contains the following entries:\n" );
        for ( Map.Entry <Food, Double> database : database.entrySet ( ) )
            sb.append("Product ").append ( database.getKey ( ) ).append ( " Price: " ).
                    append ( database.getValue ( ) ).append ( "\n" );
        return sb.toString ( );
    }

    public String printDatabase () {
        return toString ( );
    }


    // sorting the database:

    @Override
    public void printProductsSortedByName () {
        Map <Food, Double> sortedByNameDatabase = new TreeMap <> ( ( o1, o2 ) -> o1.getName ( ).compareTo ( o2.getName ( ) ) );
        sortedByNameDatabase.putAll ( database );
        System.out.println ( "Products sorted by name:" + sortedByNameDatabase );
    }

    @Override
    public void printProductsSortedByPrice () {
        List <Map.Entry <Food, Double>> sortedByPriceDatabase = new ArrayList <> ( database.entrySet ( ) );
        sortedByPriceDatabase.sort ((o1,o2) -> o1.getValue().compareTo(o2.getValue()));
        System.out.println ( "Products sorted by price:" );
        for ( Map.Entry <Food, Double> entry : sortedByPriceDatabase )
            System.out.println ( entry.getKey ( ).toString ( ) + " Price: " + entry.getValue ( ) );
    }

}
