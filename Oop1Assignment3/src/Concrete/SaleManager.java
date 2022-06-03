package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{
	public void Sale(Customer customer, Game game, Campaign campaign)
    {
       System.out.println(game.name + " adli Oyun "+customer.firstName+" isimli musteriye, "+
            campaign.name + " kampanyasi ile "+ game.price+" TL yerine "+(game.price-(campaign.discount*game.price/100)) +" TL ile satilmistir.");
    }

    public void Sale(Customer customer, Game game)
    {
    	System.out.println(game.name + " adli Oyun " + customer.firstName + " isimli musteriye, " +
                game.price+" Tl ile satilmistir.");
    }
}
