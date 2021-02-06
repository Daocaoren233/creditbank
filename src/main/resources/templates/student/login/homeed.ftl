<html>
<#include "../../common/header.ftl">
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" method="post" action="/creditbank/student/login/save">
                <div class="form-group">
                    <label for="exampleInputEmail1">类目名字</label>
                    <input name="studentId" type="text" class="form-control" value="182219605206">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">类目名字</label>
                    <input name="studentName" type="text" class="form-control" value="柏广成">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">类目类型</label>
                    <input name="passWord" type="password" class="form-control" value="123456">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">类目类型</label>
                    <input name="sex" type="text" class="form-control" value=0>
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">类目类型</label>
                    <input name="studentPhone" type="text" class="form-control" value="123456">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail1">类目类型</label>
                    <input name="studentMajor" type="text" class="form-control" value="123456">
                </div>

                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>


</div>

<#include "../../common/tailer.ftl">
</body>
</html>