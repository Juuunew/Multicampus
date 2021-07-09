package my.jes.web;

import java.io.BufferedReader;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.jes.web.service.OrderService;
import my.jes.web.vo.MemberVO;
import my.jes.web.vo.OrderVO;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	/**
	 * 주문 처리
	 */
	@ResponseBody
	@RequestMapping(value = "order.jes", method = {RequestMethod.POST}, produces = "application/text; charset=utf8")
	public String order(HttpServletRequest request, HttpServletResponse response){
		JSONObject json = new JSONObject();
		try {
			BufferedReader br = request.getReader();
			JSONParser parser = new JSONParser();
			
			JSONObject json2 = (JSONObject) parser.parse(br);
			// product = 배열을 가르킴
			JSONArray array = (JSONArray) json2.get("product");
			
			// java object 배열로 변경
			Object[] array2 = array.toArray();
			
			// for문 돌리기전에 담아둘 배열
			ArrayList<OrderVO> list = new ArrayList<OrderVO>();
			
			for(Object o : array2) {
				JSONObject j = (JSONObject) o;
				String prodname = (String) j.get("name");
				long quantity = (Long) j.get("quantity");
				
				OrderVO orderVO = new OrderVO("web", prodname, quantity);
				HttpSession session = request.getSession();
				MemberVO memberVO = (MemberVO) session.getAttribute("member");
				
				if(memberVO != null) {
					orderVO.setMemberid(memberVO.getId());
				} else {
					orderVO.setMemberid("");
				}
				list.add(orderVO);
			}
			
			System.out.println("총" + list.size() + "개 품목을 주문합니다.");
			long order_group_no = orderService.ordersInsert(list);
			
			json.put("order_group_no", order_group_no);
		
		} catch(Exception e) {
			e.printStackTrace();
			json.put("msg", e.getMessage());
		}
		
		return json.toJSONString();
	}
	
}
