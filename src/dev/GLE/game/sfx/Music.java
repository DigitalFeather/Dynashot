package dev.GLE.game.sfx;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Music {

    public void playMusic(String musicLocation){

        try
        {
            File musicPath = new File(musicLocation);

            if(musicPath.exists()){
                AudioInputStream audioInput  = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                //JOptionPane.showMessageDialog(null, "Press ok to stop playing");


            } else {
                System.out.println("Cannot find music");
                return;
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

}
