package model.collectibles;


import java.awt.Point;
import java.util.ArrayList;

import ai.MoveCreator;
import engine.Game;
import exceptions.*;
import javafx.scene.image.Image;
import model.characters.*;
import model.world.*;
import views.scenes.GameScene;

public class Vaccine implements Collectible {

	public Vaccine() {
		
	}

	@Override
	public void pickUp(Hero h) {
		MoveCreator.vis=new boolean[15][15];
		MoveCreator.bfs(h.getLocation().x,h.getLocation().y,3000,-1);
		if(MoveCreator.vaccinesLocations!=null) {
			if(MoveCreator.vaccinesLocations.contains(h.getLocation())) {
				MoveCreator.vaccinesLocations.remove(h.getLocation());
			}
			for(Point p : MoveCreator.vaccinesLocations) {
				MoveCreator.vis=new boolean[15][15];
				MoveCreator.bfs(p.x, p.y, 3000,1);
			}
		}
		h.getVaccineInventory().add(this);
		
	}

	@Override
	public void use(Hero h) throws NoAvailableResourcesException {
		h.getVaccineInventory().remove(this);
		Zombie z = (Zombie) h.getTarget();
		Game.zombies.remove(z);
		Hero hero = Game.availableHeroes.remove(0);
		((CharacterCell) Game.map[(int) z.getLocation().getX()][(int) z.getLocation().getY()]).setCharacter(hero);
		Game.heroes.add(hero);
		hero.setLocation(z.getLocation());
		GameScene.gridPane.setAt(z.getLocation().x, z.getLocation().y, hero.getImage());
		Hero.setHeroLit(hero);
	}

	@Override
	public Image getImage() {
		
		return new Image("images//vaccine.png",700,700,true,true);
	}

}
