$(document).ready(function(){
    $("#login").click(function () { 
        var email=$("#email").val();
        var pwd=$("#pwd").val();

        $.post("login",{
     	      email:email,
            pwd:pwd,
        },function(response){
	
            if(response=="valid"){
                location.href='http://localhost:8287/class_7.0_/';
            }else{
                alert("not valid user")
            }
        });
    });
});