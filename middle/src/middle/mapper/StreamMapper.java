package middle.mapper;

import middle.model.Product;
import middle.model.Video;

public interface StreamMapper {
	Video streamBoard(int seq);
	int insertVideo(Video video);
	int insertProduct(Product product);
}
