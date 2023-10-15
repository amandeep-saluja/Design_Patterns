package adapter;

import adapter.tool.JSONAnalyticsTool;

public class Main {
    public static void main(String[] args) {
        String data = "XML Data";
        JSONAnalyticsTool analyticsTool = new JSONAnalyticsTool();
        analyticsTool.setJsonData(data);
        analyticsTool.analyzeTool();

        System.out.println("----------------------------------------");

        AnalyticsTool tool = new XMLToJSONAdapter(data);
        tool.analyseData();
    }
}
