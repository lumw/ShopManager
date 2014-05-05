$(document).ready(function(){
	var pathValue = $("#pathValue").val();
	var loginForm = $("form[id=loginForm]");
	loginForm.attr("action","login.action");
	loginForm.attr("method","post");
	
	var registerForm = $("form[id=registerForm]");
	registerForm.attr("action","register.action");
	registerForm.attr("method","post");
});