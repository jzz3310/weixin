package com.jzz.button;

/**
 * @author:jzz
 * @date:2020/6/30
 */
public class ClickButton extends AbstractButton{
    private String type = "click";
    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ClickButton(String name,String key) {
        super(name);
        this.key = key;
    }
}
