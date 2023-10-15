package adapter.tool;

/**
 * JSON Analytics Tool
 * expects JSON Data
 * Adaptee
 */
public class JSONAnalyticsTool {

    private String jsonData;

    public void analyzeTool() {
        if(jsonData.contains("JSON")) {
            System.out.println("Analytics JSON Data - "+jsonData);
        }
        else {
            System.out.println("Not correct format. Can't analyse!");
        }
    }

    public void setJsonData(String pJsonData) {
        this.jsonData = pJsonData;
    }
}
