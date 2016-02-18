package com.estrelsteel.engine1.maps;

import com.estrelsteel.engine1.tile.Tile;
import com.estrelsteel.engine1.tile.TileType;
import com.estrelsteel.engine1.world.Location;
import com.estrelsteel.engine1.world.World;
import com.estrelsteel.engine1.tile.shrine.Shrine;
import com.estrelsteel.engine1.tile.shrine.Team;

public class Lobby extends Map {
	public World load1(World world) {
		world.addTile(new Tile(TileType.SHRINE, new Location(0, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-192, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(-128, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(0, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(128, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE, new Location(192, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(0, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(0, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(0, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, -192, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, -128, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, -64, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 0, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 0, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 64, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 128, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 192, 64, 64, 270.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-192, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-128, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(-64, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(0, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(0, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(64, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(128, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 192, 64, 64, 180.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 192, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 128, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 64, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 0, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 0, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, 0, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, -64, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, -128, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.SHRINE_EDGE, new Location(192, -192, 64, 64, 90.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-192, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, 192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(192, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, -192, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-128, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, -128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, -64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, 0, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(128, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(-64, 128, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(0, 64, 64, 64, 0.0), false, null));
		world.addTile(new Tile(TileType.FILTER_GOLD, new Location(64, 0, 64, 64, 0.0), false, null));
		return world;
	}
}