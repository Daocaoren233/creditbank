<html>
<#include "../../common/header.ftl">
<body>
<div class="container-fluid">
<#--    <div class="container">-->
<#--        <form role="form" method="post" action="/creditbank/student/login/save">-->
<#--            <div class="form-group">-->
<#--                <label for="exampleInputEmail1">学号</label>-->
<#--                <input name="studentId" type="text" class="form-control">-->
<#--            </div>-->

<#--            <div class="form-group">-->
<#--                <label for="exampleInputEmail1">密码</label>-->
<#--                <input name="passWord" type="password" class="form-control">-->
<#--            </div>-->
<#--            <div class="row">-->
<#--                <div class="col-sm-10 column"></div>-->
<#--                <div class="col-sm-2 column">-->
<#--                    <button type="submit" class="btn btn-default">提交</button>-->
<#--                </div>-->
<#--            </div>-->
<#--        </form>-->
<#--    </div>-->
    <div class="row clearfix" style="margin-top: 100px">
        <div class="col-sm-4 column"></div>
        <div class="col-sm-4 column">
            <h3>商家登录:</h3>
            <form role="form" method="post" action="/creditbank/student/login/save">
                <div class="form-group">
                    <label for="exampleInputEmail1">学号</label>
                    <input name="studentId" type="text" class="form-control" value="" readonly="readonly">
                </div>

                <div class="form-group" >
                    <label for="exampleInputEmail1">密码</label>
                    <input name="passWord" type="password" class="form-control" value="" readonly="readonly">
                </div>
                <div class="row">
                    <div class="col-sm-10 column"></div>
                    <div class="col-sm-2 column">
                        <button type="submit" class="btn btn-default">提交</button>
                    </div>
                </div>
            </form>
        </div>

</div>

</div>
<#include "../../common/tailer.ftl">
</body>
</html>