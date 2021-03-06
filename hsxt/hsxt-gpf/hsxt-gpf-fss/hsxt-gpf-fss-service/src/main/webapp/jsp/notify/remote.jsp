<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Matrix Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="${path}/css/bootstrap.min.css" />
<link rel="stylesheet" href="${path}/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="${path}/css/uniform.css" />
<link rel="stylesheet" href="${path}/css/select2.css" />
<link rel="stylesheet" href="${path}/css/matrix-style.css" />
<link rel="stylesheet" href="${path}/css/matrix-media.css" />
<link href="${path}/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.useso.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Welcome User</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
        <li class="divider"></li>
        <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
        <li class="divider"></li>
        <li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
      </ul>
    </li>
    <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> new message</a></li>
        <li class="divider"></li>
        <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> inbox</a></li>
        <li class="divider"></li>
        <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> outbox</a></li>
        <li class="divider"></li>
        <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> trash</a></li>
      </ul>
    </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>

<!--start-top-serch-->
<div id="search">
  <input type="text" placeholder="Search here..."/>
  <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch--> 

<!--sidebar-menu-->

<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Remote Notifies</a>
  <ul>
    <li><a href="${path}/index.jsp"><i class="icon icon-home"></i> <span>Home</span></a> </li>
    <li><a href="local.jsp"><i class="icon icon-th"></i> <span>Local Notifies</span></a></li>
    <li class="active"><a href="remote.jsp"><i class="icon icon-th"></i> <span>Remote Notifies</span></a></li>
  </ul>
</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Remote Notifies</a> </div>
    <h1>Remote Notifies</h1>
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>Data table</h5>
          </div>
          <div class="widget-content nopadding">
            <table id="remote-data-table" class="table table-bordered">
              <thead>
              <tr>
                <th>no</th>
                <th>notifyNo</th>
                <th>fromSys</th>
                <th>toSys</th>
                <th>notifyTime</th>
                <th>purpose</th>
                <th>fileCount</th>
                <th>received</th>
                <th>allCompleted</th>
                <th>completedTime</th>
                <th>allPass</th>
                <th>remark</th>
                <th>createTime</th>
                <th>operation</th>
              </tr>
              </thead>
              <tbody>
              <tr><td colspan="14">sorry,no data !</td></tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12">         2015 &copy; GuiYi Admin. FSS - Collect from
    <a href="https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=1257661962,3777215241&fm=58" title="CHENMIN" target="_blank">CHENMIN</a>
  </div>
</div>
<!--end-Footer-part-->
<script type="text/javascript">
  var Root = '<%=request.getContextPath()%>';
</script>
<script src="${path}/js/common/jquery.min.js"></script>
<script src="${path}/js/common/jquery.ui.custom.js"></script>
<script src="${path}/js/common/bootstrap.min.js"></script>
<script src="${path}/js/common/jquery.uniform.js"></script>
<script src="${path}/js/common/select2.min.js"></script>
<script src="${path}/js/common/jquery.dataTables.min.js"></script>
<script src="${path}/js/common/matrix.js"></script>
<script src="${path}/js/notify/remote.js"></script>
</body>
</html>
