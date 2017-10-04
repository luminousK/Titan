package external;

import java.util.List;

import entity.Item;
import entity.Item.ItemBuilder;

public interface ExternalAPI {
	public List<Item> search(double lat, double lon, String term);
}

