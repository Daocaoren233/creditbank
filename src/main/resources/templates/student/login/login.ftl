<html>
<#include "../../common/header.ftl">
<body>


<div class="login">
    <div class="login-head">
        登录
    </div>
<#--    <div class="login-input">-->
<#--        学号：-->
<#--        <input><br>-->
<#--        密码：-->
<#--        <input><br>-->
<#--        <button></button>-->
<#--        <button></button>-->

<#--    </div>-->
    <div class="login-input">
        <form role="form" method="post" action="/creditbank/student/login/save">
            <div class="form-group">
                &nbsp;学号:
                <input name="studentId" type="text" class="form-control" value="">
            </div>
            <div class="form-group" >
                &nbsp;密码:
                <input name="passWord" type="password" class="form-control" value="">
            </div>
            &nbsp;&nbsp;
            <button type="reset" class="btn btn-default">重置</button>
            &nbsp;&nbsp;
            <button type="submit" class="btn btn-default">提交</button>
        </form>
    </div>
    <div class="login-tail">
        <br><br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a>
            新用户注册
        </a>
    </div>

</div>

</body>
<script src="../../static/plugins/jquery/JavaScript.min.js"></script>
<script src="../../static/plugins/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</html>