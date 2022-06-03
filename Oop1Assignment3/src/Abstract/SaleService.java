package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	 void Sale(Customer customer, Game game, Campaign campaign);
     void Sale(Customer customer, Game game);
}
