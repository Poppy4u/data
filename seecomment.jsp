<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="shortcut icon" href="/StudentInfo/utils/image/favicon.ico"
          type="image/x-icon"/>
    <meta charset="UTF-8">
    <title>学生信息管理系统</title>

    <script type="text/javascript" src="/StudentInfo/utils/js/jquery-3.3.1.min.js"></script>
    <!-- Loading Bootstrap -->
    <link href="/StudentInfo/utils/css/vendor/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Flat UI Pro -->
    <link href="/StudentInfo/utils/css/flat-ui.css" rel="stylesheet">
    <!-- Loading Flat UI JS -->
    <script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.min.js"></script>
    <script type='text/javascript' src='/StudentInfo/utils/scripts/particles.js'></script>
    <link href="/StudentInfo/utils/css/animate.css" rel="stylesheet">
</head>
<body>
<div id="particles-js">
    <canvas class="particles-js-canvas-el" width="1322" height="774" style="width: 100%; height: 100%;"></canvas>
</div>
<jsp:include page="teacherLeft.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-12">
                    <h5>查看学生评价</h5>
                    <div class="margin:0 15px" style="overflow-x: scroll;">
                        <table style="overflow: scroll;"
                               class="table table-striped table-hover animated fadeIn">
                            <tr>
                                <th>学生姓名</th>
                                <th>评星(最多5星)</th>
                                <th>评价内容</th>
                                <th>评价时间</th>
                            </tr>
                            <c:forEach var="comment" items="${commentList}">
                                <tr>
                                    <td>${comment.sname }</td>
                                    <td>${comment.score }颗星</td>
                                    <td style="white-space: normal;"><p>${comment.content }</p></td>
                                    <td>${comment.ctime }</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- 显示分页信息 -->
    <!-- 显示分页信息 -->
    <div class="row">
        <!--分页文字信息  -->
        <div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
            页,总 ${pageInfo.total } 条记录
        </div>
        <!-- 分页条信息 -->
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination bg-primary">
                    <li>
                        <a href="/StudentInfo/coursecomment/query/${cid}/1">首页</a>
                    </li>
                    <c:if test="${pageInfo.hasPreviousPage }">
                        <li>
                            <a href="/StudentInfo/coursecomment/query/${cid}/${pageInfo.pageNum-1}"
                               aria-label="Previous"> <span aria-hidden="true">«</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${page_Num }</a></li>
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li>
                                <a href="/StudentInfo/coursecomment/query/${cid}/${page_Num}">${page_Num }</a>
                            </li>
                        </c:if>

                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                            <a href="/StudentInfo/coursecomment/query/${cid}/${pageInfo.pageNum+1}"
                               aria-label="Next"> <span aria-hidden="true">»</span>
                            </a></li>
                    </c:if>
                    <li>
                        <a href="/StudentInfo/coursecomment/query/${cid}/${pageInfo.pages}">末页</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>

</div>
<script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script>
<script src="/StudentInfo/utils/scripts/bganimation.js"></script>
</body>
</html>