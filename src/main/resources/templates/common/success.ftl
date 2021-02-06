<html>
<head>
    <meta charset="utf-8">
    <title>成功提示</title>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="alert alert-dismissable alert-success">
<#--                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>-->
                <strong>${msg!""}</strong><a href="${url}" class="alert-link" id="time"></a>
            </div>
        </div>
    </div>
</div>

</body>

<script>
    setTimeout('location.href="${url}"', 0);
</script>

</html>