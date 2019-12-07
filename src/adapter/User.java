package adapter;

public class User {
    public static void main(String[] args) {
        BaiduMap map = new BaiduMap();
        map.navigation();

        Adapter adapter = new Adapter(new GoogleMap());
        adapter.navigation();
    }
}
