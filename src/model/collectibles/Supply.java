package model.collectibles;


import java.awt.Point;
import java.util.ArrayList;

import ai.MoveCreator;
import engine.Game;
import exceptions.*;
import javafx.scene.image.Image;
import model.characters.*;
import model.world.*;

public class Supply implements Collectible  {

	

	
	public Supply() {
		
	}

	@Override
	public void pickUp(Hero h) {
		MoveCreator.vis=new boolean[15][15];
		MoveCreator.bfs(h.getLocation().x,h.getLocation().y,600,-1);
		if(MoveCreator.suppliesLocations!=null) {
			if(MoveCreator.suppliesLocations.contains(h.getLocation())) {
				MoveCreator.suppliesLocations.remove(h.getLocation());
			}
			for(Point p : MoveCreator.suppliesLocations) {
				MoveCreator.vis=new boolean[15][15];
				MoveCreator.bfs(p.x, p.y, 600,1);
			}
		}
		
		
		h.getSupplyInventory().add(this);
	}

	@Override
	public void use(Hero h) throws NoAvailableResourcesException {
		h.getSupplyInventory().remove(this);	
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return new Image("images//supply.png",700,700,true,true);
	}
	
		

}
