package prototype;

import java.util.ArrayList;

public class WordDocument implements Cloneable {

    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("--------WordDocument构造函数---------");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument)super.clone();
            doc.mText = this.mText;
//            doc.mImages = this.mImages;//此处为浅拷贝，只是引用地址，没有真正创建一个新的对象
            doc.mImages = (ArrayList<String>)this.mImages.clone();
            return doc;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void showDocument(){
        System.out.println("---------Word Content Start---------");
        System.out.println("Text:"+mText);
        System.out.println("Image List:");
        for (String imageName:mImages){
            System.out.println("Image name : "+imageName);
        }
        System.out.println("---------Word Content End---------");
    }
}
