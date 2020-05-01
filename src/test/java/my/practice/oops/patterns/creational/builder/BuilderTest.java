package my.practice.oops.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author prince arora
 */
public class BuilderTest {

    private Image image = new Image();

    public void setup() {
        this.image.setPath("/test/image.jpg");
        this.image.setType("jpg");
        this.image.setSize(10000000);

    }


    @Test
    public void builder_Test() {
        Image newImage = ImageBuilder.newBuilder()
                                    .path(this.image.getPath())
                                    .size(this.image.getSize())
                                    .type(this.image.getType())
                                    .build();

        Assert.assertEquals(image.getPath(), newImage.getPath());
        Assert.assertEquals(image.getType(), newImage.getType());
        Assert.assertEquals(image.getSize(), newImage.getSize());
    }
}
