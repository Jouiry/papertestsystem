<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="teachertop.jsp"/>

<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 试卷列表 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel  heading-border">
                <div class="panel-menu">
                    <div class="row">
                        <div class="hidden-xs hidden-sm col-md-3">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-refresh"></i>
                                </button>
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-trash"></i>
                                </button>
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-plus" onclick="javascript:window.location.href='/question/to_add';"></i>
                                </button>
                            </div>
                        </div>
                        <div class="col-xs-12 col-md-9 text-right">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-chevron-left"></i>
                                </button>
                                <button type="button" class="btn btn-default light">
                                    <i class="fa fa-chevron-right"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel-body pn">
                    <table id="message-table" class="table admin-form theme-warning tc-checkbox-1">
                        <thead>
                        <tr class="">
                            <th class="text-center hidden-xs">Select</th>
                            <th class="hidden-xs">试卷编号</th>
                            <th class="hidden-xs">试卷名称</th>
                            <th class="hidden-xs">出题人</th>
                            <th class="hidden-xs">创建时间</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="paper">
                        <tr class="message-unread">
                            <td class="hidden-xs">
                                <label class="option block mn">
                                    <input type="checkbox" name="mobileos" value="FR">
                                    <span class="checkbox mn"></span>
                                </label>
                            </td>
                            <td>${paper.paperId}</td>
                            <td>${paper.paperName}</td>
                            <td>${paper.teacher.teaName}</td>
                            <%--<td>${paper.paperDate}</td>--%>
                            <td>
                                <fmt:formatDate value="${paper.paperDate}" pattern="yyyy-MM-dd HH:mm"/>
                            </td>
                            <%--<td>--%>
                                    <%--<div class="wrap" title="${question.queItem}">${question.queItem}</div>--%>
                            <%--</td>--%>
                            <%--<td>--%>
                                <%--<div  style="width: 100px; " class="wrap" title="${question.queAns}">${question.queAns}</div>--%>
                            <%--</td>--%>
                            <td>
                                <a href="/paper/query?id=${paper.paperId}"><button class="btn btn-primary btn-sm edit_btn">
                                    <span class="glyphicon glyphicon-pencil">编辑</span>
                                </button></a>
                                <a href="/paper/remove?id=${paper.paperId}"><button class="btn btn-danger btn-sm delete_btn">
                                    <span class="glyphicon glyphicon-trash">删除</span>
                                </button></a>
                                &nbsp;&nbsp;

                                <%--<button class="btn btn-danger btn-sm delete_btn">--%>
                                    <%--<span class="glyphicon glyphicon-cloud-download">添加</span>--%>
                                <%--</button>--%>
                            </td>
                        </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>