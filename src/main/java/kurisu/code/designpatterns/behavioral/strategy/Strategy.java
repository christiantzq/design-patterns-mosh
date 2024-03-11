package kurisu.code.designpatterns.behavioral.strategy;

/**
 * Strategy Design Pattern
 * 
 * Enables you to decouple logic that diverges from the single responsibility principle
 * in a given class AND It also allows that logic to be dynamic by defining a set of 
 * Algorithm-Type objects which will be passed to the method as a parameter.
 * 
 * For example, a class ImageStorer has the only job of storing an image file and 
 * NOTHING more, but what if you need to save to png instead of jpeg?
 * 
 * We can decouple the compressing algorithm from the storage itself by implementing several 
 * types of image compressors and passing them to the save() method as parameter.
 */
public class Strategy {
    public static void main(String[] args) {
        new ImageStorer()
            .storeImage("spiderman", new PngCompresor());
            
        new ImageStorer()
            .storeImage("batman", new JpegCompresor());
        
    }
}

/**
 * The ImageStorer saves an image after appying a compresor algorithm dynamicaly.
 * 
 * Latter we can add more compresors without affecting its functionality.
 */
class ImageStorer {    
    private ImageCompressor compressor;

    public void storeImage(String imagepath, ImageCompressor compresor) {
        this.compressor = compresor;
        this.compressor.compress(imagepath);
        System.out.println("Image [" + imagepath + "] saved.");
    }
}

/**
 * Interface of the Algorithm-Type.
 * 
 * Defines what the dynamic algorithm should do.
 */
interface ImageCompressor {
    void compress(String imagepath);
}

/**
 * Concrete algorithm immplementation
 */
class PngCompresor implements ImageCompressor {
    @Override
    public void compress(String imagepath) {
        System.out.println("Compressing image [" + imagepath + "] as PNG.");
    }
}

/**
 * Concrete algorithm immplementation
 */
class JpegCompresor implements ImageCompressor {
    @Override
    public void compress(String imagepath) {
        System.out.println("Compressing image [" + imagepath + "] as JPEG.");
    }
}
