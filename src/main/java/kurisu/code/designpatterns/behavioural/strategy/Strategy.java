package kurisu.code.designpatterns.behavioural.strategy;

/**
 * Strategy Dessign Pattern
 * 
 * The Strategy pattern lets you implement a "dynamic algorithm" that varies 
 * independently from the clients that use it by adding as a parameter of AlgorithmType
 * 
 * In this example, the client class ImageStorer's only job, is to store a 
 * file image and NOTHING more. But what if you need to save to png instead of jpeg?
 * 
 * We decouple the compressing algorithm from the storage itself by implementing several 
 * types of image compresors.
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
