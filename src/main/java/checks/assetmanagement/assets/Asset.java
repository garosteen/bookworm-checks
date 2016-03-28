package checks.assetmanagement.assets;

public class Asset {

    private final String author, title, id;
    private final AssetType assetType;

    public Asset(String author, String title, AssetType assetType, String id) {
        this.author = author;
        this.title = title;
        this.assetType = assetType;
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public String getId() {
        return id;
    }
}
