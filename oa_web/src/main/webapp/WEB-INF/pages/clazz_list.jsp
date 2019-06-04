<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="top.jsp"/>

<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 班级列表 </h2>
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
                                    <i class="fa fa-plus" onclick="javascript:window.location.href='/clazz/to_add';"></i>
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
                            <th class="hidden-xs">班级编号</th>
                            <th class="hidden-xs">班级名称</th>
                            <%--<th class="hidden-xs">地址</th>--%>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="clazz">
                        <tr class="message-unread">
                            <td class="hidden-xs">
                                <label class="option block mn">
                                    <input type="checkbox" name="mobileos" value="FR">
                                    <span class="checkbox mn"></span>
                                </label>
                            </td>
                            <td>${clazz.classId}</td>
                            <td>${clazz.className}</td>
                            <%--<td>${dept.address}</td>--%>
                            <td>
                                <a href="/clazz/to_update?id=${clazz.classId}"><button class="btn btn-primary btn-sm edit_btn">
                                    <span class="glyphicon glyphicon-pencil">编辑</span>
                                </button></a>
                                <a href="/clazz/remove?id=${clazz.classId}"><button class="btn btn-danger btn-sm delete_btn">
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