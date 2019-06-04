<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="teachertop.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 智能组卷 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/paper/add" modelAttribute="paper"  id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 试卷参数 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                    <form:input path="paperId" cssClass="gui-input" placeholder="试卷编号..."/>
                            </div>
                            <div class="col-md-6">
                                    <form:input path="paperName" cssClass="gui-input" placeholder="试卷名称..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="难度系数..."/>
                            </div>
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="试卷总分..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="选择题个数..."/>
                            </div>
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="选择题分值..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="填空题个数..."/>
                            </div>
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="填空题分值..."/>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="计算题个数..."/>
                            </div>
                            <div class="col-md-6">
                                <form:input path="" cssClass="gui-input" placeholder="计算题分值..."/>
                            </div>
                        </div>


                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 组卷 </button>
                            <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回 </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>