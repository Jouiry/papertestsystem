<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=8" >
    <title>修改学生</title>
    <link rel="stylesheet" type="text/css" href="../css/reset.css"/>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <link rel="stylesheet" type="text/css" href="../css/thems.css">
    <script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            //自适应屏幕宽度
            window.onresize=function(){ location=location };

            var main_h = $(window).height();
            $('.hy_list').css('height',main_h-45+'px');

            var main_w = $(window).width();
            $('.xjhy').css('width',main_w-40+'px');

        });
    </script>
</head>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 修改学生 </h2>
            <p class="lead"></p>
        </div>
        <form action="/student/update" method="post" name="addForm" modelAttribute="student"  id="admin-form">
            <input type="hidden" name="stuId" value="${student.stuId}"/>
            <div class="xjhy">
                <!--高级配置-->
                <ul class="hypz gjpz clearfix">
                    <li class="clearfix">
                        <span class="title">姓名：</span>
                        <div class="li_r">
                            <input class="chang" name="stuName" type="text" value="${student.stuName}"/>
                            <i>*</i>
                        </div>
                    </li>
                    <li class="clearfix">
                        <span class="title">班级：</span>
                        <div class="li_r">
                            <select name="stuClass">
                                <c:forEach items="${Clazzes}" var="clazz">
                                    <c:if test="${student.stuClass==clazz.classId}">
                                        <option value="${clazz.classId}" selected="selected">${clazz.className}</option>
                                    </c:if>
                                    <c:if test="${student.stuClass!=clazz.classId}">
                                        <option value="${clazz.classId}">${clazz.className}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                            <i>*</i>
                        </div>
                    </li>
                    <li class="clearfix">
                        <span class="title">密码：</span>
                        <div class="li_r">
                            <input class="chang" name="stuPwd" type="text" value="${student.stuPwd}"/>
                        </div>
                    </li>
                    <li class="clearfix">
                        <span class="title">性别：</span>
                        <div class="li_r">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="radio">
                                <input name="stuGender" type="radio" value="男" checked="checked"/>
                                <em>男</em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                 <c:if test="${student.stuGender=='女'}">
                                     <input name="stuGender" type="radio" value="女" checked="checked"/>
                                     <em>女</em>
                                 </c:if>
                            <c:if test="${student.stuGender!='女'}">
                                <input name="stuGender" type="radio" value="女"/>
                                <em>女</em>
                            </c:if>
                                </span>

                        </div>
                    </li>
                    <%--<li class="clearfix">--%>
                    <%--<span class="title">身份证号：</span>--%>
                    <%--<div class="li_r">--%>
                    <%--<input class="chang" name="idNumber" type="text" value="${OBJ.idNumber}"/>--%>
                    <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="clearfix">--%>
                    <%--<span class="title">出生日期：</span>--%>
                    <%--<div class="li_r">--%>
                    <%--<input class="chang" name="bornDate" type="text" value="<fmt:formatDate value="${OBJ.bornDate}" pattern="yyyy-MM-dd"/>"/>--%>
                    <%--</div>--%>
                    <%--</li>--%>
                    <%--<li class="clearfix">--%>
                    <%--<span class="title">备注：</span>--%>
                    <%--<div class="li_r">--%>
                    <%--<input class="chang" name="info" type="text" value="${OBJ.info}"/>--%>
                    <%--</div>--%>
                    <%--</li>--%>
                    <li class="tj_btn">
                        <a href="javascript:addForm.submit();">保存</a>
                        <%--<a href="javascript:history.go(-1);" class="back">返回</a>--%>
                        <button type="submit" class="button"> 保存 </button>
                        <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回 </button>
                    </li>
                </ul>
                <!--高级配置-->
            </div>
        </form>
    </div>
</section>

<jsp:include page="bottom.jsp"/>



