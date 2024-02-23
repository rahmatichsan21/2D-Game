package main;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		//window settings
		JFrame window = new JFrame(); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Untuk Exit
		window.setResizable(false); // Agar layar tidak dapat di ubah ukurannya
		window.setTitle("Gabutt"); // Nama window
		
		GamePanel gamepanel = new GamePanel();
		window.add(gamepanel);
		
		window.pack(); //Agar windownya sized to fit
		
		window.setLocationRelativeTo(null); // Agar window ada di tengah
		window.setVisible(true); // Agar window dapat di lihat
		
	}
}
