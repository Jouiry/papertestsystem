<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="teachertop.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 修改试题 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/question/update" modelAttribute="question"  id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <input hidden="hidden" type="text" name="queId" value="${question.queId}"/>
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
                                <span class="title">题型：</span>
                                <div class="li_r">
                                    <select name="queType">
                                        <c:forEach items="${types}" var="type">
                                            <c:if test="${question.queType==type.typeId}">
                                                <option value="${type.typeId}" selected="selected">${type.typeName}</option>
                                            </c:if>
                                            <c:if test="${question.queType!=type.typeId}">
                                                <option value="${type.typeId}">${type.typeName}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                <span class="title">难度：</span>
                                <div class="li_r">
                                    <select name="queDif">
                                        <c:forEach items="${difs}" var="dif">
                                            <c:if test="${question.queDif==dif.difId}">
                                                <option value="${dif.difId}" selected="selected">${dif.difName}</option>
                                            </c:if>
                                            <c:if test="${question.queDif!=dif.difId}">
                                                <option value="${dif.difId}">${dif.difName}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                <span class="title">章节：</span>
                                <div class="li_r">
                                    <select name="queChap">
                                        <c:forEach items="${chapters}" var="chapter">
                                            <c:if test="${question.queChap==chapter.chapterId}">
                                                <option value="${chapter.chapterId}" selected="selected">${chapter.chapterName}</option>
                                            </c:if>
                                            <c:if test="${question.queChap!=chapter.chapterId}">
                                                <option value="${chapter.chapterId}">${chapter.chapterName}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                    <i>*</i>
                                </div>
                            </div>
                        </div>
                        <div class="section row">
                            <div>
                                <span class="title">知识点：</span>
                                <div class="li_r">
                                    <select name="pointId">
                                        <c:forEach items="${points}" var="point">
                                            <c:if test="${question.pointId==point.pointId}">
                                                <option value="${point.pointId}" selected="selected">${point.pointName}</option>
                                            </c:if>
                                            <c:if test="${point.chapterId!=point.pointId}">
                                                <option value="${point.pointId}">${point.pointName}</option>
                                            </c:if>
                                        </c:forEach>
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