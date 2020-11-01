
package webcamm;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Mr__.Solanki
 */
public class Webcamm {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        
        webcam.open();
        
        BufferedImage image = webcam.getImage();
        ImageIO.write(image, "JPG", new File("first.jpg"));
    }
    
}
