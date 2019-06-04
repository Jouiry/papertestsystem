<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="teachertop.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 修改知识点 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/point/update" modelAttribute="point"  id="admin-form" name="addForm">
                    <input hidden="hidden" type="text" name="pointId" value="${point.pointId}"/>
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 知识点信息 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="pointName" class="field prepend-icon">
                                    <form:input path="pointName" cssClass="gui-input" placeholder="知识点名称..."/>
                                    <label for="pointName" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div>
                                    <%--<form:input path="chapterId" cssClass="gui-input" placeholder="所属章节..." />--%>
                                <span class="title">所属章节：</span>
                                <div class="li_r">
                                    <select name="chapterId">
                                        <c:forEach items="${chapters}" var="chapter">
                                            <c:if test="${point.chapterId==chapter.chapterId}">
                                                <option value="${chapter.chapterId}" selected="selected">${chapter.chapterName}</option>
                                            </c:if>
                                            <c:if test="${point.chapterId!=chapter.chapterId}">
                                                <option value="${chapter.chapterId}">${chapter.chapterName}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        </div>
                            <%--<div class="section">--%>
                            <%--<label for="address" class="field prepend-icon">--%>
                            <%--<form:input path="address" cssClass="gui-input" placeholder="地址..." />--%>
                            <%--<label for="address" class="field-icon">--%>
                            <%--<i class="fa fa-lock"></i>--%>
                            <%--</label>--%>
                            <%--</label>--%>
                            <%--</div>--%>
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