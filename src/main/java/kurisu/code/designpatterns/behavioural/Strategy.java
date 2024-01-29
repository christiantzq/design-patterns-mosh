package kurisu.code.designpatterns.behavioural;

/**
 * Similar to State pattern, but does not hold a single state??
 * 
 */
public class Strategy {
    public void test() {
        new ImageStorage()
            .storeImage("my-image-A", new GrayscaleFilter(), new PngCompresor());
            
        new ImageStorage()
            .storeImage("my-image-B", new BrightnessFilter(), new JpegCompresor());
    }
}

/**
 * This is a class that stores an image after appying its filters to it.
 */
class ImageStorage {
    private ImageFilter filter;
    private ImageCompresor compresor;

    public void storeImage(String imagepath, ImageFilter filter, ImageCompresor compresor) {
        this.compresor = compresor;
        this.compresor.compress(imagepath);
        this.filter = filter;
        this.filter.filter(imagepath);
        System.out.println("Image [" + imagepath + "] saved.");
    }
}

/**
 * Interface A with two implementations
 */
interface ImageCompresor {
    void compress(String imagepath);
}

class PngCompresor implements ImageCompresor {
    @Override
    public void compress(String imagepath) {
        System.out.println("Image [" + imagepath + "] was compresed as PNG.");
    }
}

class JpegCompresor implements ImageCompresor {
    @Override
    public void compress(String imagepath) {
        System.out.println("Image [" + imagepath + "] was compresed as JPEG.");
    }
}

/**
 * Interface B with two implementations
 */
interface ImageFilter {
    void filter(String imagepath);
}

class GrayscaleFilter implements ImageFilter {
    @Override
    public void filter(String imagepath) {
        System.out.println("Image [" + imagepath + "] is now grayscaled.");
    }
}

class BrightnessFilter implements ImageFilter {
    @Override
    public void filter(String imagepath) {
        System.out.println("Image [" + imagepath + "] has changed its brightness.");
    }
}