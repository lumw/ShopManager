<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.manager.entity.User" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>创建店铺</title>
		<!-- basic styles -->

		<link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="<%=path%>/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="<%=path%>/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<link rel="stylesheet" href="<%=path%>/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="<%=path%>/css/jquery.gritter.css" />

		<!-- fonts -->

		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

		<!-- ace styles -->

		<link rel="stylesheet" href="<%=path%>/css/ace.min.css" />
		<link rel="stylesheet" href="<%=path%>/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="<%=path%>/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="<%=path%>/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<style>
			.spinner-preview {
				width:100px;
				height:100px;
				text-align:center;
				margin-top:60px;
			}
			
			.dropdown-preview {
				margin:0 5px;
				display:inline-block;
			}
			.dropdown-preview  > .dropdown-menu {
				display: block;
				position: static;
				margin-bottom: 5px;
			}
		</style>

		<!-- ace settings handler -->

		<script src="<%=path%>/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="<%=path%>/js/html5shiv.js"></script>
		<script src="<%=path%>/js/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
		 <div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
			<div class="main-container-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
					</script>

					<ul class="breadcrumb">
						<li>
							<i class="icon-desktop"></i>
							<a href="#">店铺</a>
						</li>
	
						<li>
							<a href="#">新建店铺</a>
						</li>
					</ul><!-- .breadcrumb -->

					<!--<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="icon-search nav-search-icon"></i>
							</span>
						</form>
					</div> #nav-search -->
				</div>
				<div class="row">
					<div class="col-sm-12">
						<s:form action="addShop" cssClass="form-horizontal" id="shopForm" method="post">
							<s:hidden name="shop.userID" value="%{#session.userInfo.userID}"></s:hidden>
							<div class="tabbable">
								<ul class="nav nav-tabs" id="myTab">
									<li class="active">
										<a data-toggle="tab" href="#baseInfo">
											基本信息
										</a>
									</li>
									<li>
										<a data-toggle="tab" href="#profile">
											Messages
											<span class="badge badge-danger">4</span>
										</a>
									</li>
	
									<!-- <li class="dropdown">
										<a data-toggle="dropdown" class="dropdown-toggle" href="#">
											Dropdown &nbsp;
											<i class="icon-caret-down bigger-110 width-auto"></i>
										</a>
	
										<ul class="dropdown-menu dropdown-info">
											<li>
												<a data-toggle="tab" href="#dropdown1">@fat</a>
											</li>
	
											<li>
												<a data-toggle="tab" href="#dropdown2">@mdo</a>
											</li>
										</ul>
									</li>
									 -->
								</ul>
	
								<div class="tab-content">
									<div id="baseInfo" class="tab-pane in active">
										<div class="form-group">
											<label class="col-sm-1" for="shopName">店铺名称</label>
											<s:textfield cssClass="col-sm-3" id="shopName" name="shop.shopName" value="" maxLength="30"></s:textfield>
											<!-- <input class="col-sm-3" type="text" maxlength="30" id="shopName" name="shop.shopName" value="" placeholder="店铺名称"/> -->
										</div>
										<div class="form-group">
											<label class="col-sm-1" for="contactPhone">联系电话</label>
											<s:textfield cssClass="col-sm-3" id="contactPhone" name="shop.telphone" value="" maxlength="20"></s:textfield>
											<!-- <input class="col-sm-3" type="text" maxlength="20" id="shopAdress" name="contactPhone" value="" placeholder="联系电话"/> -->
										</div>
										<div class="form-group">
											<label class="col-sm-1" for="shopAdress">店铺地址</label>
											<s:textarea cssClass="col-sm-3" id="shopAdress" rows="5" name="shop.address" value="" wrap="true"></s:textarea>
											<!-- <textarea class="col-sm-3" rows="5" type="text" maxlength="256" id="shopAdress" name="shopAdress" value="" placeholder="店铺地址"></textarea> -->
										</div>
										<div class="form-group">
											<label class="col-sm-1" for="shopNotice">店铺公告</label>
											<s:textarea cssClass="col-sm-3" id="shopNotice" rows="5" name="shop.notice" value="" wrap="true"></s:textarea>
											<!-- <textarea class="col-sm-3" rows="5" maxlength="2048" id="shopNotice" name="shopNotice" value="" placeholder="店铺公告"></textarea> -->
										</div>
									</div>
	
									<div id="profile" class="tab-pane">
										<p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.</p>
									</div>
									<!-- 
									<div id="dropdown1" class="tab-pane">
										<p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade.</p>
									</div>
	
									<div id="dropdown2" class="tab-pane">
										<p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin.</p>
									</div>
									 -->
								</div>
							</div>
							
								<div class="col-md-offset-3 col-md-9">
									<s:submit cssClass="btn btn-info" type="submit" value="保存"></s:submit>
									<!-- <button class="btn btn-info" type="submit" >
										<i class="icon-ok bigger-110"></i>
										保存
									</button>
									 -->
								</div>
						</s:form>
					</div><!-- /span -->
				</div><!-- /row -->
			</div><!--  /.main-container-inner -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
			<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
		<![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
			window.jQuery || document.write("<script src='<%=path%>/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
 			window.jQuery || document.write("<script src='<%=path%>/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='<%=path%>/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="<%=path%>/js/bootstrap.min.js"></script>
		<script src="<%=path%>/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="<%=path%>/js/excanvas.min.js"></script>
		<![endif]-->

		<script src="<%=path%>/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="<%=path%>/js/jquery.ui.touch-punch.min.js"></script>
		<script src="<%=path%>/js/bootbox.min.js"></script>
		<!-- <script src="<%=path%>/js/jquery.easy-pie-chart.min.js"></script> -->
		<script src="<%=path%>/js/jquery.gritter.min.js"></script>

		<!-- ace scripts -->

		<script src="<%=path%>/js/ace-elements.min.js"></script>
		<script src="<%=path%>/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			jQuery(function($) {
				/**
				$('#myTab a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
				  console.log(e.target.getAttribute("href"));
				})
				*/
			
				/**
				$('#accordion-style').on('click', function(ev){
					var target = $('input', ev.target);
					var which = parseInt(target.val());
					if(which == 2) $('#accordion').addClass('accordion-style2');
					 else $('#accordion').removeClass('accordion-style2');
				});
				*/
			
				var oldie = /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase());
				/**
				$('.easy-pie-chart.percentage').each(function(){
					$(this).easyPieChart({
						barColor: $(this).data('color'),
						trackColor: '#EEEEEE',
						scaleColor: false,
						lineCap: 'butt',
						lineWidth: 8,
						animate: oldie ? false : 1000,
						size:75
					}).css('color', $(this).data('color'));
				});
				
				$('[data-rel=tooltip]').tooltip();
				$('[data-rel=popover]').popover({html:true});
				
			
				$('#gritter-regular').on(ace.click_event, function(){
					$.gritter.add({
						title: 'This is a regular notice!',
						text: 'This will fade out after a certain amount of time. Vivamus eget tincidunt velit. Cum sociis natoque penatibus et <a href="#" class="blue">magnis dis parturient</a> montes, nascetur ridiculus mus.',
						image: $path_assets+'/avatars/avatar1.png',
						sticky: false,
						time: '',
						class_name: (!$('#gritter-light').get(0).checked ? 'gritter-light' : '')
					});
			
					return false;
				});
				
				$('#gritter-sticky').on(ace.click_event, function(){
					var unique_id = $.gritter.add({
						title: 'This is a sticky notice!',
						text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus eget tincidunt velit. Cum sociis natoque penatibus et <a href="#" class="red">magnis dis parturient</a> montes, nascetur ridiculus mus.',
						image: $path_assets+'/avatars/avatar.png',
						sticky: true,
						time: '',
						class_name: 'gritter-info' + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
					});
			
					return false;
				});
				
			
				$('#gritter-without-image').on(ace.click_event, function(){
					$.gritter.add({
						// (string | mandatory) the heading of the notification
						title: 'This is a notice without an image!',
						// (string | mandatory) the text inside the notification
						text: 'This will fade out after a certain amount of time. Vivamus eget tincidunt velit. Cum sociis natoque penatibus et <a href="#" class="orange">magnis dis parturient</a> montes, nascetur ridiculus mus.',
						class_name: 'gritter-success' + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
					});
			
					return false;
				});
				
			
				$('#gritter-max3').on(ace.click_event, function(){
					$.gritter.add({
						title: 'This is a notice with a max of 3 on screen at one time!',
						text: 'This will fade out after a certain amount of time. Vivamus eget tincidunt velit. Cum sociis natoque penatibus et <a href="#" class="green">magnis dis parturient</a> montes, nascetur ridiculus mus.',
						image: $path_assets+'/avatars/avatar3.png',
						sticky: false,
						before_open: function(){
							if($('.gritter-item-wrapper').length >= 3)
							{
								return false;
							}
						},
						class_name: 'gritter-warning' + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
					});
			
					return false;
				});
				
			
				$('#gritter-center').on(ace.click_event, function(){
					$.gritter.add({
						title: 'This is a centered notification',
						text: 'Just add a "gritter-center" class_name to your $.gritter.add or globally to $.gritter.options.class_name',
						class_name: 'gritter-info gritter-center' + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
					});
			
					return false;
				});
				
				
				$('#gritter-error').on(ace.click_event, function(){
					$.gritter.add({
						title: 'This is a warning notification',
						text: 'Just add a "gritter-light" class_name to your $.gritter.add or globally to $.gritter.options.class_name',
						class_name: 'gritter-error' + (!$('#gritter-light').get(0).checked ? ' gritter-light' : '')
					});
			
					return false;
				});
				
					
			
				$("#gritter-remove").on(ace.click_event, function(){
					$.gritter.removeAll();
					return false;
				});
				
			
				///////
			
			
				$("#bootbox-regular").on(ace.click_event, function() {
					bootbox.prompt("What is your name?", function(result) {
						if (result === null) {
							//Example.show("Prompt dismissed");
						} else {
							//Example.show("Hi <b>"+result+"</b>");
						}
					});
				});
				
					
				$("#bootbox-confirm").on(ace.click_event, function() {
					bootbox.confirm("Are you sure?", function(result) {
						if(result) {
							//
						}
					});
				});
				
				$("#bootbox-options").on(ace.click_event, function() {
					bootbox.dialog({
						message: "<span class='bigger-110'>I am a custom dialog with smaller buttons</span>",
						buttons: 			
						{
							"success" :
							 {
								"label" : "<i class='icon-ok'></i> Success!",
								"className" : "btn-sm btn-success",
								"callback": function() {
									//Example.show("great success");
								}
							},
							"danger" :
							{
								"label" : "Danger!",
								"className" : "btn-sm btn-danger",
								"callback": function() {
									//Example.show("uh oh, look out!");
								}
							}, 
							"click" :
							{
								"label" : "Click ME!",
								"className" : "btn-sm btn-primary",
								"callback": function() {
									//Example.show("Primary button");
								}
							}, 
							"button" :
							{
								"label" : "Just a button...",
								"className" : "btn-sm"
							}
						}
					});
				});
				
			
			
				$('#spinner-opts small').css({display:'inline-block', width:'60px'})
			
				var slide_styles = ['', 'green','red','purple','orange', 'dark'];
				var ii = 0;
				$("#spinner-opts input[type=text]").each(function() {
					var $this = $(this);
					$this.hide().after('<span />');
					$this.next().addClass('ui-slider-small').
					addClass("inline ui-slider-"+slide_styles[ii++ % slide_styles.length]).
					css({'width':'125px'}).slider({
						value:parseInt($this.val()),
						range: "min",
						animate:true,
						min: parseInt($this.data('min')),
						max: parseInt($this.data('max')),
						step: parseFloat($this.data('step')),
						slide: function( event, ui ) {
							$this.attr('value', ui.value);
							spinner_update();
						}
					});
				});
			
			
			
			
			
				$.fn.spin = function(opts) {
					this.each(function() {
					  var $this = $(this),
						  data = $this.data();
			
					  if (data.spinner) {
						data.spinner.stop();
						delete data.spinner;
					  }
					  if (opts !== false) {
						data.spinner = new Spinner($.extend({color: $this.css('color')}, opts)).spin(this);
					  }
					});
					return this;
				};
			
				function spinner_update() {
					var opts = {};
					$('#spinner-opts input[type=text]').each(function() {
						opts[this.name] = parseFloat(this.value);
					});
					$('#spinner-preview').spin(opts);
				}
			
			
			
				$('#id-pills-stacked').removeAttr('checked').on('click', function(){
					$('.nav-pills').toggleClass('nav-stacked');
				});
				*/
			
			});
		</script>
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
	</body>
</html>
