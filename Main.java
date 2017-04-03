import java.util.List;
import java.util.Set;

/**
 * Created by Guillaume Gingembre on 02/04/2017.
 */
public class Main {

    public static void main(String[] args) {

        // create 5 products
            Food magret = new Food("Magret", Country.FRANCE, 5);
            Food maplesyrup = new Food("Maple Syrup", Country.CANADA, 100);
            Food miso = new Food ("Miso", Country.JAPAN, 200);
            Food chips = new Food("Chips", Country.ENGLAND, 20);
            Food pelmeni = new Food("Pelmeni", Country.UKRAINE,5);
            Food baguette = new Food("Baguette", Country.FRANCE, 2);

        System.out.println(magret);
        System.out.println(maplesyrup);
        System.out.println(miso);
        System.out.println(chips);
        System.out.println(pelmeni);
        System.out.println(baguette);

        // Put them into the database

        ManageSystemFood testshop = new ManageSystemFood();
        testshop.save(magret,15);
        testshop.save(maplesyrup,10);
        testshop.save(miso,10);
        testshop.save(chips);
        testshop.save(pelmeni,5);
        testshop.save(baguette,1);

        System.out.println(testshop);

        // Test ManageSystemFood functions

        System.out.println("The result of your search by ID is: " + testshop.get(4));
        System.out.println("The price of " + magret.getName() + " is: " + testshop.getPrice(magret));

        Set productSet = testshop.getProducts();
        System.out.println("Here is the list of products in the database: " + productSet);

        List productPrices = testshop.getPrices();
        System.out.println("Prices in the databases are: " + productPrices);

        System.out.println("Now testing delete functions");
        testshop.delete(chips);
        testshop.deleteById(5);
        System.out.println(testshop);









    }
}
