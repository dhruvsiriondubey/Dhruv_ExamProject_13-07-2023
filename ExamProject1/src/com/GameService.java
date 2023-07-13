package com;

import java.util.ArrayList;
import java.util.List;

public class GameService {
	ArrayList<Game> games = new ArrayList<Game>();
	static GameService g = new GameService();

	private GameService() {
		games.add(new Game("SnowBird", "Danny", 300));
		games.add(new Game("FreshFood", "Ram", 450));
		games.add(new Game("Batsman", "Kate", 400));
		games.add(new Game("Pokiman", "Steeve", 600));
		games.add(new Game("YammyTommy", "Narayan", 350));
	}

	static List<Game> viewAll() {
		return g.games;
	}

	static String authorSearch(String author) {
		String val = "NOT FOUND";
		for (Game x : g.games) {
			if (x.getAuthorName().toLowerCase().equalsIgnoreCase(author)) {
				val = x.getGameName();
				break;
			}
		}
		return val;

	}
}
