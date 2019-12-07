package adapter;

public class Adapter extends BaiduMap {
    private GoogleMap map;

    public Adapter(GoogleMap map) {
        this.map = new GoogleMap();
    }

    @Override
    public void navigation() {
        super.navigation();
        map.location();
    }
}
