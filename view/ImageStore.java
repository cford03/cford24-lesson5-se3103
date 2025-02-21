package view;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.File;


import javax.imageio.ImageIO;

public class ImageStore {

    public static final BufferedImage stadiumImage;
    public static final BufferedImage stadiumImageSelected;

    static{
        int size = AppWindow.SIZE;
        stadiumImage = readImage(
            "cford24-lesson5-se3103-main/view/images/stadium_image_file.png",size*3, size, 0.4f);
        stadiumImageSelected = readImage(
            "cford24-lesson5-se3103-main/view/images/stadium_image_file.png",size*3, size, 1.0f);

    }
    
    public static BufferedImage readImage(String path, int width, int height, float alpha){
        try{
            BufferedImage originalImage = ImageIO.read(new File(path));
            Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = resizedImage.createGraphics();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
            g2.drawImage(tmp,0,0,null);
            g2.dispose();
            return resizedImage;
        }catch(Exception e){
            System.out.println("Image file load error");
            return null;
        }

    }
}
