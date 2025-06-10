<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script><meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"><link rel="shortcut icon" href="/StudentInfo/utils/image/favicon.ico" type="image/x-icon" />
<meta charset="UTF-8">
<title>学生信息管理系统</title>

<!-- 标题图标、CSS、js、jQ 
<link href="/online/image/favicon.ico" rel="shortcut icon">
<link rel="stylesheet" type="text/css" href="/online/css/main.css">
<script src="/online/js/fun.js" type="text/javascript"></script>-->
<script type="text/javascript" src="/StudentInfo/utils/js/jquery-3.3.1.min.js"></script>
<!-- Loading Bootstrap -->
<link href="/StudentInfo/utils/css/vendor/bootstrap.min.css" rel="stylesheet">
<!-- Loading Flat UI Pro -->
<link href="/StudentInfo/utils/css/flat-ui.css" rel="stylesheet">
<!-- Loading Flat UI JS -->
<script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.min.js"></script>

<script type='text/javascript' src='/StudentInfo/utils/scripts/particles.js'></script><link href="/StudentInfo/utils/css/animate.css" rel="stylesheet"></head>


<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/StudentInfo/utils/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/StudentInfo/utils/bootstrap-rating-input-master/build/bootstrap-rating-input.min.js"></script>

<style>
	.myclass {
		color: red;
		font-size: 12px;
	}
	.yihang .rating-input {
		display: inline;
	}
</style>



<body><div id="particles-js"><canvas class="particles-js-canvas-el" width="1322" height="774" style="width: 100%; height: 100%;"></canvas></div>
<jsp:include page="studentLeft.jsp" />
<div class="container">
		<div class="row">
			<div class="col-md-12">
			<h5>查看选课结果</h5>
			<p class="alert alert-info">提示：没有教师安排的课程无法查询</p>

			<div class="row">
			<div class="col-md-12" >
						<div class="margin:0 15px" style="overflow-x: scroll;">
			<table  style="overflow:scroll;" class="table table-striped table-hover animated fadeIn">
				<tr>
					<th>课程名</th>
					<th>班级名称</th>
					<th>上课时间</th>
					<th>上课周</th>
					<th>上课教室</th>
					<th>学分</th>
					<th>学时</th>
					<th>代课老师</th>
					<th>评价</th>



				</tr>
				<c:forEach var="ssr" items="${requestScope.ssrList}"
					varStatus="loop">
					<tr>
						<td>${ssr.cname }</td>
						<td>${ssr.classr }</td>
						<td>${ssr.coursetime}</td>
						<td>${ssr.courseweek}</td>
						<td>${ssr.classroom}</td>
						<td>${ssr.credits}</td>
						<td>${ssr.period}</td>
						<td>${ssr.tname}</td>
						<td>
							<button type="button" class="btn btn-primary" onclick="showcomment('${ssr.cid}','${sessionScope.sid}')">评价</button>
						</td>
					</tr>
				</c:forEach>
			</table></div></div></div>
			</div>
		</div>
		
		
				<!-- 显示分页信息 -->
	<div class="row">
		<!--分页文字信息  -->
		<div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
			页,总 ${pageInfo.total } 条记录</div>
		<!-- 分页条信息 -->
		<div class="col-md-6">
			<nav aria-label="Page navigation">
			<ul class="pagination">
				<li><a href="/StudentInfo/StudentHandler/selcouresult/${sessionScope.sid }/1">首页</a></li>
				<c:if test="${pageInfo.hasPreviousPage }">
					<li><a href="/StudentInfo/StudentHandler/selcouresult/${sessionScope.sid }/${pageInfo.pageNum-1}"
						aria-label="Previous"> <span aria-hidden="true">«</span>
					</a></li>
				</c:if>
 
				<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
					<c:if test="${page_Num == pageInfo.pageNum }">
						<li class="active"><a href="#">${page_Num }</a></li>
					</c:if>
					<c:if test="${page_Num != pageInfo.pageNum }">
						<li><a href="/StudentInfo/StudentHandler/selcouresult/${sessionScope.sid }/${page_Num }">${page_Num }</a></li>
					</c:if>
 
				</c:forEach>
				<c:if test="${pageInfo.hasNextPage }">
					<li><a href="/StudentInfo/StudentHandler/selcouresult/${sessionScope.sid }/${pageInfo.pageNum+1 }"
						aria-label="Next"> <span aria-hidden="true">»</span>
					</a></li>
				</c:if>
				<li><a href="/StudentInfo/StudentHandler/selcouresult/${sessionScope.sid }/${pageInfo.pages}">末页</a></li>
			</ul>
			</nav>
		</div>
	</div>

</div>

<!-- Button trigger modal -->
<button style="display: none" type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
	Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<p class="yihang">评星: <input type="number" name="your_awesome_parameter" id="score" class="rating" value="3"/></p>
				<p>评价: <textarea id="content"></textarea></p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" onclick="addcomment()">提交</button>
			</div>
		</div>
	</div>
</div>
	
<script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script>
<script src="/StudentInfo/utils/scripts/bganimation.js"></script>
<script type="text/javascript">
	let cid = ''
	let sid = ${sessionScope.sid};
	let score = 3
	function showcomment (_cid) {
		cid = _cid
		$('#exampleModal').modal('show')
	}
	function addcomment() {
		let content = $('#content').val()
		console.log(sid,cid,score,content)
		let data = 'sid='+sid+'&cid='+cid+'&score='+score+'&content='+content
		console.log(data)
		$.ajax({
			type: "POST",
			url: '/StudentInfo/coursecomment/add',
			data: data,
			dataType: "text",
			success: function (data) {
				alert("添加成功");
				// todo 关闭窗口
				$('#exampleModal').modal('hide')
				$('#content').val('')
			},
			error: function (data) {
				console.log(data);
				alert("err");
			}
		})
	}
	$('#score').on('change', function(){
		// alert("Changed: " + $(this).val())
		score = $(this).val()
	});
</script>
</body>
</html>