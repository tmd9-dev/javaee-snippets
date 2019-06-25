package xyz.tmd9.test;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class TestBean implements Serializable {
    private String str = "tmt";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
