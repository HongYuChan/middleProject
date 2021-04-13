package middle.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

import middle.model.Product;
import middle.model.StreamDAO;
import middle.model.Video;


public class StreamService {
	private static StreamService service = new StreamService();
	private static StreamDAO dao;
	
	public static StreamService getInstance() {
		dao = StreamDAO.getInstance();
		return service;
	}
	
	public Video streamingService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("UTF-8");
		Video video = new Video();
		int seq = 0;
		video = dao.streamBoard(seq);
		
		return null;
	}
	
	public int insertVideoService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("UTF-8");
		String webPath = request.getServletContext().getRealPath("/videos");
		System.out.println(webPath);
//		C:\\Users\\KOSTA\\eclipse-workspace\\testProject\\WebContent\\videos
		String uploadPath = webPath;
		int maxPostSize = 1024 * 1024 * 1500;
		MultipartRequest videoName = new MultipartRequest(request, uploadPath, maxPostSize);
		
		Video video = new Video();
		
		
		if(videoName.getFilesystemName("fname") != null) {
			String fname = (String)videoName.getFilesystemName("fname");
		}
		
		
		return dao.insertVideo(video);
	}
	
	public int insertProductService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		String webPath = request.getServletContext().getRealPath("/videos");
		MultipartRequest multi = new MultipartRequest(request, webPath);
		
		Product product = new Product();
		product.setProduct_name(multi.getParameter("product_name"));
		product.setTitle(multi.getParameter("title"));
		product.setProduct_info(multi.getParameter("product_info"));
		product.setMin_price(Integer.parseInt(multi.getParameter("min_price")));
		product.setPay_method(multi.getParameter("pay_method"));
		product.setSale_date(multi.getParameter("sale_date"));
		
		return dao.insertProduct(product);
	}
	
}
