$(document).ready(function(){
    $("#signup").click(function () { 
        var fullname=$("#fullname").val();
        var email=$("#email").val();
        var pwd=$("#pwd").val();

        $.post("add",{
            fullname:fullname,
            email:email,
            pwd:pwd,
        },function(response){
            alert(response);
        });
    });
});