$(document).ready(function(){
	/**
	회원가입
	 */
	$("#memberInsertBtn").click(function(){
	
		const name = $("#name").val();
		const id = $("#id").val();
		const pw = $("#pw").val();
		
		//alert(name+":"+id+":"+pw);
		
		$.post("../memberInsert.jes",
			  {
			    name,
			    id,
			    pw
			  },
			  function(data, status){
			    alert(data);
			    window.close();
			  });
	});
	
	/**
	로그인 처리
	 */
	const login = $.cookie('logined');
	$("#msgDiv").html(login);
	
	$("#loginBtn").click(function(){	
		
		const id = $("#id").val();
		const pw = $("#pw").val();
		
		
		$.post("login.jes",
			  {			   
			    id,
			    pw
			  },
			  function(data, status){
				// {"name" : name} 을 js객체로 파싱 -> {name : name}
				const obj = JSON.parse(data);
				if(obj.name) {
					// 동적태그
					data = obj.name + "<input type='button' value='logout' id='logoutBtn' class='btn btn-primary'><input type='button' value='탈퇴' id='deleteBtn' class='btn btn-danger'>";	
					$.cookie("logined", data);	    
					$("#msgDiv").html(data);
				} else {
					alert(obj.msg);
					location.reload();
				}	
				
			  }
		);//end post() 
	});//end 로그인 처리
	
	/**
	로그아웃 처리
	 */
	$(document).on("click", "#logoutBtn", function(event) { //로그아웃 처리
	
		$.post("logout.jes",
			  {			   
			   
			  },
			  function(data, status){		  	
			  	
			  	$.removeCookie("logined");	    
				location.reload();						   
			  }
		);//end post() 
	});//end 로그아웃 처리

	/**
	회원탈퇴 처리
	 */
	$(document).on("click", "#deleteBtn", function(event) { //로그아웃 처리
		alert("정말 탈퇴하시겠습니까?")
		$.post("memberDelete.jes",
			  {			   
			   
			  },
			  function(data, status){		  	
			  	
			  	$.removeCookie("logined");	    
				location.reload();						   
			  }
		);
	});
	
	/**
	주문하기
	*/
	$("#orderBtn").click(function(){
		const confirm_data = confirm("다음과 같이 주문하시겠습니까?\n" + items);
		if(confirm_data) {
			
			let basket = $.cookie("basket");
			console.log(basket);
			
			$.post("../order.jes",
				basket,
				function(data){
					console.log(data);
					data = JSON.parse(data);
					if(data.order_group_no) {
						alert("주문 완료 : [주문번호]" + data.order_group_no);
						$.removeCookie("basket",{ path : '/'});	// 장바구니 쿠키 삭제
						window.opener.location.reload();
					} else {
						alert(data.msg);
					}
					window.close();
				}
				
			);
		}
	});
	
	///////// 장바구니 비우기
	$("#cancelBtn").click(function(){
		alert("장바구니를 모두 비웁니다");		
		$.removeCookie("basket", {path:'/'});// 장바구니 쿠키 삭제
		window.opener.location.reload();
		window.close();
		
	});
	
	/////////다른 상품 주문하기
	$("#anotherBtn").click(function(){		
		window.close();
	});

	
	/**
	장바구니 넣기
	 */
	// 쿠키 = 웹 브라우저 메모리에 저장되는 text, 객체를 저장시키지 못함
	$(".orderForm").click(function(event){
		console.log(event.target.name);
		let basket = $.cookie("basket");
		console.log(basket);
		
		if(basket) {	// 장바구니에 담겨있는 상태
		
			// 배열로 만들어주기 위한 parse
			// JSON 을 JavaScript 객체로 변환
			basket = JSON.parse(basket);
			let flag = true;
			
			basket.product.forEach(function(item, index){	// forEach는 수량을 더하기만 하게!
				if(item.name == event.target.name) { // 이미 장바구니에 담겨있는 상품일 때
					item.quantity += 1;
					flag = false;
					}
				});
				
				if(flag) {
					basket.product.push({name : event.target.name, quantity : 1}); // 새 품목 추가
				} 
			} else {		// 장바구니에 아무것도 담겨있지 않는 상태
				basket = {product:[{name : event.target.name, quantity : 1}]};
			}
		// stringify = JavaScript 값이나 객체를 JSON 문자열로 변환
		basket = JSON.stringify(basket);
		$.cookie("basket", basket, { path: '/' });
		
		window.open('html/orderForm.html', '_blank', 'width=600, height=400');
	
	});
	

});

	

	

