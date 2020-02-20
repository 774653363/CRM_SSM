﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
$(function(){
	
	
	var url = "${pageContext.request.contextPath}/findByTypeCodeDictionary?dict_type_code=001";
	var data = {};
	$.post(url,data,function(result){
		json=JSON.parse(result);
		$.each(json,function(i,n){
			$("#cust_industry").append("<option value ='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
		});
		
		$("#cust_industry option[value='${customer.cust_industry.dict_id}']").attr("selected","selected");
		
	});
	
	var url = "${pageContext.request.contextPath}/findByTypeCodeDictionary?dict_type_code=002";
	var data = {};
	$.post(url,data,function(result){
		json=JSON.parse(result);
		$.each(json,function(i,n){
			$("#cust_source").append("<option value ='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
		});
		
		$("#cust_source option[value='${customer.cust_source.dict_id}']").attr("selected","selected");
		
	});
	
	var url = "${pageContext.request.contextPath}/findByTypeCodeDictionary?dict_type_code=006";
	var data = {};
	$.post(url,data,function(result){
		json=JSON.parse(result);
		$.each(json,function(i,n){
			$("#cust_level").append("<option value ='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
		});
		
		$("#cust_level option[value='${customer.cust_level.dict_id}']").attr("selected","selected");
		
	});
	
	
});

</script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1 enctype="multipart/form-data"
		action="${pageContext.request.contextPath }/updateCustomer"
		method=post>
		<input type="hidden" name="cust_id" value="${customer.cust_id }"/>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; 修改客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id=sChannel2
											style="WIDTH: 180px" maxLength=50 name="cust_name" value="${customer.cust_name }">
								</td>
								<td>客户级别 ：</td>
								<td>
								<select id="cust_level" name="cust_level.dict_id" >
								</select>
								</td>
							</TR>
							
							<TR>
								<td>信息来源：</td>
								<td>
								<select id="cust_source" name="cust_source.dict_id" >
								</select>
								</td>
								<td>联系人：</td>
								<td>
								<select id="cust_industry" name="cust_industry.dict_id" >
								</select>
								</td>
							</TR>
							<TR>
								
								
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_phone" value="${customer.cust_phone }">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_mobile" value="${customer.cust_mobile }">
								</td>
							</TR>
							
							<!-- 
							
							<TR>
								<td>联系地址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custAddress" value="${customerDetail.custAddress }">
								</td>
								<td>邮政编码 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custZip" value="${customerDetail.custZip }">
								</td>
							</TR>
							<TR>
								<td>客户传真 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custFax" value="${customerDetail.custFax }">
								</td>
								<td>客户网址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custWebsite" value="${customerDetail.custWebsite }">
								</td>
							</TR>
							
							 -->
							 <TR>
								
								
								<td>联系人 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="cust_linkman" value="${customer.cust_linkman }">
								</td>
								<td></td>
								<td>
									
								</td>
							</TR>
							<TR>
								<td colspan="4">
									<img alt="图片不见啦" src="${pageContext.request.contextPath }/${customer.cust_image }" id="image" width="200px" height="200px">
								</td>
							</TR>
							
							
							<TR>
								<td>客户资质 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2 type="hidden"
														style="WIDTH: 180px" maxLength=50 name="cust_image" value="${customer.cust_image }">
														
								<INPUT class=textbox id=sChannel2 type="file"
														style="WIDTH: 180px" maxLength=50 name="upload">
								</td>
								<td></td>
								<td>
								</td>
							</TR>
							
						
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
