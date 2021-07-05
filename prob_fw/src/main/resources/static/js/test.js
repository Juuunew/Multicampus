$(document).ready(function(){
	$("#login_btn").click(function(){
		const id=$("#id").val();
		const pw=$("#pw").val();
		alert(id + " : " + pw);
		$.post(
			"loginById",
			{id, pw},
			function(data, status) {
				data = JSON.parse(data);
				if(data.login) {
					alert("ID 또는 PW를 확인해주세요");
				} else {
					alert("Data : " + data.id + "님 login ok \nStatus :" + status);
				}
			}
		);

	});
});