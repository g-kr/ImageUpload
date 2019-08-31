package Model;

public class ImageUpload {
    private String mName;
    private String mImageUrl;

    public ImageUpload() {
        //empty constructor needed
    }

    public ImageUpload( String imageUrl) {


        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
