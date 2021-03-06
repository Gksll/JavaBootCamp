import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
	            customer.firstName="Göksel";
	            customer.birthYear="1994";
	            customer.nationalityId="21040181962";
	            customer.lastName="Doğan";

	            CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
	            customerManager.Add(customer);
	            customerManager.Update(customer);
	            customerManager.Delete(customer);

	            System.out.println("---------");

	            Campaign campaign = new Campaign();
	            		 campaign.id=1; campaign.name="Herkes oyun oynasın!";campaign.discount=90;
	            CampaignManager campaignManager = new CampaignManager();
	            campaignManager.Add(campaign);
	            campaignManager.Update(campaign);
	            campaignManager.Delete(campaign);

	            System.out.println("---------");

	            Game game = new Game(); 
	            game.id=1;
	            game.name="Far Cry 13";
	            game.price=316;
	            GameManager gameManager = new GameManager();
	            gameManager.Add(game);
	            gameManager.Update(game);
	            gameManager.Delete(game);

	            System.out.println("---------");

	            SaleManager saleManager = new SaleManager();
	            saleManager.Sale(customer, game, campaign);
	            saleManager.Sale(customer, game);

	        }
	}


