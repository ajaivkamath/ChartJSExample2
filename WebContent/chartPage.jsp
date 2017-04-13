<%@ taglib uri="/struts-tags" prefix="s" %>

<html>



<head>
    <title>Pie Chart</title>
    <script src="js/Chart.bundle.js"></script>
    <script src="js/jquery.min.js"></script>
    <script src="js/utils.js"></script>
    <script src="js/default-import.js"></script>
</head>

<body>
	<s:hidden id="strDataCtl" name="strDataCtl" value="%{listJSON}" />
    <div id="canvas-holder" style="width:40%">
        <canvas id="chart-area" />
    </div>
    
    <script>
        var ctx = document.getElementById("chart-area").getContext("2d");
        var str = HtmlEncode(document.getElementById("strDataCtl").value);
        chartLoadScript(ctx, str);       
        
       // alert("result3");

    </script>
</body>
</html>
