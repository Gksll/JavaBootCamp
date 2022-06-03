package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya basariyla eklendi"+campaign.name);
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya basariyla guncellendi"+campaign.name);
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya basariyla silindi"+campaign.name);
		
	}

}
