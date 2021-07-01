$(document).ready(function() {
	$("#loginBtn").click(function(){
		const id = $("#id").val();
		const pw = $("#pw").val();
		
		$.post(
			"loginById",
			{id,pw},
			function(data) {
				data = JSON.parse(data);
				if(data.id) {
					$("#welcomeMsg").html(data + " 님 환영합니다.");
				} else {
					alert("ID 또는 Pw 를 확인해주세요.");
				}
			}
		);
	});
});