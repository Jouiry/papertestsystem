<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    function change(){
            var chapId = $("#queChap").val().trim();
            $("#pointId").empty();
            $("#pointId").append('<option value="-1">'+"请选择知识点..."+'</option>')
            $.ajax({
                type: 'POST',
                url:"<%=request.getContextPath() %>/question/getPoints",
                data:{
                    "chapId":chapId
                },
                success:function(data){
                    $(data).each(function(index){
                        $("#pointId").append(
                            '<option value="'+data[index].pointId+'">'+data[index].pointName+'</option>'
                        );
                    });
                }
            })
    }
</script>
<jsp:include page="teachertop.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 添加试题 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/question/add" modelAttribute="question"  id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 试题信息 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                    <form:input path="queItem" cssClass="gui-input" placeholder="题目内容..."/>
                            </div>
                            <div class="col-md-6">
                                    <form:input path="queAns" cssClass="gui-input" placeholder="题目答案..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <%--<textarea name="desc" cols="50" rows="5" required="required"></textarea>--%>
                                    <form:input path="queA" cssClass="gui-input" placeholder="选择A..."/>
                            </div>
                            <div class="col-md-6">
                                    <form:input path="queB" cssClass="gui-input" placeholder="选择B..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                    <form:input path="queC" cssClass="gui-input" placeholder="选项C..."/>
                            </div>
                            <div class="col-md-6">
                                    <form:input path="queD" cssClass="gui-input" placeholder="选项D..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span class="title">题型：</span>
                                <div class="li_r">
                                    &nbsp;&nbsp;&nbsp;&nbsp;<select name="queType">
                                        <option value="-1" selected>请选择题型...</option>
                                        <c:forEach items="${types}" var="type">
                                            <option value="${type.typeId}">${type.typeName}</option>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span class="title">难度：</span>
                                <div class="li_r">
                                    &nbsp;&nbsp;&nbsp;&nbsp;<select name="queDif">
                                        <option value="-1" selected>请选择难度...</option>
                                        <c:forEach items="${difs}" var="dif">
                                            <option value="${dif.difId}">${dif.difName}</option>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span class="title">章节：</span>
                                <div class="li_r">
                                    &nbsp;&nbsp;&nbsp;&nbsp; <select id="queChap" name="queChap" onchange="change()">
                                        <option value="-1" selected>请选择章节...</option>
                                        <c:forEach items="${chapters}" var="chapter">
                                            <option value="${chapter.chapterId}">${chapter.chapterName}</option>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                &nbsp;&nbsp;&nbsp;&nbsp;<span class="title">知识点：</span>
                                <div class="li_r">
                                    &nbsp;&nbsp;&nbsp;&nbsp;<select id="pointId" name="pointId">
                                        <option value="-1" selected>请选择知识点...</option>
                                        <%--<c:forEach items="${points}" var="point">--%>
                                            <%--<option value="${point.pointId}">${point.pointName}</option>--%>
                                        <%--</c:forEach>--%>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>

                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 保存 </button>
                            <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回 </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>