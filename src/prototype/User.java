package prototype;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        WordDocument document = new WordDocument();

        document.setmText("这tm是一篇假文档");
        ArrayList<String> images = new ArrayList<>();
        images.add("Image1");
        images.add("Image2");
        images.add("Image3");
        images.add("Image4");
        document.setmImages(images);

        WordDocument document2 = document.clone();
        images.add("Image5");
        document.setmImages(images);
        document2.showDocument();

        document.showDocument();
    }
}
