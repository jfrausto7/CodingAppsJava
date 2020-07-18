import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.FFT;

public class MusicVisualizer extends PApplet {
    private Minim minim;
    private AudioPlayer audio;
    private FFT fft;

    //the vertical center of the window
    private int yCenter;
    private int xCenter;

    //colors that we will use
    private final int blue = color(20,50,200);
    private final int green = color(20,200,50);


    public static void main(String[] args){
        PApplet.main("MusicVisualizer");
    }

    public void settings() {
        size (1000, 500);
    }

    public void setup() {
        background(0);

        //setup audion with minim
        minim = new Minim(this);
        audio = minim.loadFile("resources/piano.mp3");

        //loop the audio
        audio.loop();

        //assign value to yCenter
        yCenter = height / 2;

        //assign value to xCenter
        xCenter = width / 2;

        //for pulsating orb
        fft = new FFT(audio.bufferSize(), audio.sampleRate());


    }

    public void draw() {
        //fill the background with black. Will erase anything from previous steps
        background(0);

        //convert each channel to an array so that we can use it
        float[] leftChannel = audio.left.toArray();
        float[] rightChannel = audio.right.toArray();

        //loop through every sample
        for(int i = 0; i < leftChannel.length - 1; i++){
            drawChannel(leftChannel, i, -1, blue);
            drawChannel(rightChannel, i, 1, green);
        }

        //orb
        fft.forward(audio.mix);

        //draw circle
        for (int i = 0; i < fft.specSize(); i++) {
            drawFrequency(i);
        }
    }

    private void drawChannel(float[] channel, int index, int direction, int color){

        //set stroke weight to 2
        strokeWeight(2);

        //draw a very short line representing the channel at the specific index

        for (int i = 1; i <= 3; i++) {
            //set color
            stroke(color, (float) 100 / sq(i));
            line(index,
                    yCenter + (direction * abs(channel[index] * (150 * sq(i)))),
                    index + 1,
                    yCenter + (direction * abs(channel[index + 1] * (150 * sq(i)))));
        }

    }

    private void drawFrequency(int index){
        //set fill and stroke
        stroke(255,0);

        for(int i = 1; i <= 3; i++) {
            fill(255, (float) 100/sq(i));

            //actually draw the circle
            circle(xCenter, yCenter, fft.getBand(index) * 3);
        }
    }

}
