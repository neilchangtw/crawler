package ptt.crawler.modle;

public class Board {

    /**
     * 儲存 PTT 中的看板資訊
     */

    private String url;         // 看板網址
    private String nameCN;      // 中文名稱
    private String nameEN;      // 英文名稱
    private Boolean adultCheck; // 成年檢查

    public Board(String url, String nameCN, String nameEN, Boolean adultCheck) {
        this.url = url;
        this.nameCN = nameCN;
        this.nameEN = nameEN;
        this.adultCheck = adultCheck;
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

    public String getNameCN() { return nameCN; }

    public void setNameCN(String nameCN) { this.nameCN = nameCN; }

    public String getNameEN() { return nameEN; }

    public void setNameEN(String nameEN) { this.nameEN = nameEN; }

    public Boolean getAdultCheck() { return adultCheck; }

    public void setAdultCheck(Boolean adultCheck) { this.adultCheck = adultCheck; }

}
