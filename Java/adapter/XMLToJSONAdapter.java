package adapter;

import adapter.tool.JSONAnalyticsTool;

public class XMLToJSONAdapter implements AnalyticsTool {

    // Adaptee's object
    private final JSONAnalyticsTool jsonAnalyticsTool;

    public XMLToJSONAdapter(String xmlData) {
        jsonAnalyticsTool = new JSONAnalyticsTool();
        // Logic to convert the XML data to JSON
        System.out.println("Converting XML data to JSON data");
        String newData = xmlData + " in JSON";
        // set the data in Adaptee
        jsonAnalyticsTool.setJsonData(newData);
    }

    @Override
    public void analyseData() {
        // call the analytics tool
        jsonAnalyticsTool.analyzeTool();
    }
}
