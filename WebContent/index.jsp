<%@page import="cn.ymkj.WebStudy.Webtest"%>
<%@ page language="java" contentType="text/html; charset=UTf-8"
    pageEncoding="UTf-8"%>
<!DOCTYPE html>

<html lang="zh-cn">

<head>

  <meta charset="utf-8"/>

  <meta name="viewport" content="width=device-width, initial-scale=1"/>

  <title>假期去向统计</title>

  <link href="http://lib.baomitu.com/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>

  <link href="http://lib.baomitu.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>

  <script src="http://lib.baomitu.com/modernizr/2.8.3/modernizr.min.js"></script>

  <!--[if lt IE 9]>

    <script src="//lib.baomitu.com/html5shiv/3.7.3/html5shiv.min.js"></script>

    <script src="//lib.baomitu.com/respond.js/1.4.2/respond.min.js"></script>

  <![endif]-->
 <style type="text/css">
      
        body{
    margin: 0;
    padding: 0;
    background-color: #F9F9F9;
}
        #to_top{right:20px; bottom: 108px; position: fixed; cursor: pointer;}
        </style>


</head>
<div id="paymsg">
<div>


<div class="col-xs-12 col-sm-10 col-md-8 col-lg-4 center-block " style="float: none;background-color: #fff">

  <br />

    <div class="widget">

<!-- 
<div class="widget-content themed-background-flat text-center" >
<img  src=".\images\1.jpg" height="100%" width="100%" />
    </div>

    <hr>
<div class="widget-content themed-background-flat text-center" >
<img  src=".\images\QQ图片20180929175901.jpg" height="100%" width="100%" />
    </div> 
-->

    <div class="block">
    	<hr>
                <form action="servlet" method="get">

                    <div class="form-group">

                        <div class="input-group">

                            <div class="input-group-addon">
                            	<i class="fa fa-circle-thin"></i>
                                选择学校
                            </div>

                            <select name="kind" class="form-control">
                            	<option>天津电子信息职业技术学院</option>
                            	<option>天津中德应用技术大学</option>
                            	<option>天津现代职业技术学院</option>
                            	<option>天津轻工职业技术学院</option>
                            	<option>天津职业大学(海河园)</option>
                            	<option>天津交通职业学院</option>
                            	<option>天津商务职业学院</option>
                            	<option>天津城市职业学院</option>
                            	<option>天津海运职业学院</option>
                            	<option>天津机电职业技术学院</option>
                            </select>

                        </div>

                    </div>

                    <div class="form-group">
                        <div class="input-group">

                            <div class="input-group-addon">
                                <i class="fa fa-heart-o"></i>
                                宿舍楼
                            </div>
                            <select name="lounum" class="form-control">
                                <option>1号楼</option><option>2号楼</option><option>3号楼</option><option>4号楼</option><option>5号楼</option><option>6号楼</option><option>7号楼</option><option>8号楼</option><option>9号楼</option><option>10号楼</option><option>                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa fa-square-o"></i>
                                宿舍号
                            </div>
                            <input type="text" name="num" class="form-control col-xs-1 col-sm-1" required
                                   data-parsley-length="[2,10]"
                                   placeholder="精确到床号">

                        </div>

                    </div>

					<div class="form-group">

                        <div class="input-group">

                            <div class="input-group-addon">
                            	<i class="fa fa-user-o"></i>
                                真实姓名

                            </div>

                            <input type="text" name="name" class="form-control" required placeholder="输入您的名字">

                        </div>

                    </div>

					<div class="form-group">

                        <div class="input-group">

                            <div class="input-group-addon">
                            	<i class="fa fa-gg"></i>
                                手机号

                            </div>

                            <input type="text" name="phone" class="form-control" required placeholder="输入您的手机号">

                        </div>

                    </div>

                    <div class="form-group">

                        <div class="input-group">

                            <div class="input-group-addon">
                            	<i class="fa fa-diamond"></i>
                                假期去向情况
                                </div>
                                <input type="text" name="thing" class="form-control" required placeholder="输入假期去向">

                            </div>

                            

                        </div>

                    </div>

                    <input type="submit" value="提交信息" class="btn btn-primary btn-block" style="background-color: #0188E2">

                </form>

        </div>

	</div>
    <div id="codemsg"></div>
      <div class="modal-footer">
      
      </div>

    </div>

  </div>

</div>
</div>


<script src="//lib.baomitu.com/jquery/1.12.4/jquery.min.js"></script>

<script src="//lib.baomitu.com/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="//lib.baomitu.com/layer/2.3/layer.js"></script>

<script>
	layer.open({
   	title: '公告'
  	,content: '为了学生安全，请学生准确填写信息！！！'
  	,offset: '280px'
  	,anim: 1
});
</script>
</body>
</html>