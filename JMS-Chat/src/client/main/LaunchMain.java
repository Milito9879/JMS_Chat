package client.main;

import java.awt.EventQueue;

import client.controller.ChatClientController;
import client.gui.JFrameMainWindow;

public class LaunchMain {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMainWindow frame = new JFrameMainWindow(new ChatClientController());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}