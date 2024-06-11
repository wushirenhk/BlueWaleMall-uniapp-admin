<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<li class="first"><a href="javascript:searchHot('中性笔')">中性笔</a></li>
			<li><a href="javascript:searchHot('钢笔')">钢笔</a></li>
			<li><a href="javascript:searchHot('荧光笔')">荧光笔</a></li>
			<li><a href="javascript:searchHot('铅笔')">铅笔</a></li>
			<li><a href="javascript:searchHot('修正带')">修正带</a></li>
			<li><a href="javascript:searchHot('软抄本')">软抄本</a></li>
			<li><a href="javascript:searchHot('活页本')">活页本</a></li>
			<li><a href="javascript:searchHot('便签纸')">便签纸</a></li>
			<li><a href="javascript:searchHot('水彩笔')">水彩笔</a></li>
			<li><a href="javascript:searchHot('油画棒')">油画棒</a></li>
			<li><a href="javascript:searchHot('硬卡纸')">硬卡纸</a></li>
			<li><a href="javascript:searchHot('白板笔')">白板笔</a></li>
			<li><a href="javascript:searchHot('胶带')">胶带</a></li>
			<li class="last"><input type="text" id="selectname" value="${search_words }" /><a href="javascript:selectname()" >&nbsp;&nbsp;搜索</a></li>
		</ul>
	</div>
</div>