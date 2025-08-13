import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("..............................................");
        System.out.println("           !!!!!!!!H I!!!!!!!!!!!!            ");
        System.out.println("................................................");

        String filepath1="src\\dan_da_dan.wav";
        String filepath2="src\\demon_slayer.wav";
        String filepath3="src\\naruto_sama.wav";
        String filepath4="src\\one_piece_ringtone.wav";

        File file1=new File(filepath1);
        File file2=new File(filepath2);
        File file3=new File(filepath3);
        File file4=new File(filepath4);

        try{
            AudioInputStream audio1= AudioSystem.getAudioInputStream(file1);
            AudioInputStream audio2= AudioSystem.getAudioInputStream(file2);
            AudioInputStream audio3= AudioSystem.getAudioInputStream(file3);
            AudioInputStream audio4= AudioSystem.getAudioInputStream(file4);

            System.out.println("Enter your desired song to play from the player:");
            System.out.println("1.DANDADAN\n"+
                    "2.DEMON SLAYER\n" +
                    "3.NARUTO\n"
            +"4.ONE PIECE\n");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice) {
                case 1:
                    Song(audio1,"DANDADAN");
                    break;
                case 2:
                    Song(audio2,"DEMON SLAYER");
                    break;
                case 3:
                    Song(audio3,"NARUTO");
                    break;
                case 4:
                    Song(audio4,"ONE PIECE");
                    break;
                default:
                    System.out.println("Please enter the valid choice;:)");
                    break;
            }
        }
        catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void Song(AudioInputStream audio,String music){
        try {
            Clip clip=AudioSystem.getClip();
            clip.open(audio);

            System.out.println("YOU CAN:\n" +
                    "1.PLAY\n"+"2.PAUSE\n"+"3.RESUME\n"+"4.STOP\n"+"5.RESTART\n"+"6.LOOP\n"+"7.EXIT\n");
            String choose=" ";
            Scanner s=new Scanner(System.in);

            while(!choose.equals("EXIT")){
                choose=s.nextLine().toUpperCase();

                switch(choose){
                    case "PLAY":
                        System.out.println("YOUR DESIRED SONG " + music + " IS PLAYING");
                        clip.setFramePosition(0);
                        clip.start();
                        break;
                    case "PAUSE":
                        clip.stop();
                        System.out.println("THE SONG IS PAUSED");
                        break;
                    case "RESUME":
                        clip.start();
                        System.out.println("THE SONG IS CONTINUED");
                        break;
                    case "RESTART":
                        clip.setFramePosition(0);
                        clip.start();
                        System.out.println("THE SONG IS RESTARTED");
                        break;
                    case "STOP":
                        clip.stop();
                        clip.setFramePosition(0);
                        System.out.println("THE MUSIC IS STOPPED PLAYING");
                        break;
                    case "LOOP":
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                        clip.start();
                        System.out.println("THE MUSIC IS IN LOOP");
                        break;
                    case "EXIT":
                        System.out.println("THANK YOU FOR LISTENING ....");
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                        break;
                }
            }

        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("..............................................");
            System.out.println("           ////////B Y E ///////////          ");
            System.out.println("................................................");
        }

    }
}