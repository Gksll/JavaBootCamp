package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
System.out.println(game.name + " adli oyun basariyla eklendi !");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.name + " adli oyun basariyla guncellendi !");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.name + " adli oyun  silindi !");
		
	}

}
