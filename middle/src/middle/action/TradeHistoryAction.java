package middle.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ListModel;

import middle.model.Deal;
import middle.service.MypageService;

public class TradeHistoryAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int buyer_id = 2;
		List<Deal> buyList = service.buyhistoryService(buyer_id/*Integer.parseInt(request.getParameter("buyer_id"))*/);
		List<Deal> sellList = service.sellhistoryService(Integer.parseInt(request.getParameter("user_id")));
		request.setAttribute("sellList",sellList);
		request.setAttribute("buylist", buyList);
		forward.setRedirect(false);
		forward.setPath("/views/trade_history.jsp");
		return forward;
	}

}
