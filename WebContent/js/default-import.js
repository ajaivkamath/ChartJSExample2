
    function chartLoadScript(ctx, result) {
        //var ctx = document.getElementById("chart-area").getContext("2d");

        var randomScalingFactor = Math.round(Math.random() * 100);
        
        //$.ajax({
        	  //url: "chartData.action",
        	  //method: "GET",
        	  //success: function(result){
        		  //result = decodeURI(result);


       			  var str = HtmlEncode(result);
       			  var json = JSON.parse(str);
        		  console.log(json);

        //		  var labelRec = json.data.labels; 
        	//	  var dataRec = json.data.datasets[0].data;

        		//  console.log(labelRec);
        		 // console.log(dataRec);

					var config2 = json;        		  
        		  //console.log(config2);
        		    
        		  //window.myPie = new Chart(ctx, config);
        		  window.myPie = new Chart(ctx, config2);
        		  //alert(1);  	      
        	//  }
        	  
        	  
        	//});        
        
       // alert("result3");
        
    };

    
    function HtmlEncode(s)
    {
      var el = document.createElement("div");
      return $('<div/>').html(s).text();;
    }    
