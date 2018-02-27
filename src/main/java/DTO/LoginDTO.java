package DTO;

/**
 * Created by liudap on 2017/12/23.
 */
public class LoginDTO {

    private String ip;

    private String nickname;

    private String uid;


    private RiskDO riskDO;

    public LoginDTO(RiskDO riskDO) {

    }


    public RiskDO getRiskDO() {
        return riskDO;
    }

    public void setRiskDO(RiskDO riskDO) {
        this.riskDO = riskDO;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
