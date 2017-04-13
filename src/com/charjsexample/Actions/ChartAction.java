package com.charjsexample.Actions;

import java.util.ArrayList;
import java.util.List;

import com.chartjs.api.ChartJSAPI;
import com.chartjs.enums.ChartType;

public class ChartAction {
	

	ChartJSAPI charAPI;
	
	private String listJSON;

	public String getListJSON() {
		return listJSON;
	}

	public ChartAction() {
		charAPI = new ChartJSAPI();
		
	}

	public String execute()
	{
		return "SUCCESS";
	}
	
	public String getChartData()
	{
//		charAPI.autoBackgroundColor = tru;
//		charAPI.autoBackgroundColor = false;
//		charAPI.chartType =  ChartType.BAR_CHART.getValue();
		
		
//		charAPI.chartType = chartBean.getChartType();
//		charAPI.title = chartBean.getTitle();
		charAPI.chartType = ChartType.BAR_CHART.getValue();
		charAPI.data = new Integer[] {30,20,30,40,50};
		charAPI.legends = new String[] {"Test1","Test2","Test3","Test4","Test5"};
		listJSON = charAPI.getChartData();
		
		return "SUCCESS";
		
	}

}
