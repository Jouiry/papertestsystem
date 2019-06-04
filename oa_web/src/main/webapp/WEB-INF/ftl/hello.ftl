<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>试卷</title>
</head>
<body>
<h2 style="text-align: center">${paper.paperName}</h2><br>
<h3 style="text-align: center">出卷人：${paper.teacher.teaName}</h3><br>
注意事项：1.考前请将密封线内线清楚；
2.所有答案请直接答在试卷上；
3.考试形式：闭卷；
4.本试卷分为三部分，选择、填空、计算；满分100分，考试时间120分钟。
<br><br>
<table width="800px" border="1px" bordercolor="#000000" cellspacing="0px" style="border-collapse:collapse;text-align: center;margin: auto">
    <tr>
        <td>题号</td>
        <td>一</td>
        <td>二</td>
        <td>三</td>
        <td>总分</td>
    </tr>
    <tr>
        <td>得分</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td>评卷人</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>
<button style="margin: auto" type="button" class="login_btn" onclick="javascrtpt:window.location.href='${springMacroRequestContext.getContextPath()}/paper/create?id=${paper.paperId?c}'">打印</button>
<button style="margin: auto" type="button" class="login_btn" onclick="javascript:window.history.go(-1);"> 返回 </button>
<h4>一、选择题</h4>
<h5 style="word-wrap: break-word;word-break: normal">
    <#list XuanZhes as xuanzhe>
        ${xuanzhe_index + 1}、${xuanzhe.queItem}<a href="/paper/delete?pid=${paper.paperId?c}&qid=${xuanzhe.queId?c}">删除</a><br>
        A、${xuanzhe.queA}<br>
        B、${xuanzhe.queB}<br>
        C、${xuanzhe.queC}<br>
        D、${xuanzhe.queD}<br>
    </#list>
</h5>
<h4>二、填空题</h4>
<h5>
    <#list TianKongs as tiankong>
        ${tiankong_index + 1}、${tiankong.queItem}<a href="/paper/delete?pid=${paper.paperId?c}&qid=${tiankong.queId?c}">删除</a>    <br>
    </#list>
</h5>
<h4>三、计算题</h4>
<h5>
    <#list JiSuans as jisuan>
        ${jisuan_index + 1}、${jisuan.queItem}<a href="/paper/delete?pid=${paper.paperId?c}&qid=${jisuan.queId?c}">删除</a><br>
    </#list>
</h5>
</body>
</html>