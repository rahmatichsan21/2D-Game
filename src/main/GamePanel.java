package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	//Screen Settings
	final int OriginalTileSize = 16; //Tile ukuran 16x16
	final int Scale = 3;
	final int TileSize = OriginalTileSize * Scale; //Ukuran 48x48
	final int MaxScreenCol = 16;
	final int MaxScreenRow = 12;
	final int ScreenWidth = TileSize * MaxScreenCol;
	final int ScreenHeight = TileSize * MaxScreenRow;
	
	Thread GameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight)); //Ukuran layar
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); //Untuk rendering yang lebih baik
		
	}
	
	public void StartGameThread() {
		GameThread = new Thread(this);
		GameThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
