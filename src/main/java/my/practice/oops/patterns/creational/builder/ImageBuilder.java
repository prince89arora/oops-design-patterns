package my.practice.oops.patterns.creational.builder;

/**
 * @author prince arora
 */
public class ImageBuilder {

    private Image image;

    private ImageBuilder() {
        this.image = new Image();
    }

    public static ImageBuilder newBuilder() {
        return new ImageBuilder();
    }

    public ImageBuilder path(String path) {
        this.image.setPath(path);
        return this;
    }

    public ImageBuilder size(long size) {
        this.image.setSize(size);
        return this;
    }

    public ImageBuilder height(int height) {
        this.image.setHeight(height);
        return this;
    }

    public ImageBuilder width(int width) {
        this.image.setWidth(width);
        return this;
    }

    public ImageBuilder type(String type) {
        this.image.setType(type);
        return this;
    }

    public Image build() {
        return this.image;
    }
}
