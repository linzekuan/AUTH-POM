<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>统一登录</title>
    <link rel="stylesheet" type="text/css" href="./assets/login/css/login.css" />
	
</head>

<body>
    <div class="main">
        <div class="container">
            <div class="login">
                <div class="login_cont">
                    <h3>统一登录</h3>
                    <form action='login' method = "post" id="login_form">

                        <input id="encrypedPwd" name="password" type="hidden" />

                        <label for="name">账户名</label>
                        <input id="name" class="name" type="text" name="username" placeholder="请输入邮箱或手机号码">
                        <i class="reg f_name"></i>
                        <label for="pwd">密码</label>
                        <input id="pwd" class="pwd" type="password" placeholder="请填入密码">
                        <i class="reg f_pwd"></i>
                        <div class="clearfix"></div>

					</form>
					<div class="btn">
                        <button class="loginBtn" id="btn-login">登录</button>
                    </div>
                    <div class="clearfix"></div>
                    <div class="errorMessage">
                        <#if errorMessage ??>
                            ${errorMessage}
                        </#if>
                    </div>
                 </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="footer container">
        <p>Copyright © 2017 - . All Rights Reserved 版权所有</p>
    </div>
    <script src="./assets/jquery.min.js"></script>
    <script src="./assets/security.js"></script>
    <script>
           $(document).ready(function(){


               $("#btn-login").click(function(){
                  $("#login_form").submit();
                   return;
               })
           })
       </script>
</body>

</html>
